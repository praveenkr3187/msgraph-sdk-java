// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Collection Page.
 */
public class WorkbookChartCollectionPage extends BaseCollectionPage<WorkbookChart, IWorkbookChartCollectionRequestBuilder> implements IWorkbookChartCollectionPage {

    /**
     * A collection page for WorkbookChart
     *
     * @param response the serialized WorkbookChartCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartCollectionPage(final WorkbookChartCollectionResponse response, final IWorkbookChartCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
