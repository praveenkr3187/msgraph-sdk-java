// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration.
 */
public class Windows10SecureAssessmentConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Allow Printing.
     * Indicates whether or not to allow the app from printing during the test.
     */
    @SerializedName(value = "allowPrinting", alternate = {"AllowPrinting"})
    @Expose
	@Nullable
    public Boolean allowPrinting;

    /**
     * The Allow Screen Capture.
     * Indicates whether or not to allow screen capture capability during a test.
     */
    @SerializedName(value = "allowScreenCapture", alternate = {"AllowScreenCapture"})
    @Expose
	@Nullable
    public Boolean allowScreenCapture;

    /**
     * The Allow Text Suggestion.
     * Indicates whether or not to allow text suggestions during the test.
     */
    @SerializedName(value = "allowTextSuggestion", alternate = {"AllowTextSuggestion"})
    @Expose
	@Nullable
    public Boolean allowTextSuggestion;

    /**
     * The Configuration Account.
     * The account used to configure the Windows device for taking the test. The user can be a domain account (domain/user), an AAD account (username@tenant.com) or a local account (username).
     */
    @SerializedName(value = "configurationAccount", alternate = {"ConfigurationAccount"})
    @Expose
	@Nullable
    public String configurationAccount;

    /**
     * The Launch Uri.
     * Url link to an assessment that's automatically loaded when the secure assessment browser is launched. It has to be a valid Url (http[s]://msdn.microsoft.com/).
     */
    @SerializedName(value = "launchUri", alternate = {"LaunchUri"})
    @Expose
	@Nullable
    public String launchUri;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
