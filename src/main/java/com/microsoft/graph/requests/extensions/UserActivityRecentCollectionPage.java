// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserActivity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityRecentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserActivityRecentCollectionPage;
import com.microsoft.graph.requests.extensions.UserActivityRecentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Recent Collection Page.
 */
public class UserActivityRecentCollectionPage extends BaseCollectionPage<UserActivity, UserActivityRecentCollectionRequestBuilder> {

    /**
     * A collection page for UserActivity.
     *
     * @param response The serialized UserActivityRecentCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserActivityRecentCollectionPage(final UserActivityRecentCollectionResponse response, final UserActivityRecentCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
