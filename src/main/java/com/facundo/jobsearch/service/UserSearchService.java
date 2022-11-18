package com.facundo.jobsearch.service;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface UserSearchService {
    static <T> T buildAPI(Class<T> javaClass, String url) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(javaClass, url);
    }
}
