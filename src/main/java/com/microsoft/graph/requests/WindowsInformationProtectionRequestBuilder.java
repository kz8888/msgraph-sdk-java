// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsInformationProtection;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLockerFileCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsInformationProtectionAppLockerFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WindowsInformationProtectionAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Request Builder.
 */
public class WindowsInformationProtectionRequestBuilder extends BaseRequestBuilder<WindowsInformationProtection> {

    /**
     * The request builder for the WindowsInformationProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsInformationProtectionRequest instance
     */
    @Nonnull
    public WindowsInformationProtectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsInformationProtectionRequest instance
     */
    @Nonnull
    public WindowsInformationProtectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WindowsInformationProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TargetedManagedAppPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public TargetedManagedAppPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLockerFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLockerFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(@Nonnull final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the WindowsInformationProtectionAppLockerFile collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsInformationProtectionAppLockerFile item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(@Nonnull final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsInformationProtectionAssignRequestBuilder assign(@Nonnull final WindowsInformationProtectionAssignParameterSet parameters) {
        return new WindowsInformationProtectionAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}