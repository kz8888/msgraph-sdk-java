// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Create Or Get Parameter Set.
 */
public class OnlineMeetingCreateOrGetParameterSet {
    /**
     * The chat Info.
     * 
     */
    @SerializedName(value = "chatInfo", alternate = {"ChatInfo"})
    @Expose
	@Nullable
    public ChatInfo chatInfo;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The external Id.
     * 
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The participants.
     * 
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public MeetingParticipants participants;

    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The subject.
     * 
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;


    /**
     * Instiaciates a new OnlineMeetingCreateOrGetParameterSet
     */
    public OnlineMeetingCreateOrGetParameterSet() {}
    /**
     * Instiaciates a new OnlineMeetingCreateOrGetParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected OnlineMeetingCreateOrGetParameterSet(@Nonnull final OnlineMeetingCreateOrGetParameterSetBuilder builder) {
        this.chatInfo = builder.chatInfo;
        this.endDateTime = builder.endDateTime;
        this.externalId = builder.externalId;
        this.participants = builder.participants;
        this.startDateTime = builder.startDateTime;
        this.subject = builder.subject;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static OnlineMeetingCreateOrGetParameterSetBuilder newBuilder() {
        return new OnlineMeetingCreateOrGetParameterSetBuilder();
    }
    /**
     * Fluent builder for the OnlineMeetingCreateOrGetParameterSet
     */
    public static final class OnlineMeetingCreateOrGetParameterSetBuilder {
        /**
         * The chatInfo parameter value
         */
        @Nullable
        protected ChatInfo chatInfo;
        /**
         * Sets the ChatInfo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withChatInfo(@Nullable final ChatInfo val) {
            this.chatInfo = val;
            return this;
        }
        /**
         * The endDateTime parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime endDateTime;
        /**
         * Sets the EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withEndDateTime(@Nullable final java.time.OffsetDateTime val) {
            this.endDateTime = val;
            return this;
        }
        /**
         * The externalId parameter value
         */
        @Nullable
        protected String externalId;
        /**
         * Sets the ExternalId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withExternalId(@Nullable final String val) {
            this.externalId = val;
            return this;
        }
        /**
         * The participants parameter value
         */
        @Nullable
        protected MeetingParticipants participants;
        /**
         * Sets the Participants
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withParticipants(@Nullable final MeetingParticipants val) {
            this.participants = val;
            return this;
        }
        /**
         * The startDateTime parameter value
         */
        @Nullable
        protected java.time.OffsetDateTime startDateTime;
        /**
         * Sets the StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withStartDateTime(@Nullable final java.time.OffsetDateTime val) {
            this.startDateTime = val;
            return this;
        }
        /**
         * The subject parameter value
         */
        @Nullable
        protected String subject;
        /**
         * Sets the Subject
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSetBuilder withSubject(@Nullable final String val) {
            this.subject = val;
            return this;
        }
        /**
         * Instanciates a new OnlineMeetingCreateOrGetParameterSetBuilder
         */
        @Nullable
        protected OnlineMeetingCreateOrGetParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public OnlineMeetingCreateOrGetParameterSet build() {
            return new OnlineMeetingCreateOrGetParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.chatInfo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("chatInfo", chatInfo));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        if(this.externalId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("externalId", externalId));
        }
        if(this.participants != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("participants", participants));
        }
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.subject != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("subject", subject));
        }
        return result;
    }
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
