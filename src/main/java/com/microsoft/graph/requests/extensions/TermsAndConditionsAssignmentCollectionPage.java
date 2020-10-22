// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Assignment Collection Page.
 */
public class TermsAndConditionsAssignmentCollectionPage extends BaseCollectionPage<TermsAndConditionsAssignment, TermsAndConditionsAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for TermsAndConditionsAssignment
     *
     * @param response the serialized TermsAndConditionsAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TermsAndConditionsAssignmentCollectionPage(final TermsAndConditionsAssignmentCollectionResponse response, final TermsAndConditionsAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
