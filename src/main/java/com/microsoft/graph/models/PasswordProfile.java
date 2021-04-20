// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Password Profile.
 */
public class PasswordProfile implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Force Change Password Next Sign In.
     * If true, at next sign-in, the user must change their password. After a password change, this property will be automatically reset to false. If not set, default is false.
     */
    @SerializedName(value = "forceChangePasswordNextSignIn", alternate = {"ForceChangePasswordNextSignIn"})
    @Expose
	@Nullable
    public Boolean forceChangePasswordNextSignIn;

    /**
     * The Force Change Password Next Sign In With Mfa.
     * If true, at next sign-in, the user must perform a multi-factor authentication (MFA) before being forced to change their password. The behavior is identical to forceChangePasswordNextSignIn except that the user is required to first perform a multi-factor authentication before password change. After a password change, this property will be automatically reset to false. If not set, default is false.
     */
    @SerializedName(value = "forceChangePasswordNextSignInWithMfa", alternate = {"ForceChangePasswordNextSignInWithMfa"})
    @Expose
	@Nullable
    public Boolean forceChangePasswordNextSignInWithMfa;

    /**
     * The Password.
     * The password for the user. This property is required when a user is created. It can be updated, but the user will be required to change the password on the next login. The password must satisfy minimum requirements as specified by the user’s passwordPolicies property. By default, a strong password is required.
     */
    @SerializedName(value = "password", alternate = {"Password"})
    @Expose
	@Nullable
    public String password;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
