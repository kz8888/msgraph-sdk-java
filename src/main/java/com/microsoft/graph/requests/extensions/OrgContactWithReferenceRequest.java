// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Org Contact With Reference Request.
 */
public class OrgContactWithReferenceRequest extends BaseRequest implements IOrgContactWithReferenceRequest {

    /**
     * The request for the OrgContact
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrgContactWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OrgContact.class);
    }

    public void post(final OrgContact newOrgContact, final IJsonBackedObject payload, final ICallback<? super OrgContact> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public OrgContact post(final OrgContact newOrgContact, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newOrgContact;
        }
        return null;
    }

    public void get(final ICallback<? super OrgContact> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public OrgContact get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super OrgContact> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final OrgContact sourceOrgContact, final ICallback<? super OrgContact> callback) {
		send(HttpMethod.PATCH, callback, sourceOrgContact);
	}

	public OrgContact patch(final OrgContact sourceOrgContact) throws ClientException {
		return send(HttpMethod.PATCH, sourceOrgContact);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOrgContactWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOrgContactWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOrgContactWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OrgContactWithReferenceRequest)this;
    }
}