// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AgreementAcceptance;
import com.microsoft.graph.models.Agreement;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.AgreementCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms Of Use Container.
 */
public class TermsOfUseContainer extends Entity implements IJsonBackedObject {


    /**
     * The Agreement Acceptances.
     * 
     */
    @SerializedName(value = "agreementAcceptances", alternate = {"AgreementAcceptances"})
    @Expose
	@Nullable
    public AgreementAcceptanceCollectionPage agreementAcceptances;

    /**
     * The Agreements.
     * 
     */
    @SerializedName(value = "agreements", alternate = {"Agreements"})
    @Expose
	@Nullable
    public AgreementCollectionPage agreements;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("agreementAcceptances")) {
            agreementAcceptances = serializer.deserializeObject(json.get("agreementAcceptances"), AgreementAcceptanceCollectionPage.class);
        }

        if (json.has("agreements")) {
            agreements = serializer.deserializeObject(json.get("agreements"), AgreementCollectionPage.class);
        }
    }
}
