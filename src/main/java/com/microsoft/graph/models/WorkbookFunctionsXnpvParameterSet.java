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
 * The class for the Workbook Functions Xnpv Parameter Set.
 */
public class WorkbookFunctionsXnpvParameterSet {
    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement values;

    /**
     * The dates.
     * 
     */
    @SerializedName(value = "dates", alternate = {"Dates"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement dates;


    /**
     * Instiaciates a new WorkbookFunctionsXnpvParameterSet
     */
    public WorkbookFunctionsXnpvParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsXnpvParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsXnpvParameterSet(@Nonnull final WorkbookFunctionsXnpvParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.values = builder.values;
        this.dates = builder.dates;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsXnpvParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsXnpvParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsXnpvParameterSet
     */
    public static final class WorkbookFunctionsXnpvParameterSetBuilder {
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
        public WorkbookFunctionsXnpvParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The values parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsXnpvParameterSetBuilder withValues(@Nullable final com.google.gson.JsonElement val) {
            this.values = val;
            return this;
        }
        /**
         * The dates parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement dates;
        /**
         * Sets the Dates
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsXnpvParameterSetBuilder withDates(@Nullable final com.google.gson.JsonElement val) {
            this.dates = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsXnpvParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsXnpvParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsXnpvParameterSet build() {
            return new WorkbookFunctionsXnpvParameterSet(this);
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
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
        }
        if(this.dates != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("dates", dates));
        }
        return result;
    }
}
