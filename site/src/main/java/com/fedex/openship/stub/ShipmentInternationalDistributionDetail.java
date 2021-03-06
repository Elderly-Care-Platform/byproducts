/**
 * ShipmentInternationalDistributionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the attributes of a shipment related to its role in an
 * international distribution (consolidation).
 */
public class ShipmentInternationalDistributionDetail  implements java.io.Serializable {
    /* Identifies the FedEx facility at which customs clearance will
     * be performed. */
    private java.lang.String clearanceFacilityLocId;

    /* Identifies the type of clearance performed at the clearance
     * facility. */
    private com.fedex.openship.stub.DistributionClearanceType clearanceType;

    /* Provides summary totals across all CRNs in a distribution. */
    private com.fedex.openship.stub.InternationalDistributionSummaryDetail summaryDetail;

    /* Specifies how charges relating to different aspects of a shipment
     * are to be paid. */
    private com.fedex.openship.stub.SplitPaymentSpecification splitPaymentSpecification;

    public ShipmentInternationalDistributionDetail() {
    }

    public ShipmentInternationalDistributionDetail(
           java.lang.String clearanceFacilityLocId,
           com.fedex.openship.stub.DistributionClearanceType clearanceType,
           com.fedex.openship.stub.InternationalDistributionSummaryDetail summaryDetail,
           com.fedex.openship.stub.SplitPaymentSpecification splitPaymentSpecification) {
           this.clearanceFacilityLocId = clearanceFacilityLocId;
           this.clearanceType = clearanceType;
           this.summaryDetail = summaryDetail;
           this.splitPaymentSpecification = splitPaymentSpecification;
    }


    /**
     * Gets the clearanceFacilityLocId value for this ShipmentInternationalDistributionDetail.
     * 
     * @return clearanceFacilityLocId   * Identifies the FedEx facility at which customs clearance will
     * be performed.
     */
    public java.lang.String getClearanceFacilityLocId() {
        return clearanceFacilityLocId;
    }


    /**
     * Sets the clearanceFacilityLocId value for this ShipmentInternationalDistributionDetail.
     * 
     * @param clearanceFacilityLocId   * Identifies the FedEx facility at which customs clearance will
     * be performed.
     */
    public void setClearanceFacilityLocId(java.lang.String clearanceFacilityLocId) {
        this.clearanceFacilityLocId = clearanceFacilityLocId;
    }


    /**
     * Gets the clearanceType value for this ShipmentInternationalDistributionDetail.
     * 
     * @return clearanceType   * Identifies the type of clearance performed at the clearance
     * facility.
     */
    public com.fedex.openship.stub.DistributionClearanceType getClearanceType() {
        return clearanceType;
    }


    /**
     * Sets the clearanceType value for this ShipmentInternationalDistributionDetail.
     * 
     * @param clearanceType   * Identifies the type of clearance performed at the clearance
     * facility.
     */
    public void setClearanceType(com.fedex.openship.stub.DistributionClearanceType clearanceType) {
        this.clearanceType = clearanceType;
    }


    /**
     * Gets the summaryDetail value for this ShipmentInternationalDistributionDetail.
     * 
     * @return summaryDetail   * Provides summary totals across all CRNs in a distribution.
     */
    public com.fedex.openship.stub.InternationalDistributionSummaryDetail getSummaryDetail() {
        return summaryDetail;
    }


    /**
     * Sets the summaryDetail value for this ShipmentInternationalDistributionDetail.
     * 
     * @param summaryDetail   * Provides summary totals across all CRNs in a distribution.
     */
    public void setSummaryDetail(com.fedex.openship.stub.InternationalDistributionSummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }


    /**
     * Gets the splitPaymentSpecification value for this ShipmentInternationalDistributionDetail.
     * 
     * @return splitPaymentSpecification   * Specifies how charges relating to different aspects of a shipment
     * are to be paid.
     */
    public com.fedex.openship.stub.SplitPaymentSpecification getSplitPaymentSpecification() {
        return splitPaymentSpecification;
    }


    /**
     * Sets the splitPaymentSpecification value for this ShipmentInternationalDistributionDetail.
     * 
     * @param splitPaymentSpecification   * Specifies how charges relating to different aspects of a shipment
     * are to be paid.
     */
    public void setSplitPaymentSpecification(com.fedex.openship.stub.SplitPaymentSpecification splitPaymentSpecification) {
        this.splitPaymentSpecification = splitPaymentSpecification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentInternationalDistributionDetail)) return false;
        ShipmentInternationalDistributionDetail other = (ShipmentInternationalDistributionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clearanceFacilityLocId==null && other.getClearanceFacilityLocId()==null) || 
             (this.clearanceFacilityLocId!=null &&
              this.clearanceFacilityLocId.equals(other.getClearanceFacilityLocId()))) &&
            ((this.clearanceType==null && other.getClearanceType()==null) || 
             (this.clearanceType!=null &&
              this.clearanceType.equals(other.getClearanceType()))) &&
            ((this.summaryDetail==null && other.getSummaryDetail()==null) || 
             (this.summaryDetail!=null &&
              this.summaryDetail.equals(other.getSummaryDetail()))) &&
            ((this.splitPaymentSpecification==null && other.getSplitPaymentSpecification()==null) || 
             (this.splitPaymentSpecification!=null &&
              this.splitPaymentSpecification.equals(other.getSplitPaymentSpecification())));
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
        if (getClearanceFacilityLocId() != null) {
            _hashCode += getClearanceFacilityLocId().hashCode();
        }
        if (getClearanceType() != null) {
            _hashCode += getClearanceType().hashCode();
        }
        if (getSummaryDetail() != null) {
            _hashCode += getSummaryDetail().hashCode();
        }
        if (getSplitPaymentSpecification() != null) {
            _hashCode += getSplitPaymentSpecification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentInternationalDistributionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentInternationalDistributionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceFacilityLocId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClearanceFacilityLocId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClearanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DistributionClearanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SummaryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDistributionSummaryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitPaymentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SplitPaymentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SplitPaymentSpecification"));
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
