// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request Builder.
 */
public class WorkbookChartAxisRequestBuilder extends BaseRequestBuilder implements IWorkbookChartAxisRequestBuilder {

    /**
     * The request builder for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartAxisRequest instance
     */
    public IWorkbookChartAxisRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisRequest instance
     */
    public IWorkbookChartAxisRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartAxisRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartAxisFormat
     *
     * @return the IWorkbookChartAxisFormatRequestBuilder instance
     */
    public IWorkbookChartAxisFormatRequestBuilder format() {
        return new WorkbookChartAxisFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the IWorkbookChartGridlinesRequestBuilder instance
     */
    public IWorkbookChartGridlinesRequestBuilder majorGridlines() {
        return new WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("majorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartGridlines
     *
     * @return the IWorkbookChartGridlinesRequestBuilder instance
     */
    public IWorkbookChartGridlinesRequestBuilder minorGridlines() {
        return new WorkbookChartGridlinesRequestBuilder(getRequestUrlWithAdditionalSegment("minorGridlines"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAxisTitle
     *
     * @return the IWorkbookChartAxisTitleRequestBuilder instance
     */
    public IWorkbookChartAxisTitleRequestBuilder title() {
        return new WorkbookChartAxisTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }
}

