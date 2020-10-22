// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration State Collection Page.
 */
public class DeviceConfigurationStateCollectionPage extends BaseCollectionPage<DeviceConfigurationState, DeviceConfigurationStateCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationState
     *
     * @param response the serialized DeviceConfigurationStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationStateCollectionPage(final DeviceConfigurationStateCollectionResponse response, final DeviceConfigurationStateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
