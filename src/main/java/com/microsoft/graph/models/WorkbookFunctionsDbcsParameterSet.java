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
 * The class for the Workbook Functions Dbcs Parameter Set.
 */
public class WorkbookFunctionsDbcsParameterSet {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;


    /**
     * Instiaciates a new WorkbookFunctionsDbcsParameterSet
     */
    public WorkbookFunctionsDbcsParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDbcsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDbcsParameterSet(@Nonnull final WorkbookFunctionsDbcsParameterSetBuilder builder) {
        this.text = builder.text;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDbcsParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDbcsParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDbcsParameterSet
     */
    public static final class WorkbookFunctionsDbcsParameterSetBuilder {
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
        public WorkbookFunctionsDbcsParameterSetBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDbcsParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDbcsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDbcsParameterSet build() {
            return new WorkbookFunctionsDbcsParameterSet(this);
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
        return result;
    }
}
