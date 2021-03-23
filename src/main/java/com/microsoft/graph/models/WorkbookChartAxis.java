// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookChartAxisFormat;
import com.microsoft.graph.models.WorkbookChartGridlines;
import com.microsoft.graph.models.WorkbookChartAxisTitle;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis.
 */
public class WorkbookChartAxis extends Entity implements IJsonBackedObject {


    /**
     * The Major Unit.
     * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     */
    @SerializedName(value = "majorUnit", alternate = {"MajorUnit"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement majorUnit;

    /**
     * The Maximum.
     * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     */
    @SerializedName(value = "maximum", alternate = {"Maximum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maximum;

    /**
     * The Minimum.
     * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     */
    @SerializedName(value = "minimum", alternate = {"Minimum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement minimum;

    /**
     * The Minor Unit.
     * Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     */
    @SerializedName(value = "minorUnit", alternate = {"MinorUnit"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement minorUnit;

    /**
     * The Format.
     * Represents the formatting of a chart object, which includes line and font formatting. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public WorkbookChartAxisFormat format;

    /**
     * The Major Gridlines.
     * Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     */
    @SerializedName(value = "majorGridlines", alternate = {"MajorGridlines"})
    @Expose
	@Nullable
    public WorkbookChartGridlines majorGridlines;

    /**
     * The Minor Gridlines.
     * Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     */
    @SerializedName(value = "minorGridlines", alternate = {"MinorGridlines"})
    @Expose
	@Nullable
    public WorkbookChartGridlines minorGridlines;

    /**
     * The Title.
     * Represents the axis title. Read-only.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public WorkbookChartAxisTitle title;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
