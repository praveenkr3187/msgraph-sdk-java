// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WindowsAutopilotDeviceDeletionState;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Deleted Windows Autopilot Device State.
 */
public class DeletedWindowsAutopilotDeviceState implements IJsonBackedObject {

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
     * The Deletion State.
     * Device deletion state. Possible values are: unknown, failed, accepted, error.
     */
    @SerializedName(value = "deletionState", alternate = {"DeletionState"})
    @Expose
	@Nullable
    public WindowsAutopilotDeviceDeletionState deletionState;

    /**
     * The Device Registration Id.
     * ZTD Device Registration ID .
     */
    @SerializedName(value = "deviceRegistrationId", alternate = {"DeviceRegistrationId"})
    @Expose
	@Nullable
    public String deviceRegistrationId;

    /**
     * The Error Message.
     * Device deletion error message.
     */
    @SerializedName(value = "errorMessage", alternate = {"ErrorMessage"})
    @Expose
	@Nullable
    public String errorMessage;

    /**
     * The Serial Number.
     * Autopilot Device Serial Number
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public String serialNumber;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
