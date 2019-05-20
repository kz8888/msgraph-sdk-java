// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SecureScoreControlProfile;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Secure Score Control Profile Collection Page.
 */
public class SecureScoreControlProfileCollectionPage extends BaseCollectionPage<SecureScoreControlProfile, ISecureScoreControlProfileCollectionRequestBuilder> implements ISecureScoreControlProfileCollectionPage {

    /**
     * A collection page for SecureScoreControlProfile
     *
     * @param response the serialized SecureScoreControlProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SecureScoreControlProfileCollectionPage(final SecureScoreControlProfileCollectionResponse response, final ISecureScoreControlProfileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
