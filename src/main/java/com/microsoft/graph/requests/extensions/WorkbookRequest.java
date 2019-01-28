// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookRequest;
import com.microsoft.graph.requests.extensions.WorkbookRequest;
import com.microsoft.graph.models.extensions.Workbook;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Request.
 */
public class WorkbookRequest extends BaseRequest implements IWorkbookRequest {
	
    /**
     * The request for the Workbook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, Workbook.class);
    }

    /**
     * Gets the Workbook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Workbook> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Workbook from the service
     *
     * @return the Workbook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Workbook> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Workbook sourceWorkbook, final ICallback<Workbook> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbook);
    }

    /**
     * Patches this Workbook with a source
     *
     * @param sourceWorkbook the source object with updates
     * @return the updated Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook patch(final Workbook sourceWorkbook) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Workbook newWorkbook, final ICallback<Workbook> callback) {
        send(HttpMethod.POST, callback, newWorkbook);
    }

    /**
     * Creates a Workbook with a new object
     *
     * @param newWorkbook the new object to create
     * @return the created Workbook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Workbook post(final Workbook newWorkbook) throws ClientException {
        return send(HttpMethod.POST, newWorkbook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRequest)this;
     }

}

