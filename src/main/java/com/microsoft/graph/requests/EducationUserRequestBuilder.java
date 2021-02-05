// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.requests.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationClassRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Request Builder.
 */
public class EducationUserRequestBuilder extends BaseRequestBuilder<EducationUser> {

    /**
     * The request builder for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationUserRequest instance
     */
    @Nonnull
    public EducationUserRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationUserRequest instance
     */
    @Nonnull
    public EducationUserRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationUserRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EducationClass collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationClass item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationClassWithReferenceRequestBuilder classes(@Nonnull final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationSchool collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationSchool item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationSchoolWithReferenceRequestBuilder schools(@Nonnull final String id) {
        return new EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public UserWithReferenceRequestBuilder user() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("user"), getClient(), null);
    }
}