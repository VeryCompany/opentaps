package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductStoreVendorShipment.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_STORE_VENDOR_SHIPMENT")
public class ProductStoreVendorShipment extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreId", "PRODUCT_STORE_ID");
        fields.put("vendorPartyId", "VENDOR_PARTY_ID");
        fields.put("shipmentMethodTypeId", "SHIPMENT_METHOD_TYPE_ID");
        fields.put("carrierPartyId", "CARRIER_PARTY_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductStoreVendorShipment", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductStoreVendorShipment> {
    productStoreId("productStoreId"),
    vendorPartyId("vendorPartyId"),
    shipmentMethodTypeId("shipmentMethodTypeId"),
    carrierPartyId("carrierPartyId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductStoreVendorShipmentPkBridge.class)
     private ProductStoreVendorShipmentPk id = new ProductStoreVendorShipmentPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductStoreVendorShipmentPk</code>
     */
      public ProductStoreVendorShipmentPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductStoreVendorShipmentPk</code> value to set
    */   
      public void setId(ProductStoreVendorShipmentPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStore productStore = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VENDOR_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party vendorParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SHIPMENT_METHOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ShipmentMethodType shipmentMethodType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CARRIER_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party carrierParty = null;

  /**
   * Default constructor.
   */
  public ProductStoreVendorShipment() {
      super();
      this.baseEntityName = "ProductStoreVendorShipment";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productStoreId");this.primaryKeyNames.add("vendorPartyId");this.primaryKeyNames.add("shipmentMethodTypeId");this.primaryKeyNames.add("carrierPartyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("vendorPartyId");this.allFieldsNames.add("shipmentMethodTypeId");this.allFieldsNames.add("carrierPartyId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductStoreVendorShipment(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        id.setProductStoreId(productStoreId);
    }
    /**
     * Auto generated value setter.
     * @param vendorPartyId the vendorPartyId to set
     */
    public void setVendorPartyId(String vendorPartyId) {
        id.setVendorPartyId(vendorPartyId);
    }
    /**
     * Auto generated value setter.
     * @param shipmentMethodTypeId the shipmentMethodTypeId to set
     */
    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        id.setShipmentMethodTypeId(shipmentMethodTypeId);
    }
    /**
     * Auto generated value setter.
     * @param carrierPartyId the carrierPartyId to set
     */
    public void setCarrierPartyId(String carrierPartyId) {
        id.setCarrierPartyId(carrierPartyId);
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.id.getProductStoreId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVendorPartyId() {
        return this.id.getVendorPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentMethodTypeId() {
        return this.id.getShipmentMethodTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCarrierPartyId() {
        return this.id.getCarrierPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>ProductStore</code>.
     * @return the <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStore getProductStore() throws RepositoryException {
        if (this.productStore == null) {
            this.productStore = getRelatedOne(ProductStore.class, "ProductStore");
        }
        return this.productStore;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>VendorParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getVendorParty() throws RepositoryException {
        if (this.vendorParty == null) {
            this.vendorParty = getRelatedOne(Party.class, "VendorParty");
        }
        return this.vendorParty;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentMethodType</code> by the relation named <code>ShipmentMethodType</code>.
     * @return the <code>ShipmentMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentMethodType getShipmentMethodType() throws RepositoryException {
        if (this.shipmentMethodType == null) {
            this.shipmentMethodType = getRelatedOne(ShipmentMethodType.class, "ShipmentMethodType");
        }
        return this.shipmentMethodType;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>CarrierParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getCarrierParty() throws RepositoryException {
        if (this.carrierParty == null) {
            this.carrierParty = getRelatedOne(Party.class, "CarrierParty");
        }
        return this.carrierParty;
    }

    /**
     * Auto generated value setter.
     * @param productStore the productStore to set
    */
    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }
    /**
     * Auto generated value setter.
     * @param vendorParty the vendorParty to set
    */
    public void setVendorParty(Party vendorParty) {
        this.vendorParty = vendorParty;
    }
    /**
     * Auto generated value setter.
     * @param shipmentMethodType the shipmentMethodType to set
    */
    public void setShipmentMethodType(ShipmentMethodType shipmentMethodType) {
        this.shipmentMethodType = shipmentMethodType;
    }
    /**
     * Auto generated value setter.
     * @param carrierParty the carrierParty to set
    */
    public void setCarrierParty(Party carrierParty) {
        this.carrierParty = carrierParty;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreId((String) mapValue.get("productStoreId"));
        setVendorPartyId((String) mapValue.get("vendorPartyId"));
        setShipmentMethodTypeId((String) mapValue.get("shipmentMethodTypeId"));
        setCarrierPartyId((String) mapValue.get("carrierPartyId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("vendorPartyId", getVendorPartyId());
        mapValue.put("shipmentMethodTypeId", getShipmentMethodTypeId());
        mapValue.put("carrierPartyId", getCarrierPartyId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}