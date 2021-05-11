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
import com.microsoft.graph.models.ParticipantInfo;
import com.microsoft.graph.models.MediaStream;
import com.microsoft.graph.models.RecordingInfo;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant.
 */
public class Participant extends Entity implements IJsonBackedObject {


    /**
     * The Info.
     * Information about the participant.
     */
    @SerializedName(value = "info", alternate = {"Info"})
    @Expose
	@Nullable
    public ParticipantInfo info;

    /**
     * The Is In Lobby.
     * true if the participant is in lobby.
     */
    @SerializedName(value = "isInLobby", alternate = {"IsInLobby"})
    @Expose
	@Nullable
    public Boolean isInLobby;

    /**
     * The Is Muted.
     * true if the participant is muted (client or server muted).
     */
    @SerializedName(value = "isMuted", alternate = {"IsMuted"})
    @Expose
	@Nullable
    public Boolean isMuted;

    /**
     * The Media Streams.
     * The list of media streams.
     */
    @SerializedName(value = "mediaStreams", alternate = {"MediaStreams"})
    @Expose
	@Nullable
    public java.util.List<MediaStream> mediaStreams;

    /**
     * The Recording Info.
     * Information on whether the participant has recording capability.
     */
    @SerializedName(value = "recordingInfo", alternate = {"RecordingInfo"})
    @Expose
	@Nullable
    public RecordingInfo recordingInfo;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
