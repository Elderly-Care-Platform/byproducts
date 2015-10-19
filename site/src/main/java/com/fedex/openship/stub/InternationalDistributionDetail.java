/**
 * InternationalDistributionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class InternationalDistributionDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.DropoffType dropoffType;

    private com.fedex.openship.stub.Dimensions totalDimensions;

    private com.fedex.openship.stub.Money totalInsuredValue;

    private com.fedex.openship.stub.UnitSystemType unitSystem;

    private com.fedex.openship.stub.DeclarationCurrency[] declarationCurrencies;

    private java.lang.String clearanceFacilityLocationId;

    public InternationalDistributionDetail() {
    }

    public InternationalDistributionDetail(
           com.fedex.openship.stub.DropoffType dropoffType,
           com.fedex.openship.stub.Dimensions totalDimensions,
           com.fedex.openship.stub.Money totalInsuredValue,
           com.fedex.openship.stub.UnitSystemType unitSystem,
           com.fedex.openship.stub.DeclarationCurrency[] declarationCurrencies,
           java.lang.String clearanceFacilityLocationId) {
           this.dropoffType = dropoffType;
           this.totalDimensions = totalDimensions;
           this.totalInsuredValue = totalInsuredValue;
           this.unitSystem = unitSystem;
           this.declarationCurrencies = declarationCurrencies;
           this.clearanceFacilityLocationId = clearanceFacilityLocationId;
    }


    /**
     * Gets the dropoffType value for this InternationalDistributionDetail.
     * 
     * @return dropoffType
     */
    public com.fedex.openship.stub.DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this InternationalDistributionDetail.
     * 
     * @param dropoffType
     */
    public void setDropoffType(com.fedex.openship.stub.DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the totalDimensions value for this InternationalDistributionDetail.
     * 
     * @return totalDimensions
     */
    public com.fedex.openship.stub.Dimensions getTotalDimensions() {
        return totalDimensions;
    }


    /**
     * Sets the totalDimensions value for this InternationalDistributionDetail.
     * 
     * @param totalDimensions
     */
    public void setTotalDimensions(com.fedex.openship.stub.Dimensions totalDimensions) {
        this.totalDimensions = totalDimensions;
    }


    /**
     * Gets the totalInsuredValue value for this InternationalDistributionDetail.
     * 
     * @return totalInsuredValue
     */
    public com.fedex.openship.stub.Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this InternationalDistributionDetail.
     * 
     * @param totalInsuredValue
     */
    public void setTotalInsuredValue(com.fedex.openship.stub.Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the unitSystem value for this InternationalDistributionDetail.
     * 
     * @return unitSystem
     */
    public com.fedex.openship.stub.UnitSystemType getUnitSystem() {
        return unitSystem;
    }


    /**
     * Sets the unitSystem value for this InternationalDistributionDetail.
     * 
     * @param unitSystem
     */
    public void setUnitSystem(com.fedex.openship.stub.UnitSystemType unitSystem) {
        this.unitSystem = unitSystem;
    }


    /**
     * Gets the declarationCurrencies value for this InternationalDistributionDetail.
     * 
     * @return declarationCurrencies
     */
    public com.fedex.openship.stub.DeclarationCurrency[] getDeclarationCurrencies() {
        return declarationCurrencies;
    }


    /**
     * Sets the declarationCurrencies value for this InternationalDistributionDetail.
     * 
     * @param declarationCurrencies
     */
    public void setDeclarationCurrencies(com.fedex.openship.stub.DeclarationCurrency[] declarationCurrencies) {
        this.declarationCurrencies = declarationCurrencies;
    }

    public com.fedex.openship.stub.DeclarationCurrency getDeclarationCurrencies(int i) {
        return this.declarationCurrencies[i];
    }

    public void setDeclarationCurrencies(int i, com.fedex.openship.stub.DeclarationCurrency _value) {
        this.declarationCurrencies[i] = _value;
    }


    /**
     * Gets the clearanceFacilityLocationId value for this InternationalDistributionDetail.
     * 
     * @return clearanceFacilityLocationId
     */
    public java.lang.String getClearanceFacilityLocationId() {
        return clearanceFacilityLocationId;
    }


    /**
     * Sets the clearanceFacilityLocationId value for this InternationalDistributionDetail.
     * 
     * @param clearanceFacilityLocationId
     */
    public void setClearanceFacilityLocationId(java.lang.String clearanceFacilityLocationId) {
        this.clearanceFacilityLocationId = clearanceFacilityLocationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalDistributionDetail)) return false;
        InternationalDistributionDetail other = (InternationalDistributionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dropoffType==null && other.getDropoffType()==null) || 
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.totalDimensions==null && other.getTotalDimensions()==null) || 
             (this.totalDimensions!=null &&
              this.totalDimensions.equals(other.getTotalDimensions()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.unitSystem==null && other.getUnitSystem()==null) || 
             (this.unitSystem!=null &&
              this.unitSystem.equals(other.getUnitSystem()))) &&
            ((this.declarationCurrencies==null && other.getDeclarationCurrencies()==null) || 
             (this.declarationCurrencies!=null &&
              java.util.Arrays.equals(this.declarationCurrencies, other.getDeclarationCurrencies()))) &&
            ((this.clearanceFacilityLocationId==null && other.getClearanceFacilityLocationId()==null) || 
             (this.clearanceFacilityLocationId!=null &&
              this.clearanceFacilityLocationId.equals(other.getClearanceFacilityLocationId())));
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
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getTotalDimensions() != null) {
            _hashCode += getTotalDimensions().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getUnitSystem() != null) {
            _hashCode += getUnitSystem().hashCode();
        }
        if (getDeclarationCurrencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeclarationCurrencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeclarationCurrencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClearanceFacilityLocationId() != null) {
            _hashCode += getClearanceFacilityLocationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalDistributionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDistributionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DropoffType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UnitSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UnitSystemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declarationCurrencies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeclarationCurrencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeclarationCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceFacilityLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClearanceFacilityLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
