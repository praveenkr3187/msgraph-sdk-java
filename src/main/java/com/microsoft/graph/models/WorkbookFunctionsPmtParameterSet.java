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
 * The class for the Workbook Functions Pmt Parameter Set.
 */
public class WorkbookFunctionsPmtParameterSet {
    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The nper.
     * 
     */
    @SerializedName(value = "nper", alternate = {"Nper"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement nper;

    /**
     * The pv.
     * 
     */
    @SerializedName(value = "pv", alternate = {"Pv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pv;

    /**
     * The fv.
     * 
     */
    @SerializedName(value = "fv", alternate = {"Fv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fv;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement type;


    /**
     * Instiaciates a new WorkbookFunctionsPmtParameterSet
     */
    public WorkbookFunctionsPmtParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsPmtParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsPmtParameterSet(@Nonnull final WorkbookFunctionsPmtParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.nper = builder.nper;
        this.pv = builder.pv;
        this.fv = builder.fv;
        this.type = builder.type;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPmtParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsPmtParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPmtParameterSet
     */
    public static final class WorkbookFunctionsPmtParameterSetBuilder {
        /**
         * The rate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The nper parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement nper;
        /**
         * Sets the Nper
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSetBuilder withNper(@Nullable final com.google.gson.JsonElement val) {
            this.nper = val;
            return this;
        }
        /**
         * The pv parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pv;
        /**
         * Sets the Pv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSetBuilder withPv(@Nullable final com.google.gson.JsonElement val) {
            this.pv = val;
            return this;
        }
        /**
         * The fv parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement fv;
        /**
         * Sets the Fv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSetBuilder withFv(@Nullable final com.google.gson.JsonElement val) {
            this.fv = val;
            return this;
        }
        /**
         * The type parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSetBuilder withType(@Nullable final com.google.gson.JsonElement val) {
            this.type = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsPmtParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsPmtParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPmtParameterSet build() {
            return new WorkbookFunctionsPmtParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.nper != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("nper", nper));
        }
        if(this.pv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pv", pv));
        }
        if(this.fv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fv", fv));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
        }
        return result;
    }
}
