// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ResourceOperation;
import com.microsoft.graph.requests.ResourceOperationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ResourceOperationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Resource Operation Collection Page.
 */
public class ResourceOperationCollectionPage extends BaseCollectionPage<ResourceOperation, ResourceOperationCollectionRequestBuilder> {

    /**
     * A collection page for ResourceOperation
     *
     * @param response the serialized ResourceOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ResourceOperationCollectionPage(@Nonnull final ResourceOperationCollectionResponse response, @Nonnull final ResourceOperationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ResourceOperation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ResourceOperationCollectionPage(@Nonnull final java.util.List<ResourceOperation> pageContents, @Nullable final ResourceOperationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}