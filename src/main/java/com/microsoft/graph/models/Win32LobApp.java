// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.WindowsArchitecture;
import com.microsoft.graph.models.Win32LobAppInstallExperience;
import com.microsoft.graph.models.Win32LobAppMsiInformation;
import com.microsoft.graph.models.Win32LobAppReturnCode;
import com.microsoft.graph.models.Win32LobAppRule;
import com.microsoft.graph.models.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App.
 */
public class Win32LobApp extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Applicable Architectures.
     * The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral, arm64.
     */
    @SerializedName(value = "applicableArchitectures", alternate = {"ApplicableArchitectures"})
    @Expose
	@Nullable
    public EnumSet<WindowsArchitecture> applicableArchitectures;

    /**
     * The Install Command Line.
     * The command line to install this app
     */
    @SerializedName(value = "installCommandLine", alternate = {"InstallCommandLine"})
    @Expose
	@Nullable
    public String installCommandLine;

    /**
     * The Install Experience.
     * The install experience for this app.
     */
    @SerializedName(value = "installExperience", alternate = {"InstallExperience"})
    @Expose
	@Nullable
    public Win32LobAppInstallExperience installExperience;

    /**
     * The Minimum Cpu Speed In MHz.
     * The value for the minimum CPU speed which is required to install this app.
     */
    @SerializedName(value = "minimumCpuSpeedInMHz", alternate = {"MinimumCpuSpeedInMHz"})
    @Expose
	@Nullable
    public Integer minimumCpuSpeedInMHz;

    /**
     * The Minimum Free Disk Space In MB.
     * The value for the minimum free disk space which is required to install this app.
     */
    @SerializedName(value = "minimumFreeDiskSpaceInMB", alternate = {"MinimumFreeDiskSpaceInMB"})
    @Expose
	@Nullable
    public Integer minimumFreeDiskSpaceInMB;

    /**
     * The Minimum Memory In MB.
     * The value for the minimum physical memory which is required to install this app.
     */
    @SerializedName(value = "minimumMemoryInMB", alternate = {"MinimumMemoryInMB"})
    @Expose
	@Nullable
    public Integer minimumMemoryInMB;

    /**
     * The Minimum Number Of Processors.
     * The value for the minimum number of processors which is required to install this app.
     */
    @SerializedName(value = "minimumNumberOfProcessors", alternate = {"MinimumNumberOfProcessors"})
    @Expose
	@Nullable
    public Integer minimumNumberOfProcessors;

    /**
     * The Minimum Supported Windows Release.
     * The value for the minimum supported windows release.
     */
    @SerializedName(value = "minimumSupportedWindowsRelease", alternate = {"MinimumSupportedWindowsRelease"})
    @Expose
	@Nullable
    public String minimumSupportedWindowsRelease;

    /**
     * The Msi Information.
     * The MSI details if this Win32 app is an MSI app.
     */
    @SerializedName(value = "msiInformation", alternate = {"MsiInformation"})
    @Expose
	@Nullable
    public Win32LobAppMsiInformation msiInformation;

    /**
     * The Return Codes.
     * The return codes for post installation behavior.
     */
    @SerializedName(value = "returnCodes", alternate = {"ReturnCodes"})
    @Expose
	@Nullable
    public java.util.List<Win32LobAppReturnCode> returnCodes;

    /**
     * The Rules.
     * The detection and requirement rules for this app.
     */
    @SerializedName(value = "rules", alternate = {"Rules"})
    @Expose
	@Nullable
    public java.util.List<Win32LobAppRule> rules;

    /**
     * The Setup File Path.
     * The relative path of the setup file in the encrypted Win32LobApp package.
     */
    @SerializedName(value = "setupFilePath", alternate = {"SetupFilePath"})
    @Expose
	@Nullable
    public String setupFilePath;

    /**
     * The Uninstall Command Line.
     * The command line to uninstall this app
     */
    @SerializedName(value = "uninstallCommandLine", alternate = {"UninstallCommandLine"})
    @Expose
	@Nullable
    public String uninstallCommandLine;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}