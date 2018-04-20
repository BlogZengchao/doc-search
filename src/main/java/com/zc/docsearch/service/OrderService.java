package com.zc.docsearch.service;

import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.http.HttpUtil;
import com.xiaoleilu.hutool.json.JSONUtil;
import com.zc.docsearch.common.Constant;
import com.zc.docsearch.common.DateTimeUtils;
import com.zc.docsearch.common.SignUtils;
import com.zc.docsearch.common.XmlUtils;
import com.zc.docsearch.entity.OrderResponse;
import com.zc.docsearch.entity.OrderResult;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * @author zengchao
 * Created by zengchao on 2018/4/19.
 */
@Service
public class OrderService {

    @Autowired
    private RestHighLevelClient client;

    public OrderResponse getOrderResults(int pageNo, int pageSize, String startDate, String endDate) {
        Map<String, Object> paramMap = new HashMap<>(8);
        paramMap.put("authid", Constant.AUTHID);
        paramMap.put("timestamp", DateUtil.now());
        paramMap.put("page_no", pageNo + "");
        paramMap.put("page_size", pageSize + "");
        paramMap.put("method", "u8.trades.sw.search");
        paramMap.put("start", startDate);
        paramMap.put("end", endDate);
        String session = SignUtils.getSign(paramMap);
        paramMap.put("session", session);
        String result = HttpUtil.post(Constant.FU_URL, paramMap);
        result = XmlUtils.filterSpecialCharOfXml(result);
        //对应字段转成对象
        OrderResponse order = (OrderResponse) XmlUtils.convertXmlStrToObject(OrderResponse.class, result);
        return order;
    }

    /**
     * 批量插入某天的数据
     * @param date
     * @return
     * @throws IOException
     */
    public BulkResponse insertBatch(Date date) throws IOException {
        //获取当天的数据
        String starTime = DateTimeUtils.getStartDayStr(date,"yyyy-MM-dd").concat(" 00:00:00");
        String endTime  = DateTimeUtils.getStartDayStr(date,"yyyy-MM-dd").concat(" 23:59:59");
        List<OrderResult> orderResultList = this.getDayAllData(starTime,endTime);
        //插入数据
        BulkRequest request=new BulkRequest();
        if (orderResultList!=null){
            for (OrderResult order:orderResultList){
                String json = JSONUtil.parse(order).toString();
                request.add(new IndexRequest("fur","order").source(json,XContentType.JSON));
            }
            return client.bulk(request);
        }else {
            return null;
        }
    }

    /**
     * 批量插入整个月的数据
     * @param year 年
     * @param month 月
     * @return
     */
    public List<BulkResponse> insertBatch(int year,int month){
        List<Date> dateList = DateTimeUtils.getYearMonthTimes(year, month);
        List<BulkResponse> bulkResponseList=new LinkedList<>();
        dateList.forEach(date -> {
            try {
                BulkResponse response = this.insertBatch(date);
                bulkResponseList.add(response);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(DateTimeUtils.date2StringFormat(date,"yyyy-MM-dd HH:mm:ss"));
            }
        });
        return bulkResponseList;
    }

    /**
     * 获取一个时间段的数据
     * @param startTime 开始时间 yyyy-MM-dd HH:mm:ss
     * @param endTime 结束时间   yyyy-MM-dd HH:mm:ss
     * @return
     */
    private List<OrderResult> getDayAllData(String startTime,String endTime){
        //获取总条数
        int pageNo = 1;
        int pageSize = 100;
        OrderResponse orderResponse = this.getOrderResults(pageNo, pageSize, startTime, endTime);
        if (orderResponse.getTotalResults() == null) {
            return null;
        }
        int total= orderResponse.getTotalResults();
        //数据添加到返回列表
        List<OrderResult> list=new LinkedList<>();
        while (total > 0) {
            OrderResponse response = this.getOrderResults(pageNo, pageSize, startTime, endTime);
            List<OrderResult> tempList = response.getOrderResult();
            if (tempList!=null&&tempList.size()>0){
                list.addAll(tempList);
                total = total - tempList.size();
                pageNo = pageNo + 1;
            }else {
                break;
            }
        }
        return list;
    }
}
