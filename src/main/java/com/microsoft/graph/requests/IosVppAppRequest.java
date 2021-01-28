// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosVppApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Request.
 */
public class IosVppAppRequest extends BaseRequest<IosVppApp> {
	
    /**
     * The request for the IosVppApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppApp.class);
    }

    /**
     * Gets the IosVppApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosVppApp from the service
     *
     * @return the IosVppApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosVppApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosVppApp with a source
     *
     * @param sourceIosVppApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppApp> patchAsync(@Nonnull final IosVppApp sourceIosVppApp) {
        return sendAsync(HttpMethod.PATCH, sourceIosVppApp);
    }

    /**
     * Patches this IosVppApp with a source
     *
     * @param sourceIosVppApp the source object with updates
     * @return the updated IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppApp patch(@Nonnull final IosVppApp sourceIosVppApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppApp);
    }

    /**
     * Creates a IosVppApp with a new object
     *
     * @param newIosVppApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppApp> postAsync(@Nonnull final IosVppApp newIosVppApp) {
        return sendAsync(HttpMethod.POST, newIosVppApp);
    }

    /**
     * Creates a IosVppApp with a new object
     *
     * @param newIosVppApp the new object to create
     * @return the created IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppApp post(@Nonnull final IosVppApp newIosVppApp) throws ClientException {
        return send(HttpMethod.POST, newIosVppApp);
    }

    /**
     * Creates a IosVppApp with a new object
     *
     * @param newIosVppApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosVppApp> putAsync(@Nonnull final IosVppApp newIosVppApp) {
        return sendAsync(HttpMethod.PUT, newIosVppApp);
    }

    /**
     * Creates a IosVppApp with a new object
     *
     * @param newIosVppApp the object to create/update
     * @return the created IosVppApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppApp put(@Nonnull final IosVppApp newIosVppApp) throws ClientException {
        return send(HttpMethod.PUT, newIosVppApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosVppAppRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public IosVppAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
