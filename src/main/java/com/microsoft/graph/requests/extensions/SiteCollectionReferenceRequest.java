// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.Site;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection Reference Request.
 */
public class SiteCollectionReferenceRequest extends BaseCollectionRequest<SiteCollectionResponse, ISiteCollectionPage> implements ISiteCollectionReferenceRequest {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteCollectionResponse.class, ISiteCollectionPage.class);
    }

    public void post(final Site newSite, final ICallback<Site> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/sites/" + newSite.id);
        new SiteWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSite, body, callback);
    }

    public Site post(final Site newSite) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/sites/" + newSite.id);
        return new SiteWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newSite, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SiteCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SiteCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISiteCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SiteCollectionReferenceRequest)this;
    }
}
