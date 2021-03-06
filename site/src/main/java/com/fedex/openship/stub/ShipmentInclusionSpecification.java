/**
 * ShipmentInclusionSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ShipmentInclusionSpecification  implements java.io.Serializable {
    /* Specifies which carrier should be included. */
    private com.fedex.openship.stub.CarrierCodeType carrierCode;

    private com.fedex.openship.stub.ServiceCategoryType serviceCategory;

    public ShipmentInclusionSpecification() {
    }

    public ShipmentInclusionSpecification(
           com.fedex.openship.stub.CarrierCodeType carrierCode,
           com.fedex.openship.stub.ServiceCategoryType serviceCategory) {
           this.carrierCode = carrierCode;
           this.serviceCategory = serviceCategory;
    }


    /**
     * Gets the carrierCode value for this ShipmentInclusionSpecification.
     * 
     * @return carrierCode   * Specifies which carrier should be included.
     */
    public com.fedex.openship.stub.CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this ShipmentInclusionSpecification.
     * 
     * @param carrierCode   * Specifies which carrier should be included.
     */
    public void setCarrierCode(com.fedex.openship.stub.CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the serviceCategory value for this ShipmentInclusionSpecification.
     * 
     * @return serviceCategory
     */
    public com.fedex.openship.stub.ServiceCategoryType getServiceCategory() {
        return serviceCategory;
    }


    /**
     * Sets the serviceCategory value for this ShipmentInclusionSpecification.
     * 
     * @param serviceCategory
     */
    public void setServiceCategory(com.fedex.openship.stub.ServiceCategoryType serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentInclusionSpecification)) return false;
        ShipmentInclusionSpecification other = (ShipmentInclusionSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.serviceCategory==null && other.getServiceCategory()==null) || 
             (this.serviceCategory!=null &&
              this.serviceCategory.equals(other.getServiceCategory())));
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
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getServiceCategory() != null) {
            _hashCode += getServiceCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentInclusionSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentInclusionSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ServiceCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ServiceCategoryType"));
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
