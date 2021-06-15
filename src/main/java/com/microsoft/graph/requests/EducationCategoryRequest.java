// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationCategory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Category Request.
 */
public class EducationCategoryRequest extends BaseRequest<EducationCategory> {
	
    /**
     * The request for the EducationCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationCategoryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationCategory.class);
    }

    /**
     * Gets the EducationCategory from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationCategory> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EducationCategory from the service
     *
     * @return the EducationCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationCategory> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EducationCategory delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationCategory with a source
     *
     * @param sourceEducationCategory the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationCategory> patchAsync(@Nonnull final EducationCategory sourceEducationCategory) {
        return sendAsync(HttpMethod.PATCH, sourceEducationCategory);
    }

    /**
     * Patches this EducationCategory with a source
     *
     * @param sourceEducationCategory the source object with updates
     * @return the updated EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationCategory patch(@Nonnull final EducationCategory sourceEducationCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationCategory);
    }

    /**
     * Creates a EducationCategory with a new object
     *
     * @param newEducationCategory the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationCategory> postAsync(@Nonnull final EducationCategory newEducationCategory) {
        return sendAsync(HttpMethod.POST, newEducationCategory);
    }

    /**
     * Creates a EducationCategory with a new object
     *
     * @param newEducationCategory the new object to create
     * @return the created EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationCategory post(@Nonnull final EducationCategory newEducationCategory) throws ClientException {
        return send(HttpMethod.POST, newEducationCategory);
    }

    /**
     * Creates a EducationCategory with a new object
     *
     * @param newEducationCategory the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationCategory> putAsync(@Nonnull final EducationCategory newEducationCategory) {
        return sendAsync(HttpMethod.PUT, newEducationCategory);
    }

    /**
     * Creates a EducationCategory with a new object
     *
     * @param newEducationCategory the object to create/update
     * @return the created EducationCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationCategory put(@Nonnull final EducationCategory newEducationCategory) throws ClientException {
        return send(HttpMethod.PUT, newEducationCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationCategoryRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public EducationCategoryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

