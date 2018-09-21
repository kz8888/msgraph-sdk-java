// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Compliance Policy Assignment Collection Page.
 */
public class BaseDeviceCompliancePolicyAssignmentCollectionPage extends BaseCollectionPage<DeviceCompliancePolicyAssignment, IDeviceCompliancePolicyAssignmentCollectionRequestBuilder> implements IBaseDeviceCompliancePolicyAssignmentCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicyAssignment
     *
     * @param response the serialized BaseDeviceCompliancePolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseDeviceCompliancePolicyAssignmentCollectionPage(final BaseDeviceCompliancePolicyAssignmentCollectionResponse response, final IDeviceCompliancePolicyAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}