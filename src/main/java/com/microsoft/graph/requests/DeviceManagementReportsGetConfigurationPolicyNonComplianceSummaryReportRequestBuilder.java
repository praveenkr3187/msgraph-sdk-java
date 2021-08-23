// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest;
import com.microsoft.graph.models.DeviceManagementReports;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Configuration Policy Non Compliance Summary Report Request Builder.
 */
public class DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder extends BaseActionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportParameterSet body;
    /**
     * The request builder for this DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest instance
     */
    @Nonnull
    public DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest request = new DeviceManagementReportsGetConfigurationPolicyNonComplianceSummaryReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}