// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookApplicationCalculateRequest;
import com.microsoft.graph.models.WorkbookApplication;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookApplicationCalculateParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Application Calculate Request Builder.
 */
public class WorkbookApplicationCalculateRequestBuilder extends BaseActionRequestBuilder<WorkbookApplication> {

    private WorkbookApplicationCalculateParameterSet body;
    /**
     * The request builder for this WorkbookApplicationCalculate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookApplicationCalculateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookApplicationCalculateParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookApplicationCalculateRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookApplicationCalculateRequest instance
     */
    @Nonnull
    public WorkbookApplicationCalculateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookApplicationCalculateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookApplicationCalculateRequest instance
     */
    @Nonnull
    public WorkbookApplicationCalculateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookApplicationCalculateRequest request = new WorkbookApplicationCalculateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}