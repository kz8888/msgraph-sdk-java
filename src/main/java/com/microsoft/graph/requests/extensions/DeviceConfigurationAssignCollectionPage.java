// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assign Collection Page.
 */
public class DeviceConfigurationAssignCollectionPage extends BaseCollectionPage<DeviceConfigurationAssignment, DeviceConfigurationAssignCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationAssignment.
     *
     * @param response The serialized DeviceConfigurationAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceConfigurationAssignCollectionPage(final DeviceConfigurationAssignCollectionResponse response, final DeviceConfigurationAssignCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
