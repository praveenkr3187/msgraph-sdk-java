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
 * The class for the Workbook Functions Fisher Inv Parameter Set.
 */
public class WorkbookFunctionsFisherInvParameterSet {
    /**
     * The y.
     * 
     */
    @SerializedName(value = "y", alternate = {"Y"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement y;


    /**
     * Instiaciates a new WorkbookFunctionsFisherInvParameterSet
     */
    public WorkbookFunctionsFisherInvParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsFisherInvParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsFisherInvParameterSet(@Nonnull final WorkbookFunctionsFisherInvParameterSetBuilder builder) {
        this.y = builder.y;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFisherInvParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsFisherInvParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFisherInvParameterSet
     */
    public static final class WorkbookFunctionsFisherInvParameterSetBuilder {
        /**
         * The y parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement y;
        /**
         * Sets the Y
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFisherInvParameterSetBuilder withY(@Nullable final com.google.gson.JsonElement val) {
            this.y = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsFisherInvParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsFisherInvParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFisherInvParameterSet build() {
            return new WorkbookFunctionsFisherInvParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.y != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("y", y));
        }
        return result;
    }
}
