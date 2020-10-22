// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.requests.extensions.CallCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CallCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Collection Page.
 */
public class CallCollectionPage extends BaseCollectionPage<Call, CallCollectionRequestBuilder> {

    /**
     * A collection page for Call
     *
     * @param response the serialized CallCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CallCollectionPage(final CallCollectionResponse response, final CallCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
