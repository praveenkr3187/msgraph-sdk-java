// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationClass;
import com.microsoft.graph.requests.EducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationCategoryRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentDefaultsRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentSettingsRequestBuilder;
import com.microsoft.graph.requests.GroupWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Request.
 */
public class EducationClassRequest extends BaseRequest<EducationClass> {
	
    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClass.class);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EducationClass from the service
     *
     * @return the EducationClass from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationClass get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EducationClass delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> patchAsync(@Nonnull final EducationClass sourceEducationClass) {
        return sendAsync(HttpMethod.PATCH, sourceEducationClass);
    }

    /**
     * Patches this EducationClass with a source
     *
     * @param sourceEducationClass the source object with updates
     * @return the updated EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationClass patch(@Nonnull final EducationClass sourceEducationClass) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> postAsync(@Nonnull final EducationClass newEducationClass) {
        return sendAsync(HttpMethod.POST, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the new object to create
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationClass post(@Nonnull final EducationClass newEducationClass) throws ClientException {
        return send(HttpMethod.POST, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> putAsync(@Nonnull final EducationClass newEducationClass) {
        return sendAsync(HttpMethod.PUT, newEducationClass);
    }

    /**
     * Creates a EducationClass with a new object
     *
     * @param newEducationClass the object to create/update
     * @return the created EducationClass
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EducationClass put(@Nonnull final EducationClass newEducationClass) throws ClientException {
        return send(HttpMethod.PUT, newEducationClass);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EducationClassRequest select(@Nonnull final String value) {
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
     public EducationClassRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

