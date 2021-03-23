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
import com.microsoft.graph.models.AuthenticationMethodConfiguration;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AuthenticationMethodConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Policy.
 */
public class AuthenticationMethodsPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Policy Version.
     * 
     */
    @SerializedName(value = "policyVersion", alternate = {"PolicyVersion"})
    @Expose
	@Nullable
    public String policyVersion;

    /**
     * The Reconfirmation In Days.
     * 
     */
    @SerializedName(value = "reconfirmationInDays", alternate = {"ReconfirmationInDays"})
    @Expose
	@Nullable
    public Integer reconfirmationInDays;

    /**
     * The Authentication Method Configurations.
     * 
     */
    @SerializedName(value = "authenticationMethodConfigurations", alternate = {"AuthenticationMethodConfigurations"})
    @Expose
	@Nullable
    public AuthenticationMethodConfigurationCollectionPage authenticationMethodConfigurations;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("authenticationMethodConfigurations")) {
            authenticationMethodConfigurations = serializer.deserializeObject(json.get("authenticationMethodConfigurations"), AuthenticationMethodConfigurationCollectionPage.class);
        }
    }
}
