package com.facundo.jobsearch.feign;

import com.facundo.jobsearch.dto.UserDTO;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface UserSearchFeign {
    @RequestLine("GET /user.json")
    List<UserDTO> getUsers(@QueryMap Map<String, Object> queryMap);
}
