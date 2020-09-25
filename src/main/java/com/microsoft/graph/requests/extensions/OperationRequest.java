// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Operation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Operation Request.
 */
public class OperationRequest extends BaseRequest implements IOperationRequest {
	
    /**
     * The request for the Operation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OperationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Operation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Operation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Operation.class);
    }

    /**
     * Gets the Operation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Operation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Operation from the service
     *
     * @return the Operation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Operation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Operation> callback) {
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
     * Patches this Operation with a source
     *
     * @param sourceOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Operation sourceOperation, final ICallback<? super Operation> callback) {
        send(HttpMethod.PATCH, callback, sourceOperation);
    }

    /**
     * Patches this Operation with a source
     *
     * @param sourceOperation the source object with updates
     * @return the updated Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Operation patch(final Operation sourceOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceOperation);
    }

    /**
     * Creates a Operation with a new object
     *
     * @param newOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Operation newOperation, final ICallback<? super Operation> callback) {
        send(HttpMethod.POST, callback, newOperation);
    }

    /**
     * Creates a Operation with a new object
     *
     * @param newOperation the new object to create
     * @return the created Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Operation post(final Operation newOperation) throws ClientException {
        return send(HttpMethod.POST, newOperation);
    }

    /**
     * Creates a Operation with a new object
     *
     * @param newOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Operation newOperation, final ICallback<? super Operation> callback) {
        send(HttpMethod.PUT, callback, newOperation);
    }

    /**
     * Creates a Operation with a new object
     *
     * @param newOperation the object to create/update
     * @return the created Operation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Operation put(final Operation newOperation) throws ClientException {
        return send(HttpMethod.PUT, newOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OperationRequest)this;
     }

}

