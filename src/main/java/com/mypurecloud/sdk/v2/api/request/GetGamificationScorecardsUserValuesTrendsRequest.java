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

public class GetGamificationScorecardsUserValuesTrendsRequest {
    
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public GetGamificationScorecardsUserValuesTrendsRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private LocalDate startWorkday;
	public LocalDate getStartWorkday() {
		return this.startWorkday;
	}

	public void setStartWorkday(LocalDate startWorkday) {
		this.startWorkday = startWorkday;
	}

	public GetGamificationScorecardsUserValuesTrendsRequest withStartWorkday(LocalDate startWorkday) {
	    this.setStartWorkday(startWorkday);
	    return this;
	} 
	
	private LocalDate endWorkday;
	public LocalDate getEndWorkday() {
		return this.endWorkday;
	}

	public void setEndWorkday(LocalDate endWorkday) {
		this.endWorkday = endWorkday;
	}

	public GetGamificationScorecardsUserValuesTrendsRequest withEndWorkday(LocalDate endWorkday) {
	    this.setEndWorkday(endWorkday);
	    return this;
	} 
	
	private String timeZone;
	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public GetGamificationScorecardsUserValuesTrendsRequest withTimeZone(String timeZone) {
	    this.setTimeZone(timeZone);
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

    public GetGamificationScorecardsUserValuesTrendsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
        }
        
        // verify the required parameter 'startWorkday' is set
        if (this.startWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
        }
        
        // verify the required parameter 'endWorkday' is set
        if (this.endWorkday == null) {
            throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/gamification/scorecards/users/{userId}/values/trends")
                .withPathParameter("userId", userId)
        
                .withQueryParameters("startWorkday", "", startWorkday)
        
                .withQueryParameters("endWorkday", "", endWorkday)
        
                .withQueryParameters("timeZone", "", timeZone)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String userId, LocalDate startWorkday, LocalDate endWorkday) {
	    return new Builder()
	            .withRequiredParams(userId, startWorkday, endWorkday);
	}
	

	public static class Builder {
		private final GetGamificationScorecardsUserValuesTrendsRequest request;

		private Builder() {
			request = new GetGamificationScorecardsUserValuesTrendsRequest();
		}

		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withStartWorkday(LocalDate startWorkday) {
			request.setStartWorkday(startWorkday);
			return this;
		}
		
		public Builder withEndWorkday(LocalDate endWorkday) {
			request.setEndWorkday(endWorkday);
			return this;
		}
		
		public Builder withTimeZone(String timeZone) {
			request.setTimeZone(timeZone);
			return this;
		}
		

		
		public Builder withRequiredParams(String userId, LocalDate startWorkday, LocalDate endWorkday) {
			request.setUserId(userId);
						request.setStartWorkday(startWorkday);
						request.setEndWorkday(endWorkday);
			
			return this;
		}
		

		public GetGamificationScorecardsUserValuesTrendsRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
            }
            
            // verify the required parameter 'startWorkday' is set
            if (request.startWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'startWorkday' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
            }
            
            // verify the required parameter 'endWorkday' is set
            if (request.endWorkday == null) {
                throw new IllegalStateException("Missing the required parameter 'endWorkday' when building request for GetGamificationScorecardsUserValuesTrendsRequest.");
            }
            
			return request;
		}
	}
}
