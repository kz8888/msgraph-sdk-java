// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
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
 * The class for the Uri Click Security State.
 */
public class UriClickSecurityState implements IJsonBackedObject {

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
     * The Click Action.
     * 
     */
    @SerializedName(value = "clickAction", alternate = {"ClickAction"})
    @Expose
	@Nullable
    public String clickAction;

    /**
     * The Click Date Time.
     * 
     */
    @SerializedName(value = "clickDateTime", alternate = {"ClickDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime clickDateTime;

    /**
     * The Id.
     * 
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Source Id.
     * 
     */
    @SerializedName(value = "sourceId", alternate = {"SourceId"})
    @Expose
	@Nullable
    public String sourceId;

    /**
     * The Uri Domain.
     * 
     */
    @SerializedName(value = "uriDomain", alternate = {"UriDomain"})
    @Expose
	@Nullable
    public String uriDomain;

    /**
     * The Verdict.
     * 
     */
    @SerializedName(value = "verdict", alternate = {"Verdict"})
    @Expose
	@Nullable
    public String verdict;


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

    }
}
