// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Check Member Groups Parameter Set.
 */
public class DirectoryObjectCheckMemberGroupsParameterSet {
    /**
     * The group Ids.
     * 
     */
    @SerializedName(value = "groupIds", alternate = {"GroupIds"})
    @Expose
	@Nullable
    public java.util.List<String> groupIds;


    /**
     * Instiaciates a new DirectoryObjectCheckMemberGroupsParameterSet
     */
    public DirectoryObjectCheckMemberGroupsParameterSet() {}
    /**
     * Instiaciates a new DirectoryObjectCheckMemberGroupsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DirectoryObjectCheckMemberGroupsParameterSet(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSetBuilder builder) {
        this.groupIds = builder.groupIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DirectoryObjectCheckMemberGroupsParameterSetBuilder newBuilder() {
        return new DirectoryObjectCheckMemberGroupsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DirectoryObjectCheckMemberGroupsParameterSet
     */
    public static final class DirectoryObjectCheckMemberGroupsParameterSetBuilder {
        /**
         * The groupIds parameter value
         */
        @Nullable
        protected java.util.List<String> groupIds;
        /**
         * Sets the GroupIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectCheckMemberGroupsParameterSetBuilder withGroupIds(@Nullable final java.util.List<String> val) {
            this.groupIds = val;
            return this;
        }
        /**
         * Instanciates a new DirectoryObjectCheckMemberGroupsParameterSetBuilder
         */
        @Nullable
        protected DirectoryObjectCheckMemberGroupsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DirectoryObjectCheckMemberGroupsParameterSet build() {
            return new DirectoryObjectCheckMemberGroupsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupIds", groupIds));
        }
        return result;
    }
}
