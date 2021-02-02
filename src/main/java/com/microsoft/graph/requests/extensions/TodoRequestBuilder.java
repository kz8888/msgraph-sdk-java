// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.requests.extensions.ITodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITodoTaskListRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Request Builder.
 */
public class TodoRequestBuilder extends BaseRequestBuilder implements ITodoRequestBuilder {

    /**
     * The request builder for the Todo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITodoRequest instance
     */
    public ITodoRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITodoRequest instance
     */
    public ITodoRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TodoRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITodoTaskListCollectionRequestBuilder lists() {
        return new TodoTaskListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    public ITodoTaskListRequestBuilder lists(final String id) {
        return new TodoTaskListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
}