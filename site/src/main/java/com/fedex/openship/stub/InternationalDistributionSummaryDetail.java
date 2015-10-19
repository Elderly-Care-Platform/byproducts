/**
 * InternationalDistributionSummaryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Totals accumulated during the processing of CRNs into the consolidation.
 */
public class InternationalDistributionSummaryDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.Weight totalWeight;

    private org.apache.axis.types.NonNegativeInteger totalPackageCount;

    private org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount;

    private com.fedex.openship.stub.Money totalCustomsValue;

    private com.fedex.openship.stub.Money totalInsuredValue;

    private com.fedex.openship.stub.Money totalFreightCharges;

    private com.fedex.openship.stub.Money totalInsuranceCharges;

    private com.fedex.openship.stub.Money totalTaxesOrMiscellaneousCharges;

    private com.fedex.openship.stub.Money totalHandlingCosts;

    private com.fedex.openship.stub.Money totalPackingCosts;

    private com.fedex.openship.stub.ShipmentDryIceDetail dryIceDetail;

    private com.fedex.openship.stub.DangerousGoodsAccessibilityType dangerousGoodsAccessibility;

    public InternationalDistributionSummaryDetail() {
    }

    public InternationalDistributionSummaryDetail(
           com.fedex.openship.stub.Weight totalWeight,
           org.apache.axis.types.NonNegativeInteger totalPackageCount,
           org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount,
           com.fedex.openship.stub.Money totalCustomsValue,
           com.fedex.openship.stub.Money totalInsuredValue,
           com.fedex.openship.stub.Money totalFreightCharges,
           com.fedex.openship.stub.Money totalInsuranceCharges,
           com.fedex.openship.stub.Money totalTaxesOrMiscellaneousCharges,
           com.fedex.openship.stub.Money totalHandlingCosts,
           com.fedex.openship.stub.Money totalPackingCosts,
           com.fedex.openship.stub.ShipmentDryIceDetail dryIceDetail,
           com.fedex.openship.stub.DangerousGoodsAccessibilityType dangerousGoodsAccessibility) {
           this.totalWeight = totalWeight;
           this.totalPackageCount = totalPackageCount;
           this.totalUniqueAddressCount = totalUniqueAddressCount;
           this.totalCustomsValue = totalCustomsValue;
           this.totalInsuredValue = totalInsuredValue;
           this.totalFreightCharges = totalFreightCharges;
           this.totalInsuranceCharges = totalInsuranceCharges;
           this.totalTaxesOrMiscellaneousCharges = totalTaxesOrMiscellaneousCharges;
           this.totalHandlingCosts = totalHandlingCosts;
           this.totalPackingCosts = totalPackingCosts;
           this.dryIceDetail = dryIceDetail;
           this.dangerousGoodsAccessibility = dangerousGoodsAccessibility;
    }


    /**
     * Gets the totalWeight value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalWeight
     */
    public com.fedex.openship.stub.Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalWeight
     */
    public void setTotalWeight(com.fedex.openship.stub.Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalPackageCount value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalPackageCount
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPackageCount() {
        return totalPackageCount;
    }


    /**
     * Sets the totalPackageCount value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalPackageCount
     */
    public void setTotalPackageCount(org.apache.axis.types.NonNegativeInteger totalPackageCount) {
        this.totalPackageCount = totalPackageCount;
    }


    /**
     * Gets the totalUniqueAddressCount value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalUniqueAddressCount
     */
    public org.apache.axis.types.NonNegativeInteger getTotalUniqueAddressCount() {
        return totalUniqueAddressCount;
    }


    /**
     * Sets the totalUniqueAddressCount value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalUniqueAddressCount
     */
    public void setTotalUniqueAddressCount(org.apache.axis.types.NonNegativeInteger totalUniqueAddressCount) {
        this.totalUniqueAddressCount = totalUniqueAddressCount;
    }


    /**
     * Gets the totalCustomsValue value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalCustomsValue
     */
    public com.fedex.openship.stub.Money getTotalCustomsValue() {
        return totalCustomsValue;
    }


    /**
     * Sets the totalCustomsValue value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalCustomsValue
     */
    public void setTotalCustomsValue(com.fedex.openship.stub.Money totalCustomsValue) {
        this.totalCustomsValue = totalCustomsValue;
    }


    /**
     * Gets the totalInsuredValue value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalInsuredValue
     */
    public com.fedex.openship.stub.Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalInsuredValue
     */
    public void setTotalInsuredValue(com.fedex.openship.stub.Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the totalFreightCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalFreightCharges
     */
    public com.fedex.openship.stub.Money getTotalFreightCharges() {
        return totalFreightCharges;
    }


    /**
     * Sets the totalFreightCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalFreightCharges
     */
    public void setTotalFreightCharges(com.fedex.openship.stub.Money totalFreightCharges) {
        this.totalFreightCharges = totalFreightCharges;
    }


    /**
     * Gets the totalInsuranceCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalInsuranceCharges
     */
    public com.fedex.openship.stub.Money getTotalInsuranceCharges() {
        return totalInsuranceCharges;
    }


    /**
     * Sets the totalInsuranceCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalInsuranceCharges
     */
    public void setTotalInsuranceCharges(com.fedex.openship.stub.Money totalInsuranceCharges) {
        this.totalInsuranceCharges = totalInsuranceCharges;
    }


    /**
     * Gets the totalTaxesOrMiscellaneousCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalTaxesOrMiscellaneousCharges
     */
    public com.fedex.openship.stub.Money getTotalTaxesOrMiscellaneousCharges() {
        return totalTaxesOrMiscellaneousCharges;
    }


    /**
     * Sets the totalTaxesOrMiscellaneousCharges value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalTaxesOrMiscellaneousCharges
     */
    public void setTotalTaxesOrMiscellaneousCharges(com.fedex.openship.stub.Money totalTaxesOrMiscellaneousCharges) {
        this.totalTaxesOrMiscellaneousCharges = totalTaxesOrMiscellaneousCharges;
    }


    /**
     * Gets the totalHandlingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalHandlingCosts
     */
    public com.fedex.openship.stub.Money getTotalHandlingCosts() {
        return totalHandlingCosts;
    }


    /**
     * Sets the totalHandlingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalHandlingCosts
     */
    public void setTotalHandlingCosts(com.fedex.openship.stub.Money totalHandlingCosts) {
        this.totalHandlingCosts = totalHandlingCosts;
    }


    /**
     * Gets the totalPackingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @return totalPackingCosts
     */
    public com.fedex.openship.stub.Money getTotalPackingCosts() {
        return totalPackingCosts;
    }


    /**
     * Sets the totalPackingCosts value for this InternationalDistributionSummaryDetail.
     * 
     * @param totalPackingCosts
     */
    public void setTotalPackingCosts(com.fedex.openship.stub.Money totalPackingCosts) {
        this.totalPackingCosts = totalPackingCosts;
    }


    /**
     * Gets the dryIceDetail value for this InternationalDistributionSummaryDetail.
     * 
     * @return dryIceDetail
     */
    public com.fedex.openship.stub.ShipmentDryIceDetail getDryIceDetail() {
        return dryIceDetail;
    }


    /**
     * Sets the dryIceDetail value for this InternationalDistributionSummaryDetail.
     * 
     * @param dryIceDetail
     */
    public void setDryIceDetail(com.fedex.openship.stub.ShipmentDryIceDetail dryIceDetail) {
        this.dryIceDetail = dryIceDetail;
    }


    /**
     * Gets the dangerousGoodsAccessibility value for this InternationalDistributionSummaryDetail.
     * 
     * @return dangerousGoodsAccessibility
     */
    public com.fedex.openship.stub.DangerousGoodsAccessibilityType getDangerousGoodsAccessibility() {
        return dangerousGoodsAccessibility;
    }


    /**
     * Sets the dangerousGoodsAccessibility value for this InternationalDistributionSummaryDetail.
     * 
     * @param dangerousGoodsAccessibility
     */
    public void setDangerousGoodsAccessibility(com.fedex.openship.stub.DangerousGoodsAccessibilityType dangerousGoodsAccessibility) {
        this.dangerousGoodsAccessibility = dangerousGoodsAccessibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalDistributionSummaryDetail)) return false;
        InternationalDistributionSummaryDetail other = (InternationalDistributionSummaryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalPackageCount==null && other.getTotalPackageCount()==null) || 
             (this.totalPackageCount!=null &&
              this.totalPackageCount.equals(other.getTotalPackageCount()))) &&
            ((this.totalUniqueAddressCount==null && other.getTotalUniqueAddressCount()==null) || 
             (this.totalUniqueAddressCount!=null &&
              this.totalUniqueAddressCount.equals(other.getTotalUniqueAddressCount()))) &&
            ((this.totalCustomsValue==null && other.getTotalCustomsValue()==null) || 
             (this.totalCustomsValue!=null &&
              this.totalCustomsValue.equals(other.getTotalCustomsValue()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.totalFreightCharges==null && other.getTotalFreightCharges()==null) || 
             (this.totalFreightCharges!=null &&
              this.totalFreightCharges.equals(other.getTotalFreightCharges()))) &&
            ((this.totalInsuranceCharges==null && other.getTotalInsuranceCharges()==null) || 
             (this.totalInsuranceCharges!=null &&
              this.totalInsuranceCharges.equals(other.getTotalInsuranceCharges()))) &&
            ((this.totalTaxesOrMiscellaneousCharges==null && other.getTotalTaxesOrMiscellaneousCharges()==null) || 
             (this.totalTaxesOrMiscellaneousCharges!=null &&
              this.totalTaxesOrMiscellaneousCharges.equals(other.getTotalTaxesOrMiscellaneousCharges()))) &&
            ((this.totalHandlingCosts==null && other.getTotalHandlingCosts()==null) || 
             (this.totalHandlingCosts!=null &&
              this.totalHandlingCosts.equals(other.getTotalHandlingCosts()))) &&
            ((this.totalPackingCosts==null && other.getTotalPackingCosts()==null) || 
             (this.totalPackingCosts!=null &&
              this.totalPackingCosts.equals(other.getTotalPackingCosts()))) &&
            ((this.dryIceDetail==null && other.getDryIceDetail()==null) || 
             (this.dryIceDetail!=null &&
              this.dryIceDetail.equals(other.getDryIceDetail()))) &&
            ((this.dangerousGoodsAccessibility==null && other.getDangerousGoodsAccessibility()==null) || 
             (this.dangerousGoodsAccessibility!=null &&
              this.dangerousGoodsAccessibility.equals(other.getDangerousGoodsAccessibility())));
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
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalPackageCount() != null) {
            _hashCode += getTotalPackageCount().hashCode();
        }
        if (getTotalUniqueAddressCount() != null) {
            _hashCode += getTotalUniqueAddressCount().hashCode();
        }
        if (getTotalCustomsValue() != null) {
            _hashCode += getTotalCustomsValue().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getTotalFreightCharges() != null) {
            _hashCode += getTotalFreightCharges().hashCode();
        }
        if (getTotalInsuranceCharges() != null) {
            _hashCode += getTotalInsuranceCharges().hashCode();
        }
        if (getTotalTaxesOrMiscellaneousCharges() != null) {
            _hashCode += getTotalTaxesOrMiscellaneousCharges().hashCode();
        }
        if (getTotalHandlingCosts() != null) {
            _hashCode += getTotalHandlingCosts().hashCode();
        }
        if (getTotalPackingCosts() != null) {
            _hashCode += getTotalPackingCosts().hashCode();
        }
        if (getDryIceDetail() != null) {
            _hashCode += getDryIceDetail().hashCode();
        }
        if (getDangerousGoodsAccessibility() != null) {
            _hashCode += getDangerousGoodsAccessibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalDistributionSummaryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDistributionSummaryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUniqueAddressCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalUniqueAddressCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCustomsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalCustomsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
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
        elemField.setFieldName("totalFreightCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalFreightCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuranceCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalInsuranceCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxesOrMiscellaneousCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalTaxesOrMiscellaneousCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHandlingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalHandlingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPackingCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TotalPackingCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DryIceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentDryIceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsAccessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsAccessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsAccessibilityType"));
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
