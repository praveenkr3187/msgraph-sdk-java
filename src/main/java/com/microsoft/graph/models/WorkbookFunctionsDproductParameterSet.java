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
 * The class for the Workbook Functions Dproduct Parameter Set.
 */
public class WorkbookFunctionsDproductParameterSet {
    /**
     * The database.
     * 
     */
    @SerializedName(value = "database", alternate = {"Database"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement database;

    /**
     * The field.
     * 
     */
    @SerializedName(value = "field", alternate = {"Field"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement field;

    /**
     * The criteria.
     * 
     */
    @SerializedName(value = "criteria", alternate = {"Criteria"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement criteria;


    /**
     * Instiaciates a new WorkbookFunctionsDproductParameterSet
     */
    public WorkbookFunctionsDproductParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDproductParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDproductParameterSet(@Nonnull final WorkbookFunctionsDproductParameterSetBuilder builder) {
        this.database = builder.database;
        this.field = builder.field;
        this.criteria = builder.criteria;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDproductParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDproductParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDproductParameterSet
     */
    public static final class WorkbookFunctionsDproductParameterSetBuilder {
        /**
         * The database parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement database;
        /**
         * Sets the Database
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDproductParameterSetBuilder withDatabase(@Nullable final com.google.gson.JsonElement val) {
            this.database = val;
            return this;
        }
        /**
         * The field parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement field;
        /**
         * Sets the Field
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDproductParameterSetBuilder withField(@Nullable final com.google.gson.JsonElement val) {
            this.field = val;
            return this;
        }
        /**
         * The criteria parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement criteria;
        /**
         * Sets the Criteria
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDproductParameterSetBuilder withCriteria(@Nullable final com.google.gson.JsonElement val) {
            this.criteria = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDproductParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDproductParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDproductParameterSet build() {
            return new WorkbookFunctionsDproductParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.database != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("database", database));
        }
        if(this.field != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("field", field));
        }
        if(this.criteria != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria", criteria));
        }
        return result;
    }
}
