// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sharing Invitation.
 */
public class SharingInvitation implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Email.
     * The email address provided for the recipient of the sharing invitation. Read-only.
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
	@Nullable
    public String email;

    /**
     * The Invited By.
     * Provides information about who sent the invitation that created this permission, if that information is available. Read-only.
     */
    @SerializedName(value = "invitedBy", alternate = {"InvitedBy"})
    @Expose
	@Nullable
    public IdentitySet invitedBy;

    /**
     * The Redeemed By.
     * 
     */
    @SerializedName(value = "redeemedBy", alternate = {"RedeemedBy"})
    @Expose
	@Nullable
    public String redeemedBy;

    /**
     * The Sign In Required.
     * If true the recipient of the invitation needs to sign in in order to access the shared item. Read-only.
     */
    @SerializedName(value = "signInRequired", alternate = {"SignInRequired"})
    @Expose
	@Nullable
    public Boolean signInRequired;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
