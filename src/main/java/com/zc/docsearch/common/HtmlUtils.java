package com.zc.docsearch.common;

import com.zc.docsearch.entity.HtmlEntity;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Date;

/**
 * @author zengchao
 * Created by zengchao on 2018/4/13.
 */
public class HtmlUtils {

    public static HtmlEntity getHtmlPage(String url,int timeOut) throws IOException {
        Connection connection = Jsoup.connect(url).timeout(timeOut);
        Document document = connection.get();
        HtmlEntity html=new HtmlEntity();
        html.setTitle(document.title());
        html.setContent(document.data());
        html.setUrl(url);
        html.setCreateDate(new Date());
        return html;
    }

    /**
     *
     * @param url
     * @param timeOut
     * @return
     */
    public static HtmlEntity getHtmlPageByGoogle(String url,int timeOut) throws IOException {
        Connection connection = Jsoup.connect(url).timeout(timeOut);
        connection.header("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
        Document document = connection.get();
        HtmlEntity html=new HtmlEntity();
        html.setTitle(document.title());
        html.setContent(document.data());
        html.setUrl(url);
        html.setCreateDate(new Date());
        return html;
    }
}
