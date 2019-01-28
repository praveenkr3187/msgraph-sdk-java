// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Lifecycle Policy Collection Request.
 */
public interface IGroupLifecyclePolicyCollectionRequest {

    void get(final ICallback<IGroupLifecyclePolicyCollectionPage> callback);

    IGroupLifecyclePolicyCollectionPage get() throws ClientException;

    void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<GroupLifecyclePolicy> callback);

    GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupLifecyclePolicyCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupLifecyclePolicyCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IGroupLifecyclePolicyCollectionRequest top(final int value);

}
