// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagement;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignParameterSet;
import com.microsoft.graph.models.DeviceCompliancePolicyScheduleActionsForRulesParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Collection Request Builder.
 */
public class DeviceCompliancePolicyCollectionRequestBuilder extends BaseCollectionRequestBuilder<DeviceCompliancePolicy, DeviceCompliancePolicyRequestBuilder, DeviceCompliancePolicyCollectionResponse, DeviceCompliancePolicyCollectionPage, DeviceCompliancePolicyCollectionRequest> {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyRequestBuilder.class, DeviceCompliancePolicyCollectionRequest.class);
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