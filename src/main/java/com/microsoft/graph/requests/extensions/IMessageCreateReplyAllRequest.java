// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.requests.extensions.IMessageCreateReplyAllRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Message Create Reply All Request.
 */
public interface IMessageCreateReplyAllRequest {

    /**
     * Creates the MessageCreateReplyAll
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<Message> callback);

    /**
     * Creates the MessageCreateReplyAll
     *
     * @return the Message
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Message post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMessageCreateReplyAllRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMessageCreateReplyAllRequest expand(final String value);

}
