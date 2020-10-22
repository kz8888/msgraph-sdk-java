// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Page Collection Page.
 */
public class OnenotePageCollectionPage extends BaseCollectionPage<OnenotePage, OnenotePageCollectionRequestBuilder> {

    /**
     * A collection page for OnenotePage
     *
     * @param response the serialized OnenotePageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnenotePageCollectionPage(final OnenotePageCollectionResponse response, final OnenotePageCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
