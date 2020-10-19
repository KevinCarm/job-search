package org.example.jobsearch.api;

import org.example.jobsearch.JobPosition;

import java.util.List;
import java.util.Map;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface APIJobs {
    @RequestLine("GET /positions.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryStrings);
}
