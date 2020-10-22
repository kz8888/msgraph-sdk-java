// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookTableRowCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Collection Page.
 */
public class WorkbookTableRowCollectionPage extends BaseCollectionPage<WorkbookTableRow, WorkbookTableRowCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookTableRow
     *
     * @param response the serialized WorkbookTableRowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookTableRowCollectionPage(final WorkbookTableRowCollectionResponse response, final WorkbookTableRowCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
