// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.VppTokenSyncStatus;
import com.microsoft.graph.models.VppTokenState;
import com.microsoft.graph.models.VppTokenAccountType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token.
 */
public class VppToken extends Entity implements IJsonBackedObject {


    /**
     * The Apple Id.
     * The apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "appleId", alternate = {"AppleId"})
    @Expose
	@Nullable
    public String appleId;

    /**
     * The Automatically Update Apps.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName(value = "automaticallyUpdateApps", alternate = {"AutomaticallyUpdateApps"})
    @Expose
	@Nullable
    public Boolean automaticallyUpdateApps;

    /**
     * The Country Or Region.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName(value = "countryOrRegion", alternate = {"CountryOrRegion"})
    @Expose
	@Nullable
    public String countryOrRegion;

    /**
     * The Expiration Date Time.
     * The expiration date time of the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime expirationDateTime;

    /**
     * The Last Modified Date Time.
     * Last modification date time associated with the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Last Sync Date Time.
     * The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSyncDateTime;

    /**
     * The Last Sync Status.
     * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     */
    @SerializedName(value = "lastSyncStatus", alternate = {"LastSyncStatus"})
    @Expose
	@Nullable
    public VppTokenSyncStatus lastSyncStatus;

    /**
     * The Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName(value = "organizationName", alternate = {"OrganizationName"})
    @Expose
	@Nullable
    public String organizationName;

    /**
     * The State.
     * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM, duplicateLocationId.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public VppTokenState state;

    /**
     * The Token.
     * The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     */
    @SerializedName(value = "token", alternate = {"Token"})
    @Expose
	@Nullable
    public String token;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName(value = "vppTokenAccountType", alternate = {"VppTokenAccountType"})
    @Expose
	@Nullable
    public VppTokenAccountType vppTokenAccountType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
