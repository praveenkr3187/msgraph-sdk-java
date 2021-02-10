// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsHelloForBusinessAuthenticationMethod;
import com.microsoft.graph.requests.extensions.IWindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsHelloForBusinessAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsHelloForBusinessAuthenticationMethodCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Hello For Business Authentication Method Collection Page.
 */
public class WindowsHelloForBusinessAuthenticationMethodCollectionPage extends BaseCollectionPage<WindowsHelloForBusinessAuthenticationMethod, IWindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder> implements IWindowsHelloForBusinessAuthenticationMethodCollectionPage {

    /**
     * A collection page for WindowsHelloForBusinessAuthenticationMethod
     *
     * @param response the serialized WindowsHelloForBusinessAuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsHelloForBusinessAuthenticationMethodCollectionPage(final WindowsHelloForBusinessAuthenticationMethodCollectionResponse response, final IWindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}