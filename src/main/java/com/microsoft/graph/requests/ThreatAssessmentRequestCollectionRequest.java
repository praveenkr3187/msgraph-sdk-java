// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.InformationProtection;
import com.microsoft.graph.models.ThreatAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.ThreatAssessmentRequestCollectionResponse;
import com.microsoft.graph.requests.ThreatAssessmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.ThreatAssessmentRequestCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Request Collection Request.
 */
public class ThreatAssessmentRequestCollectionRequest extends BaseEntityCollectionRequest<ThreatAssessmentRequest, ThreatAssessmentRequestCollectionResponse, ThreatAssessmentRequestCollectionPage> {

    /**
     * The request builder for this collection of ThreatAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentRequestCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentRequestCollectionResponse.class, ThreatAssessmentRequestCollectionPage.class, ThreatAssessmentRequestCollectionRequestBuilder.class);
    }

    /**
     * Creates a new ThreatAssessmentRequest
     * @param newThreatAssessmentRequest the ThreatAssessmentRequest to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ThreatAssessmentRequest> postAsync(@Nonnull final ThreatAssessmentRequest newThreatAssessmentRequest) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThreatAssessmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newThreatAssessmentRequest);
    }

    /**
     * Creates a new ThreatAssessmentRequest
     * @param newThreatAssessmentRequest the ThreatAssessmentRequest to create
     * @return the newly created object
     */
    @Nonnull
    public ThreatAssessmentRequest post(@Nonnull final ThreatAssessmentRequest newThreatAssessmentRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ThreatAssessmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newThreatAssessmentRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public ThreatAssessmentRequestCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

