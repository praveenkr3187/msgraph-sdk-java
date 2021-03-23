// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Midb Parameter Set.
 */
public class WorkbookFunctionsMidbParameterSet {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The start Num.
     * 
     */
    @SerializedName(value = "startNum", alternate = {"StartNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startNum;

    /**
     * The num Bytes.
     * 
     */
    @SerializedName(value = "numBytes", alternate = {"NumBytes"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numBytes;


    /**
     * Instiaciates a new WorkbookFunctionsMidbParameterSet
     */
    public WorkbookFunctionsMidbParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsMidbParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsMidbParameterSet(@Nonnull final WorkbookFunctionsMidbParameterSetBuilder builder) {
        this.text = builder.text;
        this.startNum = builder.startNum;
        this.numBytes = builder.numBytes;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsMidbParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsMidbParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsMidbParameterSet
     */
    public static final class WorkbookFunctionsMidbParameterSetBuilder {
        /**
         * The text parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement text;
        /**
         * Sets the Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidbParameterSetBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        /**
         * The startNum parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement startNum;
        /**
         * Sets the StartNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidbParameterSetBuilder withStartNum(@Nullable final com.google.gson.JsonElement val) {
            this.startNum = val;
            return this;
        }
        /**
         * The numBytes parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement numBytes;
        /**
         * Sets the NumBytes
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsMidbParameterSetBuilder withNumBytes(@Nullable final com.google.gson.JsonElement val) {
            this.numBytes = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsMidbParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsMidbParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsMidbParameterSet build() {
            return new WorkbookFunctionsMidbParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.startNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startNum", startNum));
        }
        if(this.numBytes != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numBytes", numBytes));
        }
        return result;
    }
}
