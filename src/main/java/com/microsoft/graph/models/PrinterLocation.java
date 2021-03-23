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


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Location.
 */
public class PrinterLocation implements IJsonBackedObject {

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
     * The Altitude In Meters.
     * The altitude, in meters, that the printer is located at.
     */
    @SerializedName(value = "altitudeInMeters", alternate = {"AltitudeInMeters"})
    @Expose
	@Nullable
    public Integer altitudeInMeters;

    /**
     * The Building.
     * The building that the printer is located in.
     */
    @SerializedName(value = "building", alternate = {"Building"})
    @Expose
	@Nullable
    public String building;

    /**
     * The City.
     * The city that the printer is located in.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
	@Nullable
    public String city;

    /**
     * The Country Or Region.
     * The country or region that the printer is located in.
     */
    @SerializedName(value = "countryOrRegion", alternate = {"CountryOrRegion"})
    @Expose
	@Nullable
    public String countryOrRegion;

    /**
     * The Floor.
     * The floor that the printer is located on. Only numerical values are supported right now.
     */
    @SerializedName(value = "floor", alternate = {"Floor"})
    @Expose
	@Nullable
    public String floor;

    /**
     * The Floor Description.
     * The description of the floor that the printer is located on.
     */
    @SerializedName(value = "floorDescription", alternate = {"FloorDescription"})
    @Expose
	@Nullable
    public String floorDescription;

    /**
     * The Latitude.
     * The latitude that the printer is located at.
     */
    @SerializedName(value = "latitude", alternate = {"Latitude"})
    @Expose
	@Nullable
    public Double latitude;

    /**
     * The Longitude.
     * The longitude that the printer is located at.
     */
    @SerializedName(value = "longitude", alternate = {"Longitude"})
    @Expose
	@Nullable
    public Double longitude;

    /**
     * The Organization.
     * The organizational hierarchy that the printer belongs to. The elements should be in hierarchical order.
     */
    @SerializedName(value = "organization", alternate = {"Organization"})
    @Expose
	@Nullable
    public java.util.List<String> organization;

    /**
     * The Postal Code.
     * The postal code that the printer is located in.
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
	@Nullable
    public String postalCode;

    /**
     * The Room Description.
     * The description of the room that the printer is located in.
     */
    @SerializedName(value = "roomDescription", alternate = {"RoomDescription"})
    @Expose
	@Nullable
    public String roomDescription;

    /**
     * The Room Name.
     * The room that the printer is located in. Only numerical values are supported right now.
     */
    @SerializedName(value = "roomName", alternate = {"RoomName"})
    @Expose
	@Nullable
    public String roomName;

    /**
     * The Site.
     * The site that the printer is located in.
     */
    @SerializedName(value = "site", alternate = {"Site"})
    @Expose
	@Nullable
    public String site;

    /**
     * The State Or Province.
     * The state or province that the printer is located in.
     */
    @SerializedName(value = "stateOrProvince", alternate = {"StateOrProvince"})
    @Expose
	@Nullable
    public String stateOrProvince;

    /**
     * The Street Address.
     * The street address where the printer is located.
     */
    @SerializedName(value = "streetAddress", alternate = {"StreetAddress"})
    @Expose
	@Nullable
    public String streetAddress;

    /**
     * The Subdivision.
     * The subdivision that the printer is located in. The elements should be in hierarchical order.
     */
    @SerializedName(value = "subdivision", alternate = {"Subdivision"})
    @Expose
	@Nullable
    public java.util.List<String> subdivision;

    /**
     * The Subunit.
     * 
     */
    @SerializedName(value = "subunit", alternate = {"Subunit"})
    @Expose
	@Nullable
    public java.util.List<String> subunit;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
