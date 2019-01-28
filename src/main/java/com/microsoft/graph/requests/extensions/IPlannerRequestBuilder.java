// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPlannerRequest;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Request Builder.
 */
public interface IPlannerRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IPlannerRequest instance
     */
    IPlannerRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPlannerRequest instance
     */
    IPlannerRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IPlannerTaskCollectionRequestBuilder tasks();

    IPlannerTaskRequestBuilder tasks(final String id);

    IPlannerPlanCollectionRequestBuilder plans();

    IPlannerPlanRequestBuilder plans(final String id);

    IPlannerBucketCollectionRequestBuilder buckets();

    IPlannerBucketRequestBuilder buckets(final String id);

}
