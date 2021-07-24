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
 * Represents contact entity of salesforce.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {

    private Attribute attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    private String masterRecordId;
    @JsonProperty("AccountId")
    private String accountId;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("Salutation")
    private String salutation;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("OtherStreet")
    private String otherStreet;
    @JsonProperty("OtherCity")
    private String otherCity;
    @JsonProperty("OtherState")
    private String otherState;
    @JsonProperty("OtherPostalCode")
    private String otherPostalCode;
    @JsonProperty("OtherCountry")
    private String otherCountry;
    @JsonProperty("OtherLatitude")
    private String otherLatitude;
    @JsonProperty("OtherLongitude")
    private String otherLongitude;
    @JsonProperty("OtherGeocodeAccuracy")
    private String otherGeocodeAccuracy;
    @JsonProperty("OtherAddress")
    private String otherAddress;
    @JsonProperty("MailingStreet")
    private String mailingStreet;
    @JsonProperty("MailingCity")
    private String mailingCity;
    @JsonProperty("MailingState")
    private String mailingState;
    @JsonProperty("MailingPostalCode")
    private String mailingPostalCode;
    @JsonProperty("MailingCountry")
    private String mailingCountry;
    @JsonProperty("MailingLatitude")
    private String mailingLatitude;
    @JsonProperty("MailingLongitude")
    private String mailingLongitude;
    @JsonProperty("MailingGeocodeAccuracy")
    private String mailingGeocodeAccuracy;
    @JsonProperty("MailingAddress")
    private String mailingAddress;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Fax")
    private String fax;
    @JsonProperty("MobilePhone")
    private String mobilePhone;
    @JsonProperty("HomePhone")
    private String homePhone;
    @JsonProperty("OtherPhone")
    private String otherPhone;
    @JsonProperty("AssistantPhone")
    private String assistantPhone;
    @JsonProperty("ReportsToId")
    private String reportsToId;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Department")
    private String department;
    @JsonProperty("AssistantName")
    private String assistantName;
    @JsonProperty("LeadSource")
    private String leadSource;
    @JsonProperty("Birthdate")
    private String birthdate;
    @JsonProperty("Description")
    private String description;
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
    @JsonProperty("LastCURequestDate")
    private String lastCuRequestDate;
    @JsonProperty("LastCUUpdateDate")
    private String lastCuUpdateDate;
    @JsonProperty("LastViewedDate")
    private Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    private Date lastReferencedDate;
    @JsonProperty("EmailBouncedReason")
    private String emailBouncedReason;
    @JsonProperty("EmailBouncedDate")
    private String emailBouncedDate;
    @JsonProperty("IsEmailBounced")
    private Boolean isEmailBounced;
    @JsonProperty("PhotoUrl")
    private String photoUrl;
    @JsonProperty("Jigsaw")
    private String jigsaw;
    @JsonProperty("JigsawContactId")
    private String jigsawContactId;
    @JsonProperty("CleanStatus")
    private String cleanStatus;
    @JsonProperty("IndividualId")
    private String individualId;
    @JsonProperty("Level__c")
    private String levelC;
    @JsonProperty("Languages__c")
    private String languagesC;

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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(final String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(final String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(final String otherState) {
        this.otherState = otherState;
    }

    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    public void setOtherPostalCode(final String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(final String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getOtherLatitude() {
        return otherLatitude;
    }

    public void setOtherLatitude(final String otherLatitude) {
        this.otherLatitude = otherLatitude;
    }

    public String getOtherLongitude() {
        return otherLongitude;
    }

    public void setOtherLongitude(final String otherLongitude) {
        this.otherLongitude = otherLongitude;
    }

    public String getOtherGeocodeAccuracy() {
        return otherGeocodeAccuracy;
    }

    public void setOtherGeocodeAccuracy(final String otherGeocodeAccuracy) {
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
    }

    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(final String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(final String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(final String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(final String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    public void setMailingPostalCode(final String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(final String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getMailingLatitude() {
        return mailingLatitude;
    }

    public void setMailingLatitude(final String mailingLatitude) {
        this.mailingLatitude = mailingLatitude;
    }

    public String getMailingLongitude() {
        return mailingLongitude;
    }

    public void setMailingLongitude(final String mailingLongitude) {
        this.mailingLongitude = mailingLongitude;
    }

    public String getMailingGeocodeAccuracy() {
        return mailingGeocodeAccuracy;
    }

    public void setMailingGeocodeAccuracy(final String mailingGeocodeAccuracy) {
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(final String mailingAddress) {
        this.mailingAddress = mailingAddress;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(final String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(final String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(final String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAssistantPhone() {
        return assistantPhone;
    }

    public void setAssistantPhone(final String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }

    public String getReportsToId() {
        return reportsToId;
    }

    public void setReportsToId(final String reportsToId) {
        this.reportsToId = reportsToId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(final String assistantName) {
        this.assistantName = assistantName;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(final String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(final String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
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

    public String getLastCuRequestDate() {
        return lastCuRequestDate;
    }

    public void setLastCuRequestDate(final String lastCuRequestDate) {
        this.lastCuRequestDate = lastCuRequestDate;
    }

    public String getLastCuUpdateDate() {
        return lastCuUpdateDate;
    }

    public void setLastCuUpdateDate(final String lastCuUpdateDate) {
        this.lastCuUpdateDate = lastCuUpdateDate;
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

    public String getEmailBouncedReason() {
        return emailBouncedReason;
    }

    public void setEmailBouncedReason(final String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }

    public String getEmailBouncedDate() {
        return emailBouncedDate;
    }

    public void setEmailBouncedDate(final String emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }

    public Boolean isEmailBounced() {
        return isEmailBounced;
    }

    public void setEmailBounced(final Boolean emailBounced) {
        isEmailBounced = emailBounced;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(final String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getJigsaw() {
        return jigsaw;
    }

    public void setJigsaw(final String jigsaw) {
        this.jigsaw = jigsaw;
    }

    public String getJigsawContactId() {
        return jigsawContactId;
    }

    public void setJigsawContactId(final String jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }

    public String getCleanStatus() {
        return cleanStatus;
    }

    public void setCleanStatus(final String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    public String getIndividualId() {
        return individualId;
    }

    public void setIndividualId(final String individualId) {
        this.individualId = individualId;
    }

    public String getLevelC() {
        return levelC;
    }

    public void setLevelC(final String levelC) {
        this.levelC = levelC;
    }

    public String getLanguagesC() {
        return languagesC;
    }

    public void setLanguagesC(final String languagesC) {
        this.languagesC = languagesC;
    }
}
