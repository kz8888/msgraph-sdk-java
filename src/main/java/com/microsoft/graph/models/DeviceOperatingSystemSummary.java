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
 * The class for the Device Operating System Summary.
 */
public class DeviceOperatingSystemSummary implements IJsonBackedObject {

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
     * The Android Count.
     * Number of android device count.
     */
    @SerializedName(value = "androidCount", alternate = {"AndroidCount"})
    @Expose
	@Nullable
    public Integer androidCount;

    /**
     * The Ios Count.
     * Number of iOS device count.
     */
    @SerializedName(value = "iosCount", alternate = {"IosCount"})
    @Expose
	@Nullable
    public Integer iosCount;

    /**
     * The Mac OSCount.
     * Number of Mac OS X device count.
     */
    @SerializedName(value = "macOSCount", alternate = {"MacOSCount"})
    @Expose
	@Nullable
    public Integer macOSCount;

    /**
     * The Unknown Count.
     * Number of unknown device count.
     */
    @SerializedName(value = "unknownCount", alternate = {"UnknownCount"})
    @Expose
	@Nullable
    public Integer unknownCount;

    /**
     * The Windows Count.
     * Number of Windows device count.
     */
    @SerializedName(value = "windowsCount", alternate = {"WindowsCount"})
    @Expose
	@Nullable
    public Integer windowsCount;

    /**
     * The Windows Mobile Count.
     * Number of Windows mobile device count.
     */
    @SerializedName(value = "windowsMobileCount", alternate = {"WindowsMobileCount"})
    @Expose
	@Nullable
    public Integer windowsMobileCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}