// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Restore Version Parameter Set.
 */
public class ListItemVersionRestoreVersionParameterSet {

    /**
     * Instiaciates a new ListItemVersionRestoreVersionParameterSet
     */
    public ListItemVersionRestoreVersionParameterSet() {}
    /**
     * Instiaciates a new ListItemVersionRestoreVersionParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ListItemVersionRestoreVersionParameterSet(@Nonnull final ListItemVersionRestoreVersionParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ListItemVersionRestoreVersionParameterSetBuilder newBuilder() {
        return new ListItemVersionRestoreVersionParameterSetBuilder();
    }
    /**
     * Fluent builder for the ListItemVersionRestoreVersionParameterSet
     */
    public static final class ListItemVersionRestoreVersionParameterSetBuilder {
        /**
         * Instanciates a new ListItemVersionRestoreVersionParameterSetBuilder
         */
        @Nullable
        protected ListItemVersionRestoreVersionParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ListItemVersionRestoreVersionParameterSet build() {
            return new ListItemVersionRestoreVersionParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}