// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookRange;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Bounding Rect Parameter Set.
 */
public class WorkbookRangeBoundingRectParameterSet {
    /**
     * The another Range.
     * 
     */
    @SerializedName(value = "anotherRange", alternate = {"AnotherRange"})
    @Expose
	@Nullable
    public String anotherRange;


    /**
     * Instiaciates a new WorkbookRangeBoundingRectParameterSet
     */
    public WorkbookRangeBoundingRectParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeBoundingRectParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeBoundingRectParameterSet(@Nonnull final WorkbookRangeBoundingRectParameterSetBuilder builder) {
        this.anotherRange = builder.anotherRange;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeBoundingRectParameterSetBuilder newBuilder() {
        return new WorkbookRangeBoundingRectParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeBoundingRectParameterSet
     */
    public static final class WorkbookRangeBoundingRectParameterSetBuilder {
        /**
         * The anotherRange parameter value
         */
        @Nullable
        protected String anotherRange;
        /**
         * Sets the AnotherRange
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeBoundingRectParameterSetBuilder withAnotherRange(@Nullable final String val) {
            this.anotherRange = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookRangeBoundingRectParameterSetBuilder
         */
        @Nullable
        protected WorkbookRangeBoundingRectParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeBoundingRectParameterSet build() {
            return new WorkbookRangeBoundingRectParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.anotherRange != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("anotherRange", anotherRange));
        }
        return result;
    }
}
