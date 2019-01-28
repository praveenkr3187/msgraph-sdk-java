// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppAssignment;
import com.microsoft.graph.requests.extensions.IMobileAppAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Assignment Collection Page.
 */
public class MobileAppAssignmentCollectionPage extends BaseCollectionPage<MobileAppAssignment, IMobileAppAssignmentCollectionRequestBuilder> implements IMobileAppAssignmentCollectionPage {

    /**
     * A collection page for MobileAppAssignment
     *
     * @param response the serialized MobileAppAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppAssignmentCollectionPage(final MobileAppAssignmentCollectionResponse response, final IMobileAppAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
