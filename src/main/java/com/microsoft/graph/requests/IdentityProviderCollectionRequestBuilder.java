// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderCollectionRequest;
import com.microsoft.graph.requests.IdentityProviderAvailableProviderTypesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Collection Request Builder.
 */
public class IdentityProviderCollectionRequestBuilder extends BaseCollectionRequestBuilder<IdentityProvider, IdentityProviderRequestBuilder, IdentityProviderCollectionResponse, IdentityProviderCollectionPage, IdentityProviderCollectionRequest> {

    /**
     * The request builder for this collection of IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProviderCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProviderRequestBuilder.class, IdentityProviderCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public IdentityProviderAvailableProviderTypesCollectionRequestBuilder availableProviderTypes() {
        return new IdentityProviderAvailableProviderTypesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.availableProviderTypes"), getClient(), null);
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
