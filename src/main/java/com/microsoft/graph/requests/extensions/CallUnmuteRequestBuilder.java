// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallUnmuteRequest;
import com.microsoft.graph.requests.extensions.CallUnmuteRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Unmute Request Builder.
 */
public class CallUnmuteRequestBuilder extends BaseActionRequestBuilder implements ICallUnmuteRequestBuilder {

    /**
     * The request builder for this CallUnmute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param clientContext the clientContext
     */
    public CallUnmuteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the ICallUnmuteRequest
     *
     * @return the ICallUnmuteRequest instance
     */
    public ICallUnmuteRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ICallUnmuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICallUnmuteRequest instance
     */
    public ICallUnmuteRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        CallUnmuteRequest request = new CallUnmuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
