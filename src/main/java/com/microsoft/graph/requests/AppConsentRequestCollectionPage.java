// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AppConsentRequest;
import com.microsoft.graph.requests.AppConsentRequestCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AppConsentRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Request Collection Page.
 */
public class AppConsentRequestCollectionPage extends BaseCollectionPage<AppConsentRequest, AppConsentRequestCollectionRequestBuilder> {

    /**
     * A collection page for AppConsentRequest
     *
     * @param response the serialized AppConsentRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AppConsentRequestCollectionPage(@Nonnull final AppConsentRequestCollectionResponse response, @Nonnull final AppConsentRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AppConsentRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AppConsentRequestCollectionPage(@Nonnull final java.util.List<AppConsentRequest> pageContents, @Nullable final AppConsentRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
