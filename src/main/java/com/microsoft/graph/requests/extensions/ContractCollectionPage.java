// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Contract;
import com.microsoft.graph.requests.extensions.IContractCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contract Collection Page.
 */
public class ContractCollectionPage extends BaseCollectionPage<Contract, IContractCollectionRequestBuilder> implements IContractCollectionPage {

    /**
     * A collection page for Contract
     *
     * @param response the serialized ContractCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ContractCollectionPage(final ContractCollectionResponse response, final IContractCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
