/**
 * AddPackagesToOpenShipmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * This request adds one or more packages to an existing open shipment.
 */
public class AddPackagesToOpenShipmentRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.openship.stub.ClientDetail clientDetail;

    private com.fedex.openship.stub.TransactionDetail transactionDetail;

    private com.fedex.openship.stub.VersionId version;

    /* Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided). */
    private java.lang.String index;

    /* Specifies the optional actions to be performed during the addition
     * of packages to this open shipment. */
    private com.fedex.openship.stub.AddPackagesToOpenShipmentActionType[] actions;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package in the shipment. */
    private com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems;

    public AddPackagesToOpenShipmentRequest() {
    }

    public AddPackagesToOpenShipmentRequest(
           com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.openship.stub.ClientDetail clientDetail,
           com.fedex.openship.stub.TransactionDetail transactionDetail,
           com.fedex.openship.stub.VersionId version,
           java.lang.String index,
           com.fedex.openship.stub.AddPackagesToOpenShipmentActionType[] actions,
           com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.index = index;
           this.actions = actions;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the webAuthenticationDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.openship.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.openship.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.openship.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.openship.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.openship.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return version
     */
    public com.fedex.openship.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.openship.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the index value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public java.lang.String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public void setIndex(java.lang.String index) {
        this.index = index;
    }


    /**
     * Gets the actions value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return actions   * Specifies the optional actions to be performed during the addition
     * of packages to this open shipment.
     */
    public com.fedex.openship.stub.AddPackagesToOpenShipmentActionType[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param actions   * Specifies the optional actions to be performed during the addition
     * of packages to this open shipment.
     */
    public void setActions(com.fedex.openship.stub.AddPackagesToOpenShipmentActionType[] actions) {
        this.actions = actions;
    }

    public com.fedex.openship.stub.AddPackagesToOpenShipmentActionType getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.fedex.openship.stub.AddPackagesToOpenShipmentActionType _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the requestedPackageLineItems value for this AddPackagesToOpenShipmentRequest.
     * 
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package in the shipment.
     */
    public com.fedex.openship.stub.RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this AddPackagesToOpenShipmentRequest.
     * 
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package in the shipment.
     */
    public void setRequestedPackageLineItems(com.fedex.openship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public com.fedex.openship.stub.RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, com.fedex.openship.stub.RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddPackagesToOpenShipmentRequest)) return false;
        AddPackagesToOpenShipmentRequest other = (AddPackagesToOpenShipmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) || 
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddPackagesToOpenShipmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedPackageLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
