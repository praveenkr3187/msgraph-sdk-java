// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartSetPositionRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartSetPositionRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Set Position Request Builder.
 */
public class WorkbookChartSetPositionRequestBuilder extends BaseActionRequestBuilder implements IWorkbookChartSetPositionRequestBuilder {

    /**
     * The request builder for this WorkbookChartSetPosition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param startCell the startCell
     * @param endCell the endCell
     */
    public WorkbookChartSetPositionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startCell, final com.google.gson.JsonElement endCell) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startCell", startCell);
        bodyParams.put("endCell", endCell);
    }

    /**
     * Creates the IWorkbookChartSetPositionRequest
     *
     * @return the IWorkbookChartSetPositionRequest instance
     */
    public IWorkbookChartSetPositionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartSetPositionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartSetPositionRequest instance
     */
    public IWorkbookChartSetPositionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookChartSetPositionRequest request = new WorkbookChartSetPositionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startCell")) {
            request.body.startCell = getParameter("startCell");
        }

        if (hasParameter("endCell")) {
            request.body.endCell = getParameter("endCell");
        }

        return request;
    }
}
