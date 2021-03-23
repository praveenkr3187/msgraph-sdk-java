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
 * The class for the Workbook Functions Dollar Fr Parameter Set.
 */
public class WorkbookFunctionsDollarFrParameterSet {
    /**
     * The decimal Dollar.
     * 
     */
    @SerializedName(value = "decimalDollar", alternate = {"DecimalDollar"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement decimalDollar;

    /**
     * The fraction.
     * 
     */
    @SerializedName(value = "fraction", alternate = {"Fraction"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fraction;


    /**
     * Instiaciates a new WorkbookFunctionsDollarFrParameterSet
     */
    public WorkbookFunctionsDollarFrParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDollarFrParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDollarFrParameterSet(@Nonnull final WorkbookFunctionsDollarFrParameterSetBuilder builder) {
        this.decimalDollar = builder.decimalDollar;
        this.fraction = builder.fraction;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDollarFrParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDollarFrParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDollarFrParameterSet
     */
    public static final class WorkbookFunctionsDollarFrParameterSetBuilder {
        /**
         * The decimalDollar parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement decimalDollar;
        /**
         * Sets the DecimalDollar
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDollarFrParameterSetBuilder withDecimalDollar(@Nullable final com.google.gson.JsonElement val) {
            this.decimalDollar = val;
            return this;
        }
        /**
         * The fraction parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement fraction;
        /**
         * Sets the Fraction
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDollarFrParameterSetBuilder withFraction(@Nullable final com.google.gson.JsonElement val) {
            this.fraction = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDollarFrParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDollarFrParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDollarFrParameterSet build() {
            return new WorkbookFunctionsDollarFrParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.decimalDollar != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decimalDollar", decimalDollar));
        }
        if(this.fraction != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fraction", fraction));
        }
        return result;
    }
}
