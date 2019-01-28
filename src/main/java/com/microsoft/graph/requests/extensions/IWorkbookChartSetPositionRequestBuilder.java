// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartSetPositionRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Set Position Request Builder.
 */
public interface IWorkbookChartSetPositionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookChartSetPositionRequest
     *
     * @return the IWorkbookChartSetPositionRequest instance
     */
    IWorkbookChartSetPositionRequest buildRequest();

    /**
     * Creates the IWorkbookChartSetPositionRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartSetPositionRequest instance
     */
    IWorkbookChartSetPositionRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
