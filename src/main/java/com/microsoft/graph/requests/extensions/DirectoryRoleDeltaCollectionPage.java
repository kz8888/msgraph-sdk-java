// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRole;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryRoleDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryRoleDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryRoleDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Delta Collection Page.
 */
public class DirectoryRoleDeltaCollectionPage extends DeltaCollectionPage<DirectoryRole, DirectoryRoleDeltaCollectionRequestBuilder> {

    /**
     * A collection page for DirectoryRole.
     *
     * @param response The serialized DirectoryRoleDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DirectoryRoleDeltaCollectionPage(final DirectoryRoleDeltaCollectionResponse response, final DirectoryRoleDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }
}
