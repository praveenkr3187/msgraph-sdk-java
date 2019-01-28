// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISharedDriveItemRequest;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.IListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Shared Drive Item Request Builder.
 */
public interface ISharedDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISharedDriveItemRequest instance
     */
    ISharedDriveItemRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISharedDriveItemRequest instance
     */
    ISharedDriveItemRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder driveItem();

    IDriveItemCollectionRequestBuilder items();

    IDriveItemRequestBuilder items(final String id);

    /**
     * Gets the request builder for List
     *
     * @return the IListRequestBuilder instance
     */
    IListRequestBuilder list();

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    IListItemRequestBuilder listItem();

    /**
     * Gets the request builder for DriveItem
     *
     * @return the IDriveItemRequestBuilder instance
     */
    IDriveItemRequestBuilder root();

    /**
     * Gets the request builder for Site
     *
     * @return the ISiteRequestBuilder instance
     */
    ISiteRequestBuilder site();

}
