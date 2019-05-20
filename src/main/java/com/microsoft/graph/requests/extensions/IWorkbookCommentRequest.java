// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookComment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Comment Request.
 */
public interface IWorkbookCommentRequest extends IHttpRequest {

    /**
     * Gets the WorkbookComment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookComment> callback);

    /**
     * Gets the WorkbookComment from the service
     *
     * @return the WorkbookComment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookComment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookComment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookComment with a source
     *
     * @param sourceWorkbookComment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookComment sourceWorkbookComment, final ICallback<WorkbookComment> callback);

    /**
     * Patches this WorkbookComment with a source
     *
     * @param sourceWorkbookComment the source object with updates
     * @return the updated WorkbookComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookComment patch(final WorkbookComment sourceWorkbookComment) throws ClientException;

    /**
     * Posts a WorkbookComment with a new object
     *
     * @param newWorkbookComment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookComment newWorkbookComment, final ICallback<WorkbookComment> callback);

    /**
     * Posts a WorkbookComment with a new object
     *
     * @param newWorkbookComment the new object to create
     * @return the created WorkbookComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookComment post(final WorkbookComment newWorkbookComment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookCommentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookCommentRequest expand(final String value);

}

