package com.zc.docsearch;

import com.zc.docsearch.common.DateTimeUtils;
import com.zc.docsearch.common.HtmlUtils;
import com.zc.docsearch.entity.HtmlEntity;
import com.zc.docsearch.service.OrderService;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DocSearchApplicationTests {

	@Autowired
	private RestHighLevelClient client;
	@Autowired
    private OrderService orderService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testGetHtml() throws IOException {
        HtmlEntity html = HtmlUtils.getHtmlPageByGoogle("https://www.jianshu.com/p/2315dda64ad2", 5000);
        System.out.println(html);
    }

    @Test
	public void getIndexTest(){
		GetRequest request=new GetRequest("store","product","4");
		try {
            GetResponse response = client.get(request);
            System.out.println(response);
        } catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
    public void insertIndex() throws IOException {
        BulkResponse response = orderService.insertBatch(DateTimeUtils.string2Date("20180418", "yyyyMMdd"));
        System.out.println(response);
    }

    @Test
	public void insertIndexBatch(){
		//2016-8-24
		for (int year=2015;year<=2018;year++){
			for (int month=1;month<=12;month++){
				System.out.println("download data is year="+year+"month="+month);
				orderService.insertBatch(year,month);
			}
		}
	}

}
