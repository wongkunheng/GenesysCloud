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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersion;
import com.mypurecloud.sdk.v2.model.WebDeploymentConfigurationVersionEntityListing;
import com.mypurecloud.sdk.v2.model.WebDeployment;
import com.mypurecloud.sdk.v2.model.WebDeploymentEntityListing;

public class GetWebdeploymentsConfigurationVersionsDraftRequest {
    
	private String configurationId;
	public String getConfigurationId() {
		return this.configurationId;
	}

	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	public GetWebdeploymentsConfigurationVersionsDraftRequest withConfigurationId(String configurationId) {
	    this.setConfigurationId(configurationId);
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

    public GetWebdeploymentsConfigurationVersionsDraftRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'configurationId' is set
        if (this.configurationId == null) {
            throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for GetWebdeploymentsConfigurationVersionsDraftRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/webdeployments/configurations/{configurationId}/versions/draft")
                .withPathParameter("configurationId", configurationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String configurationId) {
	    return new Builder()
	            .withRequiredParams(configurationId);
	}
	

	public static class Builder {
		private final GetWebdeploymentsConfigurationVersionsDraftRequest request;

		private Builder() {
			request = new GetWebdeploymentsConfigurationVersionsDraftRequest();
		}

		
		public Builder withConfigurationId(String configurationId) {
			request.setConfigurationId(configurationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String configurationId) {
			request.setConfigurationId(configurationId);
			
			return this;
		}
		

		public GetWebdeploymentsConfigurationVersionsDraftRequest build() {
            
            // verify the required parameter 'configurationId' is set
            if (request.configurationId == null) {
                throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for GetWebdeploymentsConfigurationVersionsDraftRequest.");
            }
            
			return request;
		}
	}
}
