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
 * The class for the Workbook Functions Series Sum Parameter Set.
 */
public class WorkbookFunctionsSeriesSumParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The n.
     * 
     */
    @SerializedName(value = "n", alternate = {"N"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement n;

    /**
     * The m.
     * 
     */
    @SerializedName(value = "m", alternate = {"M"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement m;

    /**
     * The coefficients.
     * 
     */
    @SerializedName(value = "coefficients", alternate = {"Coefficients"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement coefficients;


    /**
     * Instiaciates a new WorkbookFunctionsSeriesSumParameterSet
     */
    public WorkbookFunctionsSeriesSumParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsSeriesSumParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsSeriesSumParameterSet(@Nonnull final WorkbookFunctionsSeriesSumParameterSetBuilder builder) {
        this.x = builder.x;
        this.n = builder.n;
        this.m = builder.m;
        this.coefficients = builder.coefficients;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSeriesSumParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsSeriesSumParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSeriesSumParameterSet
     */
    public static final class WorkbookFunctionsSeriesSumParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSeriesSumParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The n parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement n;
        /**
         * Sets the N
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSeriesSumParameterSetBuilder withN(@Nullable final com.google.gson.JsonElement val) {
            this.n = val;
            return this;
        }
        /**
         * The m parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement m;
        /**
         * Sets the M
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSeriesSumParameterSetBuilder withM(@Nullable final com.google.gson.JsonElement val) {
            this.m = val;
            return this;
        }
        /**
         * The coefficients parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement coefficients;
        /**
         * Sets the Coefficients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSeriesSumParameterSetBuilder withCoefficients(@Nullable final com.google.gson.JsonElement val) {
            this.coefficients = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsSeriesSumParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsSeriesSumParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSeriesSumParameterSet build() {
            return new WorkbookFunctionsSeriesSumParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.n != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("n", n));
        }
        if(this.m != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("m", m));
        }
        if(this.coefficients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("coefficients", coefficients));
        }
        return result;
    }
}
