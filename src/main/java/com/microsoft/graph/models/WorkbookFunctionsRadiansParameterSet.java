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
 * The class for the Workbook Functions Radians Parameter Set.
 */
public class WorkbookFunctionsRadiansParameterSet {
    /**
     * The angle.
     * 
     */
    @SerializedName(value = "angle", alternate = {"Angle"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement angle;


    /**
     * Instiaciates a new WorkbookFunctionsRadiansParameterSet
     */
    public WorkbookFunctionsRadiansParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsRadiansParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsRadiansParameterSet(@Nonnull final WorkbookFunctionsRadiansParameterSetBuilder builder) {
        this.angle = builder.angle;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRadiansParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsRadiansParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRadiansParameterSet
     */
    public static final class WorkbookFunctionsRadiansParameterSetBuilder {
        /**
         * The angle parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement angle;
        /**
         * Sets the Angle
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRadiansParameterSetBuilder withAngle(@Nullable final com.google.gson.JsonElement val) {
            this.angle = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsRadiansParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsRadiansParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRadiansParameterSet build() {
            return new WorkbookFunctionsRadiansParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.angle != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("angle", angle));
        }
        return result;
    }
}
