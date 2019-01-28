// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMacOSCompliancePolicyRequest;
import com.microsoft.graph.requests.extensions.MacOSCompliancePolicyRequest;
import com.microsoft.graph.models.extensions.MacOSCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCompliance Policy Request.
 */
public class MacOSCompliancePolicyRequest extends BaseRequest implements IMacOSCompliancePolicyRequest {
	
    /**
     * The request for the MacOSCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSCompliancePolicy.class);
    }

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MacOSCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @return the MacOSCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MacOSCompliancePolicy> callback) {
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
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSCompliancePolicy sourceMacOSCompliancePolicy, final ICallback<MacOSCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSCompliancePolicy);
    }

    /**
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @return the updated MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCompliancePolicy patch(final MacOSCompliancePolicy sourceMacOSCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSCompliancePolicy newMacOSCompliancePolicy, final ICallback<MacOSCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newMacOSCompliancePolicy);
    }

    /**
     * Creates a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @return the created MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSCompliancePolicy post(final MacOSCompliancePolicy newMacOSCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newMacOSCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MacOSCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MacOSCompliancePolicyRequest)this;
     }

}

