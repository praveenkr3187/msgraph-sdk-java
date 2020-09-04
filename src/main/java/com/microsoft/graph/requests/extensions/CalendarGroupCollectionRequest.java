// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.CalendarGroup;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICalendarGroupCollectionPage;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.ICalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarGroupCollectionRequest;
import com.microsoft.graph.requests.extensions.CalendarGroupCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Collection Request.
 */
public class CalendarGroupCollectionRequest extends BaseCollectionRequest<CalendarGroupCollectionResponse, ICalendarGroupCollectionPage> implements ICalendarGroupCollectionRequest {

    /**
     * The request builder for this collection of CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarGroupCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CalendarGroupCollectionResponse.class, ICalendarGroupCollectionPage.class);
    }

    public void get(final ICallback<ICalendarGroupCollectionPage> callback) {
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

    public ICalendarGroupCollectionPage get() throws ClientException {
        final CalendarGroupCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CalendarGroup newCalendarGroup, final ICallback<CalendarGroup> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CalendarGroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCalendarGroup, callback);
    }

    public CalendarGroup post(final CalendarGroup newCalendarGroup) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CalendarGroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCalendarGroup);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICalendarGroupCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CalendarGroupCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICalendarGroupCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CalendarGroupCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICalendarGroupCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CalendarGroupCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ICalendarGroupCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (CalendarGroupCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ICalendarGroupCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ICalendarGroupCollectionRequest)this;
    }
    public ICalendarGroupCollectionPage buildFromResponse(final CalendarGroupCollectionResponse response) {
        final ICalendarGroupCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CalendarGroupCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CalendarGroupCollectionPage page = new CalendarGroupCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
