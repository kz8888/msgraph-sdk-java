// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Collection Page.
 */
public class ContactFolderCollectionPage extends BaseCollectionPage<ContactFolder, ContactFolderCollectionRequestBuilder> {

    /**
     * A collection page for ContactFolder
     *
     * @param response the serialized ContactFolderCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContactFolderCollectionPage(final ContactFolderCollectionResponse response, final ContactFolderCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
