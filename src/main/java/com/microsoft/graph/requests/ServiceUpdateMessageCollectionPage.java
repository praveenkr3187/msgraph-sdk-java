// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ServiceUpdateMessage;
import com.microsoft.graph.requests.ServiceUpdateMessageCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ServiceUpdateMessageCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Update Message Collection Page.
 */
public class ServiceUpdateMessageCollectionPage extends BaseCollectionPage<ServiceUpdateMessage, ServiceUpdateMessageCollectionRequestBuilder> {

    /**
     * A collection page for ServiceUpdateMessage
     *
     * @param response the serialized ServiceUpdateMessageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServiceUpdateMessageCollectionPage(@Nonnull final ServiceUpdateMessageCollectionResponse response, @Nonnull final ServiceUpdateMessageCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ServiceUpdateMessage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ServiceUpdateMessageCollectionPage(@Nonnull final java.util.List<ServiceUpdateMessage> pageContents, @Nullable final ServiceUpdateMessageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
