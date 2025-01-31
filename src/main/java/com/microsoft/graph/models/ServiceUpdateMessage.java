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
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.ServiceUpdateCategory;
import com.microsoft.graph.models.ServiceUpdateSeverity;
import com.microsoft.graph.models.ServiceUpdateMessageViewpoint;
import com.microsoft.graph.models.ServiceAnnouncementBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Update Message.
 */
public class ServiceUpdateMessage extends ServiceAnnouncementBase implements IJsonBackedObject {


    /**
     * The Action Required By Date Time.
     * The expected deadline of the action for the message.
     */
    @SerializedName(value = "actionRequiredByDateTime", alternate = {"ActionRequiredByDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime actionRequiredByDateTime;

    /**
     * The Body.
     * The content type and content of the service message body.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Category.
     * The service message category. Possible values are: preventOrFixIssue, planForChange, stayInformed, unknownFutureValue.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public ServiceUpdateCategory category;

    /**
     * The Is Major Change.
     * Indicates whether the message describes a major update for the service.
     */
    @SerializedName(value = "isMajorChange", alternate = {"IsMajorChange"})
    @Expose
	@Nullable
    public Boolean isMajorChange;

    /**
     * The Services.
     * The affected services by the service message.
     */
    @SerializedName(value = "services", alternate = {"Services"})
    @Expose
	@Nullable
    public java.util.List<String> services;

    /**
     * The Severity.
     * The severity of the service message. Possible values are: normal, high, critical, unknownFutureValue.
     */
    @SerializedName(value = "severity", alternate = {"Severity"})
    @Expose
	@Nullable
    public ServiceUpdateSeverity severity;

    /**
     * The Tags.
     * A collection of tags for the service message.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
	@Nullable
    public java.util.List<String> tags;

    /**
     * The View Point.
     * Represents user view points data of the service message. This data includes message status such as whether the user has archived, read, or marked the message as favorite. This property is null when accessed with application permissions.
     */
    @SerializedName(value = "viewPoint", alternate = {"ViewPoint"})
    @Expose
	@Nullable
    public ServiceUpdateMessageViewpoint viewPoint;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
