// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Endpoint;
import com.microsoft.graph.requests.EndpointCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.EndpointCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint Collection Page.
 */
public class EndpointCollectionPage extends BaseCollectionPage<Endpoint, EndpointCollectionRequestBuilder> {

    /**
     * A collection page for Endpoint
     *
     * @param response the serialized EndpointCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EndpointCollectionPage(@Nonnull final EndpointCollectionResponse response, @Nonnull final EndpointCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Endpoint
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EndpointCollectionPage(@Nonnull final java.util.List<Endpoint> pageContents, @Nullable final EndpointCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}