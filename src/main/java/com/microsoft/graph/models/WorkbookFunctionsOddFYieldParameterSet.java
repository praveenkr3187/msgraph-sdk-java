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
 * The class for the Workbook Functions Odd FYield Parameter Set.
 */
public class WorkbookFunctionsOddFYieldParameterSet {
    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName(value = "maturity", alternate = {"Maturity"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maturity;

    /**
     * The issue.
     * 
     */
    @SerializedName(value = "issue", alternate = {"Issue"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement issue;

    /**
     * The first Coupon.
     * 
     */
    @SerializedName(value = "firstCoupon", alternate = {"FirstCoupon"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement firstCoupon;

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The pr.
     * 
     */
    @SerializedName(value = "pr", alternate = {"Pr"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pr;

    /**
     * The redemption.
     * 
     */
    @SerializedName(value = "redemption", alternate = {"Redemption"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement redemption;

    /**
     * The frequency.
     * 
     */
    @SerializedName(value = "frequency", alternate = {"Frequency"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;


    /**
     * Instiaciates a new WorkbookFunctionsOddFYieldParameterSet
     */
    public WorkbookFunctionsOddFYieldParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsOddFYieldParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsOddFYieldParameterSet(@Nonnull final WorkbookFunctionsOddFYieldParameterSetBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.issue = builder.issue;
        this.firstCoupon = builder.firstCoupon;
        this.rate = builder.rate;
        this.pr = builder.pr;
        this.redemption = builder.redemption;
        this.frequency = builder.frequency;
        this.basis = builder.basis;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsOddFYieldParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsOddFYieldParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsOddFYieldParameterSet
     */
    public static final class WorkbookFunctionsOddFYieldParameterSetBuilder {
        /**
         * The settlement parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement settlement;
        /**
         * Sets the Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        /**
         * The maturity parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement maturity;
        /**
         * Sets the Maturity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        /**
         * The issue parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement issue;
        /**
         * Sets the Issue
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withIssue(@Nullable final com.google.gson.JsonElement val) {
            this.issue = val;
            return this;
        }
        /**
         * The firstCoupon parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement firstCoupon;
        /**
         * Sets the FirstCoupon
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withFirstCoupon(@Nullable final com.google.gson.JsonElement val) {
            this.firstCoupon = val;
            return this;
        }
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
        public WorkbookFunctionsOddFYieldParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The pr parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pr;
        /**
         * Sets the Pr
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withPr(@Nullable final com.google.gson.JsonElement val) {
            this.pr = val;
            return this;
        }
        /**
         * The redemption parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement redemption;
        /**
         * Sets the Redemption
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withRedemption(@Nullable final com.google.gson.JsonElement val) {
            this.redemption = val;
            return this;
        }
        /**
         * The frequency parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement frequency;
        /**
         * Sets the Frequency
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withFrequency(@Nullable final com.google.gson.JsonElement val) {
            this.frequency = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsOddFYieldParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsOddFYieldParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsOddFYieldParameterSet build() {
            return new WorkbookFunctionsOddFYieldParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.maturity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maturity", maturity));
        }
        if(this.issue != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("issue", issue));
        }
        if(this.firstCoupon != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("firstCoupon", firstCoupon));
        }
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.pr != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pr", pr));
        }
        if(this.redemption != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("redemption", redemption));
        }
        if(this.frequency != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("frequency", frequency));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
        }
        return result;
    }
}
