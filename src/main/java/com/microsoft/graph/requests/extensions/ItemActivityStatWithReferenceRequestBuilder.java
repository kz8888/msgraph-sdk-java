// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat With Reference Request Builder.
 */
public class ItemActivityStatWithReferenceRequestBuilder extends BaseRequestBuilder implements IItemActivityStatWithReferenceRequestBuilder {

    /**
     * The request builder for the ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IItemActivityStatWithReferenceRequest instance
     */
    public IItemActivityStatWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IItemActivityStatWithReferenceRequest instance
     */
    public IItemActivityStatWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ItemActivityStatWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IItemActivityStatReferenceRequestBuilder reference(){
        return new ItemActivityStatReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
