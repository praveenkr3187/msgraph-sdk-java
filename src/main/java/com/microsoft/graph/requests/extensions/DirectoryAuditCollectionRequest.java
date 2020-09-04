// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.models.extensions.DirectoryAudit;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionResponse;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectoryAuditCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Collection Request.
 */
public class DirectoryAuditCollectionRequest extends BaseCollectionRequest<DirectoryAuditCollectionResponse, IDirectoryAuditCollectionPage> implements IDirectoryAuditCollectionRequest {

    /**
     * The request builder for this collection of DirectoryAudit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryAuditCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryAuditCollectionResponse.class, IDirectoryAuditCollectionPage.class);
    }

    public void get(final ICallback<IDirectoryAuditCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDirectoryAuditCollectionPage get() throws ClientException {
        final DirectoryAuditCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DirectoryAudit newDirectoryAudit, final ICallback<DirectoryAudit> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DirectoryAuditRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDirectoryAudit, callback);
    }

    public DirectoryAudit post(final DirectoryAudit newDirectoryAudit) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DirectoryAuditRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDirectoryAudit);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDirectoryAuditCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DirectoryAuditCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDirectoryAuditCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DirectoryAuditCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDirectoryAuditCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DirectoryAuditCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDirectoryAuditCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DirectoryAuditCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDirectoryAuditCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDirectoryAuditCollectionRequest)this;
    }
    public IDirectoryAuditCollectionPage buildFromResponse(final DirectoryAuditCollectionResponse response) {
        final IDirectoryAuditCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DirectoryAuditCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DirectoryAuditCollectionPage page = new DirectoryAuditCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
