// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.IdentityProviderAvailableProviderTypesCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderAvailableProviderTypesCollectionPage;
import com.microsoft.graph.requests.IdentityProviderAvailableProviderTypesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Available Provider Types Collection Page.
 */
public class IdentityProviderAvailableProviderTypesCollectionPage extends BaseCollectionPage<String, IdentityProviderAvailableProviderTypesCollectionRequestBuilder> {

    /**
     * A collection page for String.
     *
     * @param response The serialized IdentityProviderAvailableProviderTypesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public IdentityProviderAvailableProviderTypesCollectionPage(@Nonnull final IdentityProviderAvailableProviderTypesCollectionResponse response, @Nonnull final IdentityProviderAvailableProviderTypesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for IdentityProviderAvailableProviderTypes
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityProviderAvailableProviderTypesCollectionPage(@Nonnull final java.util.List<String> pageContents, @Nullable final IdentityProviderAvailableProviderTypesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}