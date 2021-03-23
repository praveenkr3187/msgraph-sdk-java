// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.Recipient;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Forward Parameter Set.
 */
public class EventForwardParameterSet {
    /**
     * The to Recipients.
     * 
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new EventForwardParameterSet
     */
    public EventForwardParameterSet() {}
    /**
     * Instiaciates a new EventForwardParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected EventForwardParameterSet(@Nonnull final EventForwardParameterSetBuilder builder) {
        this.toRecipients = builder.toRecipients;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static EventForwardParameterSetBuilder newBuilder() {
        return new EventForwardParameterSetBuilder();
    }
    /**
     * Fluent builder for the EventForwardParameterSet
     */
    public static final class EventForwardParameterSetBuilder {
        /**
         * The toRecipients parameter value
         */
        @Nullable
        protected java.util.List<Recipient> toRecipients;
        /**
         * Sets the ToRecipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventForwardParameterSetBuilder withToRecipients(@Nullable final java.util.List<Recipient> val) {
            this.toRecipients = val;
            return this;
        }
        /**
         * The comment parameter value
         */
        @Nullable
        protected String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public EventForwardParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * Instanciates a new EventForwardParameterSetBuilder
         */
        @Nullable
        protected EventForwardParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public EventForwardParameterSet build() {
            return new EventForwardParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.toRecipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("toRecipients", toRecipients));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        return result;
    }
}
