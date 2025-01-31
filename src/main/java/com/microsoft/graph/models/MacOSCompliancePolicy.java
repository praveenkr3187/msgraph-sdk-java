// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.RequiredPasswordType;
import com.microsoft.graph.models.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCompliance Policy.
 */
public class MacOSCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection.
     */
    @SerializedName(value = "deviceThreatProtectionEnabled", alternate = {"DeviceThreatProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     */
    @SerializedName(value = "deviceThreatProtectionRequiredSecurityLevel", alternate = {"DeviceThreatProtectionRequiredSecurityLevel"})
    @Expose
	@Nullable
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Firewall Block All Incoming.
     * Corresponds to the 'Block all incoming connections' option.
     */
    @SerializedName(value = "firewallBlockAllIncoming", alternate = {"FirewallBlockAllIncoming"})
    @Expose
	@Nullable
    public Boolean firewallBlockAllIncoming;

    /**
     * The Firewall Enabled.
     * Whether the firewall should be enabled or not.
     */
    @SerializedName(value = "firewallEnabled", alternate = {"FirewallEnabled"})
    @Expose
	@Nullable
    public Boolean firewallEnabled;

    /**
     * The Firewall Enable Stealth Mode.
     * Corresponds to 'Enable stealth mode.'
     */
    @SerializedName(value = "firewallEnableStealthMode", alternate = {"FirewallEnableStealthMode"})
    @Expose
	@Nullable
    public Boolean firewallEnableStealthMode;

    /**
     * The Os Maximum Version.
     * Maximum MacOS version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum MacOS version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Indicates whether or not to block simple passwords.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
	@Nullable
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 65535
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum length of password. Valid values 4 to 14
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 1 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Whether or not to require a password.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Storage Require Encryption.
     * Require encryption on Mac OS devices.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireEncryption;

    /**
     * The System Integrity Protection Enabled.
     * Require that devices have enabled system integrity protection.
     */
    @SerializedName(value = "systemIntegrityProtectionEnabled", alternate = {"SystemIntegrityProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean systemIntegrityProtectionEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
