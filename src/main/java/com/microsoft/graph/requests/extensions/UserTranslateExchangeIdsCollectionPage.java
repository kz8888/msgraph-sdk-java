// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionPage;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Translate Exchange Ids Collection Page.
 */
public class UserTranslateExchangeIdsCollectionPage extends BaseCollectionPage<ConvertIdResult, UserTranslateExchangeIdsCollectionRequestBuilder> {

    /**
     * A collection page for ConvertIdResult.
     *
     * @param response The serialized UserTranslateExchangeIdsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserTranslateExchangeIdsCollectionPage(final UserTranslateExchangeIdsCollectionResponse response, final UserTranslateExchangeIdsCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
