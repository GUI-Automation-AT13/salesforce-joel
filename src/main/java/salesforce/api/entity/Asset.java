package salesforce.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 * Represents asset entity of salesforce.
 */
public class Asset {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("ContactId")
    public String contactId;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("AccountName")
    public String accountName;
    @JsonProperty("ParentId")
    public Object parentId;
    @JsonProperty("RootAssetId")
    public String rootAssetId;
    @JsonProperty("Product2Id")
    public String product2Id;
    @JsonProperty("ProductCode")
    public Object productCode;
    @JsonProperty("ProductName")
    public String productName;
    @JsonProperty("ContactName")
    public String contactName;
    @JsonProperty("IsCompetitorProduct")
    public boolean isCompetitorProduct;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public Date systemModstamp;
    @JsonProperty("IsDeleted")
    public boolean isDeleted;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("SerialNumber")
    public String serialNumber;
    @JsonProperty("InstallDate")
    public String installDate;
    @JsonProperty("PurchaseDate")
    public String purchaseDate;
    @JsonProperty("UsageEndDate")
    public String usageEndDate;
    @JsonProperty("LifecycleStartDate")
    public Object lifecycleStartDate;
    @JsonProperty("LifecycleEndDate")
    public Object lifecycleEndDate;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Price")
    public double price;
    @JsonProperty("Quantity")
    public double quantity;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("AssetProvidedById")
    public Object assetProvidedById;
    @JsonProperty("AssetServicedById")
    public Object assetServicedById;
    @JsonProperty("IsInternal")
    public boolean isInternal;
    @JsonProperty("AssetLevel")
    public int assetLevel;
    @JsonProperty("StockKeepingUnit")
    public Object stockKeepingUnit;
    @JsonProperty("HasLifecycleManagement")
    public boolean hasLifecycleManagement;
    @JsonProperty("CurrentMrr")
    public Object currentMrr;
    @JsonProperty("CurrentLifecycleEndDate")
    public Object currentLifecycleEndDate;
    @JsonProperty("CurrentQuantity")
    public Object currentQuantity;
    @JsonProperty("CurrentAmount")
    public Object currentAmount;
    @JsonProperty("TotalLifecycleAmount")
    public Object totalLifecycleAmount;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public String getRootAssetId() {
        return rootAssetId;
    }

    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    public String getProduct2Id() {
        return product2Id;
    }

    public void setProduct2Id(String product2Id) {
        this.product2Id = product2Id;
    }

    public Object getProductCode() {
        return productCode;
    }

    public void setProductCode(Object productCode) {
        this.productCode = productCode;
    }

    public boolean isCompetitorProduct() {
        return isCompetitorProduct;
    }

    public void setCompetitorProduct(boolean competitorProduct) {
        isCompetitorProduct = competitorProduct;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public Date getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getUsageEndDate() {
        return usageEndDate;
    }

    public void setUsageEndDate(String usageEndDate) {
        this.usageEndDate = usageEndDate;
    }

    public Object getLifecycleStartDate() {
        return lifecycleStartDate;
    }

    public void setLifecycleStartDate(Object lifecycleStartDate) {
        this.lifecycleStartDate = lifecycleStartDate;
    }

    public Object getLifecycleEndDate() {
        return lifecycleEndDate;
    }

    public void setLifecycleEndDate(Object lifecycleEndDate) {
        this.lifecycleEndDate = lifecycleEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Object getAssetProvidedById() {
        return assetProvidedById;
    }

    public void setAssetProvidedById(Object assetProvidedById) {
        this.assetProvidedById = assetProvidedById;
    }

    public Object getAssetServicedById() {
        return assetServicedById;
    }

    public void setAssetServicedById(Object assetServicedById) {
        this.assetServicedById = assetServicedById;
    }

    public boolean isInternal() {
        return isInternal;
    }

    public void setInternal(boolean internal) {
        isInternal = internal;
    }

    public int getAssetLevel() {
        return assetLevel;
    }

    public void setAssetLevel(int assetLevel) {
        this.assetLevel = assetLevel;
    }

    public Object getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    public void setStockKeepingUnit(Object stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }

    public boolean isHasLifecycleManagement() {
        return hasLifecycleManagement;
    }

    public void setHasLifecycleManagement(boolean hasLifecycleManagement) {
        this.hasLifecycleManagement = hasLifecycleManagement;
    }

    public Object getCurrentMrr() {
        return currentMrr;
    }

    public void setCurrentMrr(Object currentMrr) {
        this.currentMrr = currentMrr;
    }

    public Object getCurrentLifecycleEndDate() {
        return currentLifecycleEndDate;
    }

    public void setCurrentLifecycleEndDate(Object currentLifecycleEndDate) {
        this.currentLifecycleEndDate = currentLifecycleEndDate;
    }

    public Object getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Object currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public Object getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Object currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Object getTotalLifecycleAmount() {
        return totalLifecycleAmount;
    }

    public void setTotalLifecycleAmount(Object totalLifecycleAmount) {
        this.totalLifecycleAmount = totalLifecycleAmount;
    }

    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }
}
