// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Collection Request.
 */
public class DriveItemCollectionRequest extends BaseCollectionRequest<DriveItemCollectionResponse, IDriveItemCollectionPage> implements IDriveItemCollectionRequest {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemCollectionResponse.class, IDriveItemCollectionPage.class);
    }

    public void get(final ICallback<IDriveItemCollectionPage> callback) {
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

    public IDriveItemCollectionPage get() throws ClientException {
        final DriveItemCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DriveItem newDriveItem, final ICallback<DriveItem> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DriveItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDriveItem, callback);
    }

    public DriveItem post(final DriveItem newDriveItem) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DriveItemRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDriveItem);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDriveItemCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DriveItemCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDriveItemCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DriveItemCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDriveItemCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DriveItemCollectionRequest)this;
    }

    public IDriveItemCollectionPage buildFromResponse(final DriveItemCollectionResponse response) {
        final IDriveItemCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DriveItemCollectionPage page = new DriveItemCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
