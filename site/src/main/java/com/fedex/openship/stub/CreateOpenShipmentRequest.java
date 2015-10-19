/**
 * CreateOpenShipmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CreateOpenShipmentRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.openship.stub.ClientDetail clientDetail;

    private com.fedex.openship.stub.TransactionDetail transactionDetail;

    private com.fedex.openship.stub.VersionId version;

    /* This is used to specify processing options related to synchronous
     * or asynchronous processing. */
    private com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions;

    /* Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided). */
    private java.lang.String index;

    /* If provided, identifies the consolidation to which this open
     * shipment should be added after successful creation. */
    private com.fedex.openship.stub.ConsolidationKey consolidationKey;

    /* Specifies the optional actions to be performed during the creation
     * of this open shipment. */
    private com.fedex.openship.stub.CreateOpenShipmentActionType[] actions;

    private com.fedex.openship.stub.RequestedShipment requestedShipment;

    public CreateOpenShipmentRequest() {
    }

    public CreateOpenShipmentRequest(
           com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.openship.stub.ClientDetail clientDetail,
           com.fedex.openship.stub.TransactionDetail transactionDetail,
           com.fedex.openship.stub.VersionId version,
           com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions,
           java.lang.String index,
           com.fedex.openship.stub.ConsolidationKey consolidationKey,
           com.fedex.openship.stub.CreateOpenShipmentActionType[] actions,
           com.fedex.openship.stub.RequestedShipment requestedShipment) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.asynchronousProcessingOptions = asynchronousProcessingOptions;
           this.index = index;
           this.consolidationKey = consolidationKey;
           this.actions = actions;
           this.requestedShipment = requestedShipment;
    }


    /**
     * Gets the webAuthenticationDetail value for this CreateOpenShipmentRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.openship.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this CreateOpenShipmentRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this CreateOpenShipmentRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.openship.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this CreateOpenShipmentRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.openship.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this CreateOpenShipmentRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.openship.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this CreateOpenShipmentRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.openship.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this CreateOpenShipmentRequest.
     * 
     * @return version
     */
    public com.fedex.openship.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CreateOpenShipmentRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.openship.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the asynchronousProcessingOptions value for this CreateOpenShipmentRequest.
     * 
     * @return asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public com.fedex.openship.stub.AsynchronousProcessingOptionsRequested getAsynchronousProcessingOptions() {
        return asynchronousProcessingOptions;
    }


    /**
     * Sets the asynchronousProcessingOptions value for this CreateOpenShipmentRequest.
     * 
     * @param asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public void setAsynchronousProcessingOptions(com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions) {
        this.asynchronousProcessingOptions = asynchronousProcessingOptions;
    }


    /**
     * Gets the index value for this CreateOpenShipmentRequest.
     * 
     * @return index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public java.lang.String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this CreateOpenShipmentRequest.
     * 
     * @param index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public void setIndex(java.lang.String index) {
        this.index = index;
    }


    /**
     * Gets the consolidationKey value for this CreateOpenShipmentRequest.
     * 
     * @return consolidationKey   * If provided, identifies the consolidation to which this open
     * shipment should be added after successful creation.
     */
    public com.fedex.openship.stub.ConsolidationKey getConsolidationKey() {
        return consolidationKey;
    }


    /**
     * Sets the consolidationKey value for this CreateOpenShipmentRequest.
     * 
     * @param consolidationKey   * If provided, identifies the consolidation to which this open
     * shipment should be added after successful creation.
     */
    public void setConsolidationKey(com.fedex.openship.stub.ConsolidationKey consolidationKey) {
        this.consolidationKey = consolidationKey;
    }


    /**
     * Gets the actions value for this CreateOpenShipmentRequest.
     * 
     * @return actions   * Specifies the optional actions to be performed during the creation
     * of this open shipment.
     */
    public com.fedex.openship.stub.CreateOpenShipmentActionType[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this CreateOpenShipmentRequest.
     * 
     * @param actions   * Specifies the optional actions to be performed during the creation
     * of this open shipment.
     */
    public void setActions(com.fedex.openship.stub.CreateOpenShipmentActionType[] actions) {
        this.actions = actions;
    }

    public com.fedex.openship.stub.CreateOpenShipmentActionType getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.fedex.openship.stub.CreateOpenShipmentActionType _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the requestedShipment value for this CreateOpenShipmentRequest.
     * 
     * @return requestedShipment
     */
    public com.fedex.openship.stub.RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }


    /**
     * Sets the requestedShipment value for this CreateOpenShipmentRequest.
     * 
     * @param requestedShipment
     */
    public void setRequestedShipment(com.fedex.openship.stub.RequestedShipment requestedShipment) {
        this.requestedShipment = requestedShipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateOpenShipmentRequest)) return false;
        CreateOpenShipmentRequest other = (CreateOpenShipmentRequest) obj;
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
            ((this.asynchronousProcessingOptions==null && other.getAsynchronousProcessingOptions()==null) || 
             (this.asynchronousProcessingOptions!=null &&
              this.asynchronousProcessingOptions.equals(other.getAsynchronousProcessingOptions()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.consolidationKey==null && other.getConsolidationKey()==null) || 
             (this.consolidationKey!=null &&
              this.consolidationKey.equals(other.getConsolidationKey()))) &&
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.requestedShipment==null && other.getRequestedShipment()==null) || 
             (this.requestedShipment!=null &&
              this.requestedShipment.equals(other.getRequestedShipment())));
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
        if (getAsynchronousProcessingOptions() != null) {
            _hashCode += getAsynchronousProcessingOptions().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getConsolidationKey() != null) {
            _hashCode += getConsolidationKey().hashCode();
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
        if (getRequestedShipment() != null) {
            _hashCode += getRequestedShipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateOpenShipmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentRequest"));
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
        elemField.setFieldName("asynchronousProcessingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingOptionsRequested"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("consolidationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedShipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
