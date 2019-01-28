// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsPhone81CompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.WindowsPhone81CompliancePolicyRequest;
import com.microsoft.graph.models.extensions.WindowsPhone81CompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Compliance Policy Request.
 */
public class WindowsPhone81CompliancePolicyRequest extends BaseRequest implements IWindowsPhone81CompliancePolicyRequest {
	
    /**
     * The request for the WindowsPhone81CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CompliancePolicy.class);
    }

    /**
     * Gets the WindowsPhone81CompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsPhone81CompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81CompliancePolicy from the service
     *
     * @return the WindowsPhone81CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsPhone81CompliancePolicy> callback) {
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
     * Patches this WindowsPhone81CompliancePolicy with a source
     *
     * @param sourceWindowsPhone81CompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy, final ICallback<WindowsPhone81CompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81CompliancePolicy);
    }

    /**
     * Patches this WindowsPhone81CompliancePolicy with a source
     *
     * @param sourceWindowsPhone81CompliancePolicy the source object with updates
     * @return the updated WindowsPhone81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CompliancePolicy patch(final WindowsPhone81CompliancePolicy sourceWindowsPhone81CompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy, final ICallback<WindowsPhone81CompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Creates a WindowsPhone81CompliancePolicy with a new object
     *
     * @param newWindowsPhone81CompliancePolicy the new object to create
     * @return the created WindowsPhone81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CompliancePolicy post(final WindowsPhone81CompliancePolicy newWindowsPhone81CompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81CompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81CompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WindowsPhone81CompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81CompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WindowsPhone81CompliancePolicyRequest)this;
     }

}

