// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedIOSLobApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed IOSLob App Request Builder.
 */
public class ManagedIOSLobAppRequestBuilder extends BaseRequestBuilder<ManagedIOSLobApp> {

    /**
     * The request builder for the ManagedIOSLobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedIOSLobAppRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedIOSLobAppRequest instance
     */
    @Nonnull
    public ManagedIOSLobAppRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedIOSLobAppRequest instance
     */
    @Nonnull
    public ManagedIOSLobAppRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedIOSLobAppRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the MobileAppAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppAssignmentCollectionRequestBuilder assignments() {
        return new MobileAppAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new MobileAppAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppCategoryCollectionWithReferencesRequestBuilder categories() {
        return new MobileAppCategoryCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppCategoryWithReferenceRequestBuilder categories(@Nonnull final String id) {
        return new MobileAppCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppContent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppContentCollectionRequestBuilder contentVersions() {
        return new MobileAppContentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppContent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppContentRequestBuilder contentVersions(@Nonnull final String id) {
        return new MobileAppContentRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions") + "/" + id, getClient(), null);
    }
}