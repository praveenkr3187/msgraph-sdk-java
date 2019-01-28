// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSheetsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Sheets Request Builder.
 */
public interface IWorkbookFunctionsSheetsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsSheetsRequest
     *
     * @return the IWorkbookFunctionsSheetsRequest instance
     */
    IWorkbookFunctionsSheetsRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsSheetsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSheetsRequest instance
     */
    IWorkbookFunctionsSheetsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
