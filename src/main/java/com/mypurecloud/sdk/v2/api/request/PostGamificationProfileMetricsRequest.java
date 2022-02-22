package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.Leaderboard;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OverallBestPoints;
import com.mypurecloud.sdk.v2.model.Metric;
import com.mypurecloud.sdk.v2.model.MetricDefinition;
import com.mypurecloud.sdk.v2.model.GetMetricDefinitionsResponse;
import com.mypurecloud.sdk.v2.model.GetMetricsResponse;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import com.mypurecloud.sdk.v2.model.GetMetricResponse;
import com.mypurecloud.sdk.v2.model.GetProfilesResponse;
import com.mypurecloud.sdk.v2.model.WorkdayMetricListing;
import com.mypurecloud.sdk.v2.model.AttendanceStatusListing;
import com.mypurecloud.sdk.v2.model.UserBestPoints;
import com.mypurecloud.sdk.v2.model.AllTimePoints;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAveragePoints;
import com.mypurecloud.sdk.v2.model.WorkdayPointsTrend;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrend;
import com.mypurecloud.sdk.v2.model.SingleWorkdayAverageValues;
import com.mypurecloud.sdk.v2.model.GamificationStatus;
import com.mypurecloud.sdk.v2.model.ObjectiveTemplate;
import com.mypurecloud.sdk.v2.model.GetTemplatesResponse;
import com.mypurecloud.sdk.v2.model.CreatePerformanceProfile;

public class PostGamificationProfileMetricsRequest {
    
	private String profileId;
	public String getProfileId() {
		return this.profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public PostGamificationProfileMetricsRequest withProfileId(String profileId) {
	    this.setProfileId(profileId);
	    return this;
	} 
	
	private Metric body;
	public Metric getBody() {
		return this.body;
	}

	public void setBody(Metric body) {
		this.body = body;
	}

	public PostGamificationProfileMetricsRequest withBody(Metric body) {
	    this.setBody(body);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public PostGamificationProfileMetricsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Metric> withHttpInfo() {
        
        // verify the required parameter 'profileId' is set
        if (this.profileId == null) {
            throw new IllegalStateException("Missing the required parameter 'profileId' when building request for PostGamificationProfileMetricsRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostGamificationProfileMetricsRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/gamification/profiles/{profileId}/metrics")
                .withPathParameter("profileId", profileId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String profileId, Metric body) {
	    return new Builder()
	            .withRequiredParams(profileId, body);
	}
	

	public static class Builder {
		private final PostGamificationProfileMetricsRequest request;

		private Builder() {
			request = new PostGamificationProfileMetricsRequest();
		}

		
		public Builder withProfileId(String profileId) {
			request.setProfileId(profileId);
			return this;
		}
		
		public Builder withBody(Metric body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String profileId, Metric body) {
			request.setProfileId(profileId);
						request.setBody(body);
			
			return this;
		}
		

		public PostGamificationProfileMetricsRequest build() {
            
            // verify the required parameter 'profileId' is set
            if (request.profileId == null) {
                throw new IllegalStateException("Missing the required parameter 'profileId' when building request for PostGamificationProfileMetricsRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostGamificationProfileMetricsRequest.");
            }
            
			return request;
		}
	}
}
