// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.requests.extensions.IWorkbookNamedItemRangeRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Named Item Range Request.
 */
public interface IWorkbookNamedItemRangeRequest {

    /**
     * Patches the WorkbookNamedItemRange
     *
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    void patch(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Patches the WorkbookNamedItemRange
     *
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRange patch(WorkbookRange srcWorkbookRange) throws ClientException;

    /**
     * Puts the WorkbookNamedItemRange
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback);

    /**
     * Puts the WorkbookNamedItemRange
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     WorkbookRange put(WorkbookRange srcWorkbookRange) throws ClientException;
    /**
     * Gets the WorkbookRange
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookRange> callback);

    /**
     * Gets the WorkbookRange
     *
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WorkbookRange get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookNamedItemRangeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookNamedItemRangeRequest expand(final String value);

}
