// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assignment Collection Page.
 */
public class ManagedEBookAssignmentCollectionPage extends BaseCollectionPage<ManagedEBookAssignment, ManagedEBookAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for ManagedEBookAssignment
     *
     * @param response the serialized ManagedEBookAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedEBookAssignmentCollectionPage(final ManagedEBookAssignmentCollectionResponse response, final ManagedEBookAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
