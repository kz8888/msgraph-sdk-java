// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEventRequest;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventDismissReminderRequestBuilder;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.requests.extensions.IEventSnoozeReminderRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventAcceptRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventDeclineRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventTentativelyAcceptRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Request Builder.
 */
public interface IEventRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IEventRequest instance
     */
    IEventRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEventRequest instance
     */
    IEventRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IAttachmentCollectionRequestBuilder attachments();

    IAttachmentRequestBuilder attachments(final String id);

    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    ICalendarRequestBuilder calendar();

    IEventCollectionRequestBuilder instances();

    IEventRequestBuilder instances(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);
    IEventDismissReminderRequestBuilder dismissReminder();
    IEventSnoozeReminderRequestBuilder snoozeReminder(final DateTimeTimeZone newReminderTime);
    IEventAcceptRequestBuilder accept(final String comment, final Boolean sendResponse);
    IEventDeclineRequestBuilder decline(final String comment, final Boolean sendResponse);
    IEventTentativelyAcceptRequestBuilder tentativelyAccept(final String comment, final Boolean sendResponse);

}
