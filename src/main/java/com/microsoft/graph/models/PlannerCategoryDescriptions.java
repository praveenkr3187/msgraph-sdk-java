// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Category Descriptions.
 */
public class PlannerCategoryDescriptions implements IJsonBackedObject {

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
     * The Category1.
     * The label associated with Category 1
     */
    @SerializedName(value = "category1", alternate = {"Category1"})
    @Expose
	@Nullable
    public String category1;

    /**
     * The Category2.
     * The label associated with Category 2
     */
    @SerializedName(value = "category2", alternate = {"Category2"})
    @Expose
	@Nullable
    public String category2;

    /**
     * The Category3.
     * The label associated with Category 3
     */
    @SerializedName(value = "category3", alternate = {"Category3"})
    @Expose
	@Nullable
    public String category3;

    /**
     * The Category4.
     * The label associated with Category 4
     */
    @SerializedName(value = "category4", alternate = {"Category4"})
    @Expose
	@Nullable
    public String category4;

    /**
     * The Category5.
     * The label associated with Category 5
     */
    @SerializedName(value = "category5", alternate = {"Category5"})
    @Expose
	@Nullable
    public String category5;

    /**
     * The Category6.
     * The label associated with Category 6
     */
    @SerializedName(value = "category6", alternate = {"Category6"})
    @Expose
	@Nullable
    public String category6;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
