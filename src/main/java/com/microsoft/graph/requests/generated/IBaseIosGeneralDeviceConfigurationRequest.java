// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.IosGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Ios General Device Configuration Request.
 */
public interface IBaseIosGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the IosGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosGeneralDeviceConfiguration> callback);

    /**
     * Gets the IosGeneralDeviceConfiguration from the service
     *
     * @return the IosGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IosGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosGeneralDeviceConfiguration with a source
     *
     * @param sourceIosGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosGeneralDeviceConfiguration sourceIosGeneralDeviceConfiguration, final ICallback<IosGeneralDeviceConfiguration> callback);

    /**
     * Patches this IosGeneralDeviceConfiguration with a source
     *
     * @param sourceIosGeneralDeviceConfiguration the source object with updates
     * @return the updated IosGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosGeneralDeviceConfiguration patch(final IosGeneralDeviceConfiguration sourceIosGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration, final ICallback<IosGeneralDeviceConfiguration> callback);

    /**
     * Posts a IosGeneralDeviceConfiguration with a new object
     *
     * @param newIosGeneralDeviceConfiguration the new object to create
     * @return the created IosGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosGeneralDeviceConfiguration post(final IosGeneralDeviceConfiguration newIosGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosGeneralDeviceConfigurationRequest expand(final String value);

}
