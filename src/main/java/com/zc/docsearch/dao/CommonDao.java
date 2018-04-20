package com.zc.docsearch.dao;

import org.elasticsearch.action.admin.indices.alias.Alias;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * Created by zengchao on 2018/4/19.
 */
@Repository
public class CommonDao {
    @Autowired
    private RestHighLevelClient client;

    /**
     * 创建索引
     *
     * @param index
     * @param settings
     * @return
     * @throws IOException
     */
    public CreateIndexResponse createIndex(String index, Settings settings, String mappersJson, String alias) throws IOException {
        CreateIndexRequest request = new CreateIndexRequest(index);
        if (settings != null) {
            request.settings(settings);
        }
        if (mappersJson != null && !"".equals(mappersJson)) {
            request.mapping(mappersJson, XContentType.JSON);
        }
        if (alias!=null && !"".equals(alias)){
            request.alias(new Alias(alias));
        }
        return client.indices().create(request);
    }
}
