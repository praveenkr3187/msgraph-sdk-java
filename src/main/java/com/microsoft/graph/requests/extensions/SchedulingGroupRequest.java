// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SchedulingGroup;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scheduling Group Request.
 */
public class SchedulingGroupRequest extends BaseRequest implements ISchedulingGroupRequest {
	
    /**
     * The request for the SchedulingGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SchedulingGroupRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SchedulingGroup.class);
    }

    /**
     * Gets the SchedulingGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SchedulingGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SchedulingGroup from the service
     *
     * @return the SchedulingGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SchedulingGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SchedulingGroup> callback) {
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
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SchedulingGroup sourceSchedulingGroup, final ICallback<? super SchedulingGroup> callback) {
        send(HttpMethod.PATCH, callback, sourceSchedulingGroup);
    }

    /**
     * Patches this SchedulingGroup with a source
     *
     * @param sourceSchedulingGroup the source object with updates
     * @return the updated SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SchedulingGroup patch(final SchedulingGroup sourceSchedulingGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SchedulingGroup newSchedulingGroup, final ICallback<? super SchedulingGroup> callback) {
        send(HttpMethod.POST, callback, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the new object to create
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SchedulingGroup post(final SchedulingGroup newSchedulingGroup) throws ClientException {
        return send(HttpMethod.POST, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SchedulingGroup newSchedulingGroup, final ICallback<? super SchedulingGroup> callback) {
        send(HttpMethod.PUT, callback, newSchedulingGroup);
    }

    /**
     * Creates a SchedulingGroup with a new object
     *
     * @param newSchedulingGroup the object to create/update
     * @return the created SchedulingGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SchedulingGroup put(final SchedulingGroup newSchedulingGroup) throws ClientException {
        return send(HttpMethod.PUT, newSchedulingGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISchedulingGroupRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SchedulingGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISchedulingGroupRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SchedulingGroupRequest)this;
     }

}

