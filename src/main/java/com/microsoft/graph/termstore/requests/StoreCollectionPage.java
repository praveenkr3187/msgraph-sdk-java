// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests;
import com.microsoft.graph.termstore.models.Store;
import com.microsoft.graph.termstore.requests.StoreCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.termstore.requests.StoreCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Store Collection Page.
 */
public class StoreCollectionPage extends BaseCollectionPage<Store, StoreCollectionRequestBuilder> {

    /**
     * A collection page for Store
     *
     * @param response the serialized StoreCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public StoreCollectionPage(@Nonnull final StoreCollectionResponse response, @Nonnull final StoreCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Store
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public StoreCollectionPage(@Nonnull final java.util.List<Store> pageContents, @Nullable final StoreCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}