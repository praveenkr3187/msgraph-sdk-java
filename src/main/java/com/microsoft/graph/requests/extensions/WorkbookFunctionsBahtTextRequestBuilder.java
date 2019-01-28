// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBahtTextRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBahtTextRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Baht Text Request Builder.
 */
public class WorkbookFunctionsBahtTextRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBahtTextRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBahtText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     */
    public WorkbookFunctionsBahtTextRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement number) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
    }

    /**
     * Creates the IWorkbookFunctionsBahtTextRequest
     *
     * @return the IWorkbookFunctionsBahtTextRequest instance
     */
    public IWorkbookFunctionsBahtTextRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBahtTextRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBahtTextRequest instance
     */
    public IWorkbookFunctionsBahtTextRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBahtTextRequest request = new WorkbookFunctionsBahtTextRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        return request;
    }
}
