// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppConsentRequest;
import com.microsoft.graph.models.UserConsentRequest;
import com.microsoft.graph.models.ConsentRequestFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UserConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.UserConsentRequestRequestBuilder;
import com.microsoft.graph.requests.UserConsentRequestCollectionRequest;
import com.microsoft.graph.requests.UserConsentRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.UserConsentRequestFilterByCurrentUserParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Consent Request Collection Request Builder.
 */
public class UserConsentRequestCollectionRequestBuilder extends BaseCollectionRequestBuilder<UserConsentRequest, UserConsentRequestRequestBuilder, UserConsentRequestCollectionResponse, UserConsentRequestCollectionPage, UserConsentRequestCollectionRequest> {

    /**
     * The request builder for this collection of AppConsentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserConsentRequestCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserConsentRequestRequestBuilder.class, UserConsentRequestCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UserConsentRequestFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final UserConsentRequestFilterByCurrentUserParameterSet parameters) {
        return new UserConsentRequestFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
