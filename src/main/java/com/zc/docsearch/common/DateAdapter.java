package com.zc.docsearch.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换器
 * Created by zengchao on 2018/4/17.
 */
public class DateAdapter extends XmlAdapter<String, Date> {
    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date unmarshal(String v) throws Exception {
        return v == null ? null : format.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return v == null ? null : format.format(v);
    }
}
