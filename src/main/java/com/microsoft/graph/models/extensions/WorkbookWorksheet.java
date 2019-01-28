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
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet.
 */
public class WorkbookWorksheet extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * The display name of the worksheet.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Position.
     * The zero-based position of the worksheet within the workbook.
     */
    @SerializedName("position")
    @Expose
    public Integer position;

    /**
     * The Visibility.
     * The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Charts.
     * Returns collection of charts that are part of the worksheet. Read-only.
     */
    public WorkbookChartCollectionPage charts;

    /**
     * The Names.
     * Returns collection of names that are associated with the worksheet. Read-only.
     */
    public WorkbookNamedItemCollectionPage names;

    /**
     * The Pivot Tables.
     * Collection of PivotTables that are part of the worksheet.
     */
    public WorkbookPivotTableCollectionPage pivotTables;

    /**
     * The Protection.
     * Returns sheet protection object for a worksheet. Read-only.
     */
    @SerializedName("protection")
    @Expose
    public WorkbookWorksheetProtection protection;

    /**
     * The Tables.
     * Collection of tables that are part of the worksheet. Read-only.
     */
    public WorkbookTableCollectionPage tables;


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


        if (json.has("charts")) {
            final WorkbookChartCollectionResponse response = new WorkbookChartCollectionResponse();
            if (json.has("charts@odata.nextLink")) {
                response.nextLink = json.get("charts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("charts").toString(), JsonObject[].class);
            final WorkbookChart[] array = new WorkbookChart[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookChart.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            charts = new WorkbookChartCollectionPage(response, null);
        }

        if (json.has("names")) {
            final WorkbookNamedItemCollectionResponse response = new WorkbookNamedItemCollectionResponse();
            if (json.has("names@odata.nextLink")) {
                response.nextLink = json.get("names@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("names").toString(), JsonObject[].class);
            final WorkbookNamedItem[] array = new WorkbookNamedItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookNamedItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            names = new WorkbookNamedItemCollectionPage(response, null);
        }

        if (json.has("pivotTables")) {
            final WorkbookPivotTableCollectionResponse response = new WorkbookPivotTableCollectionResponse();
            if (json.has("pivotTables@odata.nextLink")) {
                response.nextLink = json.get("pivotTables@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pivotTables").toString(), JsonObject[].class);
            final WorkbookPivotTable[] array = new WorkbookPivotTable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookPivotTable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pivotTables = new WorkbookPivotTableCollectionPage(response, null);
        }

        if (json.has("tables")) {
            final WorkbookTableCollectionResponse response = new WorkbookTableCollectionResponse();
            if (json.has("tables@odata.nextLink")) {
                response.nextLink = json.get("tables@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tables").toString(), JsonObject[].class);
            final WorkbookTable[] array = new WorkbookTable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookTable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tables = new WorkbookTableCollectionPage(response, null);
        }
    }
}
