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

public class PutWebdeploymentsConfigurationVersionsDraftRequest {
    
	private String configurationId;
	public String getConfigurationId() {
		return this.configurationId;
	}

	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	public PutWebdeploymentsConfigurationVersionsDraftRequest withConfigurationId(String configurationId) {
	    this.setConfigurationId(configurationId);
	    return this;
	} 
	
	private WebDeploymentConfigurationVersion configurationVersion;
	public WebDeploymentConfigurationVersion getConfigurationVersion() {
		return this.configurationVersion;
	}

	public void setConfigurationVersion(WebDeploymentConfigurationVersion configurationVersion) {
		this.configurationVersion = configurationVersion;
	}

	public PutWebdeploymentsConfigurationVersionsDraftRequest withConfigurationVersion(WebDeploymentConfigurationVersion configurationVersion) {
	    this.setConfigurationVersion(configurationVersion);
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

    public PutWebdeploymentsConfigurationVersionsDraftRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<WebDeploymentConfigurationVersion> withHttpInfo() {
        
        // verify the required parameter 'configurationId' is set
        if (this.configurationId == null) {
            throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for PutWebdeploymentsConfigurationVersionsDraftRequest.");
        }
        
        // verify the required parameter 'configurationVersion' is set
        if (this.configurationVersion == null) {
            throw new IllegalStateException("Missing the required parameter 'configurationVersion' when building request for PutWebdeploymentsConfigurationVersionsDraftRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/webdeployments/configurations/{configurationId}/versions/draft")
                .withPathParameter("configurationId", configurationId)
        
                .withBody(configurationVersion)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String configurationId, WebDeploymentConfigurationVersion configurationVersion) {
	    return new Builder()
	            .withRequiredParams(configurationId, configurationVersion);
	}
	

	public static class Builder {
		private final PutWebdeploymentsConfigurationVersionsDraftRequest request;

		private Builder() {
			request = new PutWebdeploymentsConfigurationVersionsDraftRequest();
		}

		
		public Builder withConfigurationId(String configurationId) {
			request.setConfigurationId(configurationId);
			return this;
		}
		
		public Builder withConfigurationVersion(WebDeploymentConfigurationVersion configurationVersion) {
			request.setConfigurationVersion(configurationVersion);
			return this;
		}
		

		
		public Builder withRequiredParams(String configurationId, WebDeploymentConfigurationVersion configurationVersion) {
			request.setConfigurationId(configurationId);
						request.setConfigurationVersion(configurationVersion);
			
			return this;
		}
		

		public PutWebdeploymentsConfigurationVersionsDraftRequest build() {
            
            // verify the required parameter 'configurationId' is set
            if (request.configurationId == null) {
                throw new IllegalStateException("Missing the required parameter 'configurationId' when building request for PutWebdeploymentsConfigurationVersionsDraftRequest.");
            }
            
            // verify the required parameter 'configurationVersion' is set
            if (request.configurationVersion == null) {
                throw new IllegalStateException("Missing the required parameter 'configurationVersion' when building request for PutWebdeploymentsConfigurationVersionsDraftRequest.");
            }
            
			return request;
		}
	}
}
