// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDriveItemVersionStreamRequest;
import com.microsoft.graph.requests.extensions.DriveItemVersionStreamRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Version Stream Request Builder.
 */
public class DriveItemVersionStreamRequestBuilder extends BaseRequestBuilder implements IDriveItemVersionStreamRequestBuilder {

    /**
     * The request builder for the DriveItemVersionStream
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemVersionStreamRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDriveItemVersionStreamRequest instance
     */
    public IDriveItemVersionStreamRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemVersionStreamRequest instance
     */
    public IDriveItemVersionStreamRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DriveItemVersionStreamRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

