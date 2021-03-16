// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookFunctionsSinhRequest;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.models.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookFunctionsSinhParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sinh Request Builder.
 */
public class WorkbookFunctionsSinhRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsSinh
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsSinhRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private WorkbookFunctionsSinhParameterSet body;
    /**
     * The request builder for this WorkbookFunctionsSinh
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsSinhRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsSinhParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsSinhRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsSinhRequest instance
     */
    @Nonnull
    public WorkbookFunctionsSinhRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsSinhRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsSinhRequest instance
     */
    @Nonnull
    public WorkbookFunctionsSinhRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookFunctionsSinhRequest request = new WorkbookFunctionsSinhRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}