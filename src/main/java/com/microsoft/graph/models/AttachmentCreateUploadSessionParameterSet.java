// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.AttachmentItem;
import com.microsoft.graph.models.UploadSession;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Create Upload Session Parameter Set.
 */
public class AttachmentCreateUploadSessionParameterSet {
    /**
     * The attachment Item.
     * 
     */
    @SerializedName(value = "attachmentItem", alternate = {"AttachmentItem"})
    @Expose
	@Nullable
    public AttachmentItem attachmentItem;


    /**
     * Instiaciates a new AttachmentCreateUploadSessionParameterSet
     */
    public AttachmentCreateUploadSessionParameterSet() {}
    /**
     * Instiaciates a new AttachmentCreateUploadSessionParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AttachmentCreateUploadSessionParameterSet(@Nonnull final AttachmentCreateUploadSessionParameterSetBuilder builder) {
        this.attachmentItem = builder.attachmentItem;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AttachmentCreateUploadSessionParameterSetBuilder newBuilder() {
        return new AttachmentCreateUploadSessionParameterSetBuilder();
    }
    /**
     * Fluent builder for the AttachmentCreateUploadSessionParameterSet
     */
    public static final class AttachmentCreateUploadSessionParameterSetBuilder {
        /**
         * The attachmentItem parameter value
         */
        @Nullable
        protected AttachmentItem attachmentItem;
        /**
         * Sets the AttachmentItem
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AttachmentCreateUploadSessionParameterSetBuilder withAttachmentItem(@Nullable final AttachmentItem val) {
            this.attachmentItem = val;
            return this;
        }
        /**
         * Instanciates a new AttachmentCreateUploadSessionParameterSetBuilder
         */
        @Nullable
        protected AttachmentCreateUploadSessionParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AttachmentCreateUploadSessionParameterSet build() {
            return new AttachmentCreateUploadSessionParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.attachmentItem != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("attachmentItem", attachmentItem));
        }
        return result;
    }
}
