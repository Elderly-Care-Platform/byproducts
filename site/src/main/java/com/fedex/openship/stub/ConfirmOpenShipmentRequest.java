/**
 * ConfirmOpenShipmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConfirmOpenShipmentRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.openship.stub.ClientDetail clientDetail;

    private com.fedex.openship.stub.TransactionDetail transactionDetail;

    private com.fedex.openship.stub.VersionId version;

    /* This is used to specify processing options related to synchronous
     * or asynchronous processing. */
    private com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions;

    /* Customer-assigned identifier for the shipment containing the
     * desired package. */
    private java.lang.String index;

    private com.fedex.openship.stub.LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private com.fedex.openship.stub.RateRequestType[] rateRequestTypes;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private com.fedex.openship.stub.EdtRequestType edtRequestType;

    public ConfirmOpenShipmentRequest() {
    }

    public ConfirmOpenShipmentRequest(
           com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.openship.stub.ClientDetail clientDetail,
           com.fedex.openship.stub.TransactionDetail transactionDetail,
           com.fedex.openship.stub.VersionId version,
           com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions,
           java.lang.String index,
           com.fedex.openship.stub.LabelSpecification labelSpecification,
           com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification,
           com.fedex.openship.stub.RateRequestType[] rateRequestTypes,
           com.fedex.openship.stub.EdtRequestType edtRequestType) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.asynchronousProcessingOptions = asynchronousProcessingOptions;
           this.index = index;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the webAuthenticationDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.openship.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.openship.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.openship.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.openship.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.openship.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ConfirmOpenShipmentRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.openship.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ConfirmOpenShipmentRequest.
     * 
     * @return version
     */
    public com.fedex.openship.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ConfirmOpenShipmentRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.openship.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the asynchronousProcessingOptions value for this ConfirmOpenShipmentRequest.
     * 
     * @return asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public com.fedex.openship.stub.AsynchronousProcessingOptionsRequested getAsynchronousProcessingOptions() {
        return asynchronousProcessingOptions;
    }


    /**
     * Sets the asynchronousProcessingOptions value for this ConfirmOpenShipmentRequest.
     * 
     * @param asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public void setAsynchronousProcessingOptions(com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions) {
        this.asynchronousProcessingOptions = asynchronousProcessingOptions;
    }


    /**
     * Gets the index value for this ConfirmOpenShipmentRequest.
     * 
     * @return index   * Customer-assigned identifier for the shipment containing the
     * desired package.
     */
    public java.lang.String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ConfirmOpenShipmentRequest.
     * 
     * @param index   * Customer-assigned identifier for the shipment containing the
     * desired package.
     */
    public void setIndex(java.lang.String index) {
        this.index = index;
    }


    /**
     * Gets the labelSpecification value for this ConfirmOpenShipmentRequest.
     * 
     * @return labelSpecification
     */
    public com.fedex.openship.stub.LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this ConfirmOpenShipmentRequest.
     * 
     * @param labelSpecification
     */
    public void setLabelSpecification(com.fedex.openship.stub.LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this ConfirmOpenShipmentRequest.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.fedex.openship.stub.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this ConfirmOpenShipmentRequest.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this ConfirmOpenShipmentRequest.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public com.fedex.openship.stub.RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this ConfirmOpenShipmentRequest.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(com.fedex.openship.stub.RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public com.fedex.openship.stub.RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, com.fedex.openship.stub.RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the edtRequestType value for this ConfirmOpenShipmentRequest.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public com.fedex.openship.stub.EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this ConfirmOpenShipmentRequest.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(com.fedex.openship.stub.EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmOpenShipmentRequest)) return false;
        ConfirmOpenShipmentRequest other = (ConfirmOpenShipmentRequest) obj;
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
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType())));
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
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmOpenShipmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentRequest"));
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
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtRequestType"));
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
