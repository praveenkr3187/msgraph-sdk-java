// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Device;
import com.microsoft.graph.requests.extensions.IDeviceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Collection Page.
 */
public class DeviceCollectionPage extends BaseCollectionPage<Device, IDeviceCollectionRequestBuilder> implements IDeviceCollectionPage {

    /**
     * A collection page for Device
     *
     * @param response the serialized DeviceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCollectionPage(final DeviceCollectionResponse response, final IDeviceCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
