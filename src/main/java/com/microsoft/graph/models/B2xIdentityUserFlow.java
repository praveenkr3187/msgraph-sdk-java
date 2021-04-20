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
import com.microsoft.graph.models.UserFlowApiConnectorConfiguration;
import com.microsoft.graph.models.IdentityProvider;
import com.microsoft.graph.models.UserFlowLanguageConfiguration;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.IdentityUserFlow;
import com.microsoft.graph.requests.IdentityProviderCollectionPage;
import com.microsoft.graph.requests.UserFlowLanguageConfigurationCollectionPage;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2x Identity User Flow.
 */
public class B2xIdentityUserFlow extends IdentityUserFlow implements IJsonBackedObject {


    /**
     * The Api Connector Configuration.
     * Configuration for enabling an API connector for use as part of the self-service sign up user flow. You can only obtain the value of this object using Get userFlowApiConnectorConfiguration.
     */
    @SerializedName(value = "apiConnectorConfiguration", alternate = {"ApiConnectorConfiguration"})
    @Expose
	@Nullable
    public UserFlowApiConnectorConfiguration apiConnectorConfiguration;

    /**
     * The Identity Providers.
     * The identity providers included in the user flow.
     */
	@Nullable
    public IdentityProviderCollectionPage identityProviders;

    /**
     * The Languages.
     * The languages supported for customization within the user flow. Language customization is enabled by default in self-service sign up user flow. You cannot create custom languages in self-service sign up user flows.
     */
    @SerializedName(value = "languages", alternate = {"Languages"})
    @Expose
	@Nullable
    public UserFlowLanguageConfigurationCollectionPage languages;

    /**
     * The User Attribute Assignments.
     * The user attribute assignments included in the user flow.
     */
    @SerializedName(value = "userAttributeAssignments", alternate = {"UserAttributeAssignments"})
    @Expose
	@Nullable
    public IdentityUserFlowAttributeAssignmentCollectionPage userAttributeAssignments;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("identityProviders")) {
            identityProviders = serializer.deserializeObject(json.get("identityProviders"), IdentityProviderCollectionPage.class);
        }

        if (json.has("languages")) {
            languages = serializer.deserializeObject(json.get("languages"), UserFlowLanguageConfigurationCollectionPage.class);
        }

        if (json.has("userAttributeAssignments")) {
            userAttributeAssignments = serializer.deserializeObject(json.get("userAttributeAssignments"), IdentityUserFlowAttributeAssignmentCollectionPage.class);
        }
    }
}
