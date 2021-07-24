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
 * Represents account entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {

    private Attribute attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    private String masterRecordId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("ParentId")
    private String parentId;
    @JsonProperty("BillingStreet")
    private String billingStreet;
    @JsonProperty("BillingCity")
    private String billingCity;
    @JsonProperty("BillingState")
    private String billingState;
    @JsonProperty("BillingPostalCode")
    private String billingPostalCode;
    @JsonProperty("BillingCountry")
    private String billingCountry;
    @JsonProperty("BillingLatitude")
    private String billingLatitude;
    @JsonProperty("BillingLongitude")
    private String billingLongitude;
    @JsonProperty("BillingGeocodeAccuracy")
    private String billingGeocodeAccuracy;
    @JsonProperty("BillingAddress")
    private Address billingAddress;
    @JsonProperty("ShippingStreet")
    private String shippingStreet;
    @JsonProperty("ShippingCity")
    private String shippingCity;
    @JsonProperty("ShippingState")
    private String shippingState;
    @JsonProperty("ShippingPostalCode")
    private String shippingPostalCode;
    @JsonProperty("ShippingCountry")
    private String shippingCountry;
    @JsonProperty("ShippingLatitude")
    private String shippingLatitude;
    @JsonProperty("ShippingLongitude")
    private String shippingLongitude;
    @JsonProperty("ShippingGeocodeAccuracy")
    private String shippingGeocodeAccuracy;
    @JsonProperty("ShippingAddress")
    private Address shippingAddress;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Fax")
    private String fax;
    @JsonProperty("AccountNumber")
    private String accountNumber;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("PhotoUrl")
    private String photoUrl;
    @JsonProperty("Sic")
    private String sic;
    @JsonProperty("Industry")
    private String industry;
    @JsonProperty("AnnualRevenue")
    private String annualRevenue;
    @JsonProperty("NumberOfEmployees")
    private String numberOfEmployees;
    @JsonProperty("Ownership")
    private String ownership;
    @JsonProperty("TickerSymbol")
    private String tickerSymbol;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Rating")
    private String rating;
    @JsonProperty("Site")
    private String site;
    @JsonProperty("OwnerId")
    private String ownerId;
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
    @JsonProperty("LastActivityDate")
    private String lastActivityDate;
    @JsonProperty("LastViewedDate")
    private Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    private Date lastReferencedDate;
    @JsonProperty("Jigsaw")
    private String jigsaw;
    @JsonProperty("JigsawCompanyId")
    private String jigsawCompanyId;
    @JsonProperty("CleanStatus")
    private String cleanStatus;
    @JsonProperty("AccountSource")
    private String accountSource;
    @JsonProperty("DunsNumber")
    private String dunsNumber;
    @JsonProperty("Tradestyle")
    private String tradestyle;
    @JsonProperty("NaicsCode")
    private String naicsCode;
    @JsonProperty("NaicsDesc")
    private String naicsDesc;
    @JsonProperty("YearStarted")
    private String yearStarted;
    @JsonProperty("SicDesc")
    private String sicDesc;
    @JsonProperty("DandbCompanyId")
    private String dandbCompanyId;
    @JsonProperty("OperatingHoursId")
    private String operatingHoursId;
    @JsonProperty("CustomerPriority__c")
    private String customerPriorityC;
    @JsonProperty("SLA__c")
    private String slaC;
    @JsonProperty("Active__c")
    private String activeC;
    @JsonProperty("NumberofLocations__c")
    private String numberofLocationsC;
    @JsonProperty("UpsellOpportunity__c")
    private String upsellOpportunityC;
    @JsonProperty("SLASerialNumber__c")
    private String slaSerialNumberC;
    @JsonProperty("SLAExpirationDate__c")
    private String slaExpirationDateC;

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

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(final Boolean deleted) {
        isDeleted = deleted;
    }

    public String getMasterRecordId() {
        return masterRecordId;
    }

    public void setMasterRecordId(final String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(final String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(final String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(final String billingState) {
        this.billingState = billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(final String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(final String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingLatitude() {
        return billingLatitude;
    }

    public void setBillingLatitude(final String billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    public String getBillingLongitude() {
        return billingLongitude;
    }

    public void setBillingLongitude(final String billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    public String getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    public void setBillingGeocodeAccuracy(final String billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(final Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(final String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(final String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(final String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(final String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(final String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingLatitude() {
        return shippingLatitude;
    }

    public void setShippingLatitude(final String shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    public String getShippingLongitude() {
        return shippingLongitude;
    }

    public void setShippingLongitude(final String shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    public String getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    public void setShippingGeocodeAccuracy(final String shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(final Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(final String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getSic() {
        return sic;
    }

    public void setSic(final String sic) {
        this.sic = sic;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(final String industry) {
        this.industry = industry;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(final String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(final String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(final String ownership) {
        this.ownership = ownership;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(final String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(final String rating) {
        this.rating = rating;
    }

    public String getSite() {
        return site;
    }

    public void setSite(final String site) {
        this.site = site;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(final String ownerId) {
        this.ownerId = ownerId;
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

    public String getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(final String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
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

    public String getJigsaw() {
        return jigsaw;
    }

    public void setJigsaw(final String jigsaw) {
        this.jigsaw = jigsaw;
    }

    public String getJigsawCompanyId() {
        return jigsawCompanyId;
    }

    public void setJigsawCompanyId(final String jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }

    public String getCleanStatus() {
        return cleanStatus;
    }

    public void setCleanStatus(final String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    public String getAccountSource() {
        return accountSource;
    }

    public void setAccountSource(final String accountSource) {
        this.accountSource = accountSource;
    }

    public String getDunsNumber() {
        return dunsNumber;
    }

    public void setDunsNumber(final String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    public String getTradestyle() {
        return tradestyle;
    }

    public void setTradestyle(final String tradestyle) {
        this.tradestyle = tradestyle;
    }

    public String getNaicsCode() {
        return naicsCode;
    }

    public void setNaicsCode(final String naicsCode) {
        this.naicsCode = naicsCode;
    }

    public String getNaicsDesc() {
        return naicsDesc;
    }

    public void setNaicsDesc(final String naicsDesc) {
        this.naicsDesc = naicsDesc;
    }

    public String getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(final String yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getSicDesc() {
        return sicDesc;
    }

    public void setSicDesc(final String sicDesc) {
        this.sicDesc = sicDesc;
    }

    public String getDandbCompanyId() {
        return dandbCompanyId;
    }

    public void setDandbCompanyId(final String dandbCompanyId) {
        this.dandbCompanyId = dandbCompanyId;
    }

    public String getOperatingHoursId() {
        return operatingHoursId;
    }

    public void setOperatingHoursId(final String operatingHoursId) {
        this.operatingHoursId = operatingHoursId;
    }

    public String getCustomerPriorityC() {
        return customerPriorityC;
    }

    public void setCustomerPriorityC(final String customerPriorityC) {
        this.customerPriorityC = customerPriorityC;
    }

    public String getSlaC() {
        return slaC;
    }

    public void setSlaC(final String slaC) {
        this.slaC = slaC;
    }

    public String getActiveC() {
        return activeC;
    }

    public void setActiveC(final String activeC) {
        this.activeC = activeC;
    }

    public String getNumberofLocationsC() {
        return numberofLocationsC;
    }

    public void setNumberofLocationsC(final String numberofLocationsC) {
        this.numberofLocationsC = numberofLocationsC;
    }

    public String getUpsellOpportunityC() {
        return upsellOpportunityC;
    }

    public void setUpsellOpportunityC(final String upsellOpportunityC) {
        this.upsellOpportunityC = upsellOpportunityC;
    }

    public String getSlaSerialNumberC() {
        return slaSerialNumberC;
    }

    public void setSlaSerialNumberC(final String slaSerialNumberC) {
        this.slaSerialNumberC = slaSerialNumberC;
    }

    public String getSlaExpirationDateC() {
        return slaExpirationDateC;
    }

    public void setSlaExpirationDateC(final String slaExpirationDateC) {
        this.slaExpirationDateC = slaExpirationDateC;
    }
}
