// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityGovernance;
import com.microsoft.graph.requests.AccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.AppConsentApprovalRouteRequestBuilder;
import com.microsoft.graph.requests.TermsOfUseContainerRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Governance Request Builder.
 */
public class IdentityGovernanceRequestBuilder extends BaseRequestBuilder<IdentityGovernance> {

    /**
     * The request builder for the IdentityGovernance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityGovernanceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IdentityGovernanceRequest instance
     */
    @Nonnull
    public IdentityGovernanceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IdentityGovernanceRequest instance
     */
    @Nonnull
    public IdentityGovernanceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.IdentityGovernanceRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessReviewSet
     *
     * @return the AccessReviewSetRequestBuilder instance
     */
    @Nonnull
    public AccessReviewSetRequestBuilder accessReviews() {
        return new AccessReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("accessReviews"), getClient(), null);
    }

    /**
     * Gets the request builder for AppConsentApprovalRoute
     *
     * @return the AppConsentApprovalRouteRequestBuilder instance
     */
    @Nonnull
    public AppConsentApprovalRouteRequestBuilder appConsent() {
        return new AppConsentApprovalRouteRequestBuilder(getRequestUrlWithAdditionalSegment("appConsent"), getClient(), null);
    }

    /**
     * Gets the request builder for TermsOfUseContainer
     *
     * @return the TermsOfUseContainerRequestBuilder instance
     */
    @Nonnull
    public TermsOfUseContainerRequestBuilder termsOfUse() {
        return new TermsOfUseContainerRequestBuilder(getRequestUrlWithAdditionalSegment("termsOfUse"), getClient(), null);
    }
}
