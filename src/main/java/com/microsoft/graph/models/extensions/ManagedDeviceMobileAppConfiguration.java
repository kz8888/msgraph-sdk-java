// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceSummary;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationUserStatus;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationUserSummary;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationUserStatusCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration.
 */
public class ManagedDeviceMobileAppConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * DateTime the object was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Admin provided description of the Device Configuration.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Admin provided name of the device configuration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * DateTime the object was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Targeted Mobile Apps.
     * the associated app.
     */
    @SerializedName(value = "targetedMobileApps", alternate = {"TargetedMobileApps"})
    @Expose
	@Nullable
    public java.util.List<String> targetedMobileApps;

    /**
     * The Version.
     * Version of the device configuration.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public Integer version;

    /**
     * The Assignments.
     * The list of group assignemenets for app configration.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationAssignmentCollectionPage assignments;

    /**
     * The Device Statuses.
     * List of ManagedDeviceMobileAppConfigurationDeviceStatus.
     */
    @SerializedName(value = "deviceStatuses", alternate = {"DeviceStatuses"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage deviceStatuses;

    /**
     * The Device Status Summary.
     * App configuration device status summary.
     */
    @SerializedName(value = "deviceStatusSummary", alternate = {"DeviceStatusSummary"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationDeviceSummary deviceStatusSummary;

    /**
     * The User Statuses.
     * List of ManagedDeviceMobileAppConfigurationUserStatus.
     */
    @SerializedName(value = "userStatuses", alternate = {"UserStatuses"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationUserStatusCollectionPage userStatuses;

    /**
     * The User Status Summary.
     * App configuration user status summary.
     */
    @SerializedName(value = "userStatusSummary", alternate = {"UserStatusSummary"})
    @Expose
	@Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary userStatusSummary;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), ManagedDeviceMobileAppConfigurationAssignmentCollectionPage.class);
        }

        if (json.has("deviceStatuses")) {
            deviceStatuses = serializer.deserializeObject(json.get("deviceStatuses").toString(), ManagedDeviceMobileAppConfigurationDeviceStatusCollectionPage.class);
        }

        if (json.has("userStatuses")) {
            userStatuses = serializer.deserializeObject(json.get("userStatuses").toString(), ManagedDeviceMobileAppConfigurationUserStatusCollectionPage.class);
        }
    }
}
