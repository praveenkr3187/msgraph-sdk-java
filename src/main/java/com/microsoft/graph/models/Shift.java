// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ShiftItem;
import com.microsoft.graph.models.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift.
 */
public class Shift extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Draft Shift.
     * The draft version of this shift that is viewable by managers. Required.
     */
    @SerializedName(value = "draftShift", alternate = {"DraftShift"})
    @Expose
	@Nullable
    public ShiftItem draftShift;

    /**
     * The Scheduling Group Id.
     * ID of the scheduling group the shift is part of. Required.
     */
    @SerializedName(value = "schedulingGroupId", alternate = {"SchedulingGroupId"})
    @Expose
	@Nullable
    public String schedulingGroupId;

    /**
     * The Shared Shift.
     * The shared version of this shift that is viewable by both employees and managers. Required.
     */
    @SerializedName(value = "sharedShift", alternate = {"SharedShift"})
    @Expose
	@Nullable
    public ShiftItem sharedShift;

    /**
     * The User Id.
     * ID of the user assigned to the shift. Required.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
