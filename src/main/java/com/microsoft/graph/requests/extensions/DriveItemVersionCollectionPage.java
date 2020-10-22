// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DriveItemVersion;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Version Collection Page.
 */
public class DriveItemVersionCollectionPage extends BaseCollectionPage<DriveItemVersion, DriveItemVersionCollectionRequestBuilder> {

    /**
     * A collection page for DriveItemVersion
     *
     * @param response the serialized DriveItemVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DriveItemVersionCollectionPage(final DriveItemVersionCollectionResponse response, final DriveItemVersionCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
