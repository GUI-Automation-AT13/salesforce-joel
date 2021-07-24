/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala.
 */

package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 * Represents product entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private Attribute attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ProductCode")
    private String productCode;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("CreatedDate")
    private Date createdDate;
    @JsonProperty("CreatedById")
    private String createdById;
    @JsonProperty("LastModifiedDate")
    private Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    private String lastModifiedById;
    @JsonProperty("SystemModstamp")
    private Date systemModstamp;
    @JsonProperty("Family")
    private String family;
    @JsonProperty("ExternalDataSourceId")
    private String externalDataSourceId;
    @JsonProperty("ExternalId")
    private String externalId;
    @JsonProperty("DisplayUrl")
    private String displayUrl;
    @JsonProperty("QuantityUnitOfMeasure")
    private String quantityUnitOfMeasure;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("IsArchived")
    private Boolean isArchived;
    @JsonProperty("LastViewedDate")
    private Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    private Date lastReferencedDate;
    @JsonProperty("StockKeepingUnit")
    private String stockKeepingUnit;

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(final Attribute attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(final String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(final Boolean active) {
        isActive = active;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(final String createdById) {
        this.createdById = createdById;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(final String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public Date getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(final Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(final String family) {
        this.family = family;
    }

    public String getExternalDataSourceId() {
        return externalDataSourceId;
    }

    public void setExternalDataSourceId(final String externalDataSourceId) {
        this.externalDataSourceId = externalDataSourceId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(final String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public String getQuantityUnitOfMeasure() {
        return quantityUnitOfMeasure;
    }

    public void setQuantityUnitOfMeasure(final String quantityUnitOfMeasure) {
        this.quantityUnitOfMeasure = quantityUnitOfMeasure;
    }

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(final Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean isArchived() {
        return isArchived;
    }

    public void setArchived(final Boolean archived) {
        isArchived = archived;
    }

    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(final Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(final Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    public String getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    public void setStockKeepingUnit(final String stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }
}
