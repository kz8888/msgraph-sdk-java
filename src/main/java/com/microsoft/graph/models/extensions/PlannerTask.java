// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.PlannerPreviewType;
import com.microsoft.graph.models.extensions.PlannerAppliedCategories;
import com.microsoft.graph.models.extensions.PlannerAssignments;
import com.microsoft.graph.models.extensions.PlannerTaskDetails;
import com.microsoft.graph.models.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task.
 */
public class PlannerTask extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * Identity of the user that created the task.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Plan Id.
     * Plan ID to which the task belongs.
     */
    @SerializedName("planId")
    @Expose
    public String planId;

    /**
     * The Bucket Id.
     * Bucket ID to which the task belongs. The bucket needs to be in the plan that the task is in. It is 28 characters long and case-sensitive. Format validation is done on the service.
     */
    @SerializedName("bucketId")
    @Expose
    public String bucketId;

    /**
     * The Title.
     * Title of the task.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Order Hint.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName("orderHint")
    @Expose
    public String orderHint;

    /**
     * The Assignee Priority.
     * Hint used to order items of this type in a list view. The format is defined as outlined here.
     */
    @SerializedName("assigneePriority")
    @Expose
    public String assigneePriority;

    /**
     * The Percent Complete.
     * Percentage of task completion. When set to 100, the task is considered completed.
     */
    @SerializedName("percentComplete")
    @Expose
    public Integer percentComplete;

    /**
     * The Start Date Time.
     * Date and time at which the task starts. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Created Date Time.
     * Read-only. Date and time at which the task is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Due Date Time.
     * Date and time at which the task is due. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("dueDateTime")
    @Expose
    public java.util.Calendar dueDateTime;

    /**
     * The Has Description.
     * Read-only. Value is true if the details object of the task has a non-empty description and false otherwise.
     */
    @SerializedName("hasDescription")
    @Expose
    public Boolean hasDescription;

    /**
     * The Preview Type.
     * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
     */
    @SerializedName("previewType")
    @Expose
    public PlannerPreviewType previewType;

    /**
     * The Completed Date Time.
     * Read-only. Date and time at which the 'percentComplete' of the task is set to '100'. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("completedDateTime")
    @Expose
    public java.util.Calendar completedDateTime;

    /**
     * The Completed By.
     * Identity of the user that completed the task.
     */
    @SerializedName("completedBy")
    @Expose
    public IdentitySet completedBy;

    /**
     * The Reference Count.
     * Number of external references that exist on the task.
     */
    @SerializedName("referenceCount")
    @Expose
    public Integer referenceCount;

    /**
     * The Checklist Item Count.
     * Number of checklist items that are present on the task.
     */
    @SerializedName("checklistItemCount")
    @Expose
    public Integer checklistItemCount;

    /**
     * The Active Checklist Item Count.
     * Number of checklist items with value set to false, representing incomplete items.
     */
    @SerializedName("activeChecklistItemCount")
    @Expose
    public Integer activeChecklistItemCount;

    /**
     * The Applied Categories.
     * The categories to which the task has been applied. See applied Categories for possible values.
     */
    @SerializedName("appliedCategories")
    @Expose
    public PlannerAppliedCategories appliedCategories;

    /**
     * The Assignments.
     * The set of assignees the task is assigned to.
     */
    @SerializedName("assignments")
    @Expose
    public PlannerAssignments assignments;

    /**
     * The Conversation Thread Id.
     * Thread ID of the conversation on the task. This is the ID of the conversation thread object created in the group.
     */
    @SerializedName("conversationThreadId")
    @Expose
    public String conversationThreadId;

    /**
     * The Details.
     * Read-only. Nullable. Additional details about the task.
     */
    @SerializedName("details")
    @Expose
    public PlannerTaskDetails details;

    /**
     * The Assigned To Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by assignedTo.
     */
    @SerializedName("assignedToTaskBoardFormat")
    @Expose
    public PlannerAssignedToTaskBoardTaskFormat assignedToTaskBoardFormat;

    /**
     * The Progress Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by progress.
     */
    @SerializedName("progressTaskBoardFormat")
    @Expose
    public PlannerProgressTaskBoardTaskFormat progressTaskBoardFormat;

    /**
     * The Bucket Task Board Format.
     * Read-only. Nullable. Used to render the task correctly in the task board view when grouped by bucket.
     */
    @SerializedName("bucketTaskBoardFormat")
    @Expose
    public PlannerBucketTaskBoardTaskFormat bucketTaskBoardFormat;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
