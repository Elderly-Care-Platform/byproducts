/**
 * ConsolidatedCommodityDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Represents all commodity data (summary and line items) within a
 * consolidation.
 */
public class ConsolidatedCommodityDetail  implements java.io.Serializable {
    /* Description of the commodity group which is summarised in the
     * following subtotals. */
    private java.lang.String groupDescription;

    private java.math.BigDecimal subtotalQuantity;

    private com.fedex.openship.stub.Money subtotalCustomsValue;

    private com.fedex.openship.stub.ConsolidatedCommodity[] commodities;

    public ConsolidatedCommodityDetail() {
    }

    public ConsolidatedCommodityDetail(
           java.lang.String groupDescription,
           java.math.BigDecimal subtotalQuantity,
           com.fedex.openship.stub.Money subtotalCustomsValue,
           com.fedex.openship.stub.ConsolidatedCommodity[] commodities) {
           this.groupDescription = groupDescription;
           this.subtotalQuantity = subtotalQuantity;
           this.subtotalCustomsValue = subtotalCustomsValue;
           this.commodities = commodities;
    }


    /**
     * Gets the groupDescription value for this ConsolidatedCommodityDetail.
     * 
     * @return groupDescription   * Description of the commodity group which is summarised in the
     * following subtotals.
     */
    public java.lang.String getGroupDescription() {
        return groupDescription;
    }


    /**
     * Sets the groupDescription value for this ConsolidatedCommodityDetail.
     * 
     * @param groupDescription   * Description of the commodity group which is summarised in the
     * following subtotals.
     */
    public void setGroupDescription(java.lang.String groupDescription) {
        this.groupDescription = groupDescription;
    }


    /**
     * Gets the subtotalQuantity value for this ConsolidatedCommodityDetail.
     * 
     * @return subtotalQuantity
     */
    public java.math.BigDecimal getSubtotalQuantity() {
        return subtotalQuantity;
    }


    /**
     * Sets the subtotalQuantity value for this ConsolidatedCommodityDetail.
     * 
     * @param subtotalQuantity
     */
    public void setSubtotalQuantity(java.math.BigDecimal subtotalQuantity) {
        this.subtotalQuantity = subtotalQuantity;
    }


    /**
     * Gets the subtotalCustomsValue value for this ConsolidatedCommodityDetail.
     * 
     * @return subtotalCustomsValue
     */
    public com.fedex.openship.stub.Money getSubtotalCustomsValue() {
        return subtotalCustomsValue;
    }


    /**
     * Sets the subtotalCustomsValue value for this ConsolidatedCommodityDetail.
     * 
     * @param subtotalCustomsValue
     */
    public void setSubtotalCustomsValue(com.fedex.openship.stub.Money subtotalCustomsValue) {
        this.subtotalCustomsValue = subtotalCustomsValue;
    }


    /**
     * Gets the commodities value for this ConsolidatedCommodityDetail.
     * 
     * @return commodities
     */
    public com.fedex.openship.stub.ConsolidatedCommodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this ConsolidatedCommodityDetail.
     * 
     * @param commodities
     */
    public void setCommodities(com.fedex.openship.stub.ConsolidatedCommodity[] commodities) {
        this.commodities = commodities;
    }

    public com.fedex.openship.stub.ConsolidatedCommodity getCommodities(int i) {
        return this.commodities[i];
    }

    public void setCommodities(int i, com.fedex.openship.stub.ConsolidatedCommodity _value) {
        this.commodities[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsolidatedCommodityDetail)) return false;
        ConsolidatedCommodityDetail other = (ConsolidatedCommodityDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupDescription==null && other.getGroupDescription()==null) || 
             (this.groupDescription!=null &&
              this.groupDescription.equals(other.getGroupDescription()))) &&
            ((this.subtotalQuantity==null && other.getSubtotalQuantity()==null) || 
             (this.subtotalQuantity!=null &&
              this.subtotalQuantity.equals(other.getSubtotalQuantity()))) &&
            ((this.subtotalCustomsValue==null && other.getSubtotalCustomsValue()==null) || 
             (this.subtotalCustomsValue!=null &&
              this.subtotalCustomsValue.equals(other.getSubtotalCustomsValue()))) &&
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities())));
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
        if (getGroupDescription() != null) {
            _hashCode += getGroupDescription().hashCode();
        }
        if (getSubtotalQuantity() != null) {
            _hashCode += getSubtotalQuantity().hashCode();
        }
        if (getSubtotalCustomsValue() != null) {
            _hashCode += getSubtotalCustomsValue().hashCode();
        }
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodities(), i);
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
        new org.apache.axis.description.TypeDesc(ConsolidatedCommodityDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommodityDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GroupDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotalQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SubtotalQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotalCustomsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SubtotalCustomsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommodity"));
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
