// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIpNamedLocationRequest;
import com.microsoft.graph.requests.extensions.IpNamedLocationRequest;
import com.microsoft.graph.models.extensions.IpNamedLocation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ip Named Location Request.
 */
public class IpNamedLocationRequest extends BaseRequest implements IIpNamedLocationRequest {
	
    /**
     * The request for the IpNamedLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IpNamedLocationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, IpNamedLocation.class);
    }

    /**
     * Gets the IpNamedLocation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IpNamedLocation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IpNamedLocation from the service
     *
     * @return the IpNamedLocation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IpNamedLocation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IpNamedLocation> callback) {
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
     * Patches this IpNamedLocation with a source
     *
     * @param sourceIpNamedLocation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IpNamedLocation sourceIpNamedLocation, final ICallback<IpNamedLocation> callback) {
        send(HttpMethod.PATCH, callback, sourceIpNamedLocation);
    }

    /**
     * Patches this IpNamedLocation with a source
     *
     * @param sourceIpNamedLocation the source object with updates
     * @return the updated IpNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IpNamedLocation patch(final IpNamedLocation sourceIpNamedLocation) throws ClientException {
        return send(HttpMethod.PATCH, sourceIpNamedLocation);
    }

    /**
     * Creates a IpNamedLocation with a new object
     *
     * @param newIpNamedLocation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IpNamedLocation newIpNamedLocation, final ICallback<IpNamedLocation> callback) {
        send(HttpMethod.POST, callback, newIpNamedLocation);
    }

    /**
     * Creates a IpNamedLocation with a new object
     *
     * @param newIpNamedLocation the new object to create
     * @return the created IpNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IpNamedLocation post(final IpNamedLocation newIpNamedLocation) throws ClientException {
        return send(HttpMethod.POST, newIpNamedLocation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIpNamedLocationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (IpNamedLocationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIpNamedLocationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (IpNamedLocationRequest)this;
     }

}
