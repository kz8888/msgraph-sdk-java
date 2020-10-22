// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.requests.extensions.TeamsAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Collection Page.
 */
public class TeamsAppCollectionPage extends BaseCollectionPage<TeamsApp, TeamsAppCollectionRequestBuilder> {

    /**
     * A collection page for TeamsApp
     *
     * @param response the serialized TeamsAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsAppCollectionPage(final TeamsAppCollectionResponse response, final TeamsAppCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
