// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Minimum Operating System.
 */
public class IosMinimumOperatingSystem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The V8_0.
     * Version 8.0 or later.
     */
    @SerializedName("v8_0")
    @Expose
    public Boolean v8_0;

    /**
     * The V9_0.
     * Version 9.0 or later.
     */
    @SerializedName("v9_0")
    @Expose
    public Boolean v9_0;

    /**
     * The V10_0.
     * Version 10.0 or later.
     */
    @SerializedName("v10_0")
    @Expose
    public Boolean v10_0;

    /**
     * The V11_0.
     * Version 11.0 or later.
     */
    @SerializedName("v11_0")
    @Expose
    public Boolean v11_0;

    /**
     * The V12_0.
     * Version 12.0 or later.
     */
    @SerializedName("v12_0")
    @Expose
    public Boolean v12_0;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
