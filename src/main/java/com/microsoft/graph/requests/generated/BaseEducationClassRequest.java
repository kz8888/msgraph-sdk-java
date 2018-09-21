// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IEducationClassRequest;
import com.microsoft.graph.requests.extensions.EducationClassRequest;
import com.microsoft.graph.models.extensions.EducationClass;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Education Class Request.
 */
public class BaseEducationClassRequest extends BaseRequest implements IBaseEducationClassRequest {

    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseEducationClassRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<EducationClass> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationClass> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @return the EducationClass from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationClass> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationClass sourceEducationClass, final ICallback<EducationClass> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationClass);
    }

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @return the updated EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass patch(final EducationClass sourceEducationClass) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationClass newEducationClass, final ICallback<EducationClass> callback) {
        send(HttpMethod.POST, callback, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationClass post(final EducationClass newEducationClass) throws ClientException {
        return send(HttpMethod.POST, newEducationClass);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationClassRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EducationClassRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationClassRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EducationClassRequest)this;
     }

}
