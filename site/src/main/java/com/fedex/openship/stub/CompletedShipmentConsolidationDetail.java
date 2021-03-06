/**
 * CompletedShipmentConsolidationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Associates a shipment within a consolidation with data about the
 * consolidation.
 */
public class CompletedShipmentConsolidationDetail  implements java.io.Serializable {
    /* Identifies the type of consolidation containing this shipment. */
    private com.fedex.openship.stub.ConsolidationType type;

    /* Identifies the role of this shipment within the consolidation. */
    private com.fedex.openship.stub.ConsolidationShipmentRoleType role;

    private com.fedex.openship.stub.CompletedTransborderDistributionDetail completedTransborderDistributionDetail;

    /* Identifies other tracking IDs associated with this shipment
     * in the same consolidation. */
    private com.fedex.openship.stub.AssociatedTrackingId[] associatedTrackingIds;

    public CompletedShipmentConsolidationDetail() {
    }

    public CompletedShipmentConsolidationDetail(
           com.fedex.openship.stub.ConsolidationType type,
           com.fedex.openship.stub.ConsolidationShipmentRoleType role,
           com.fedex.openship.stub.CompletedTransborderDistributionDetail completedTransborderDistributionDetail,
           com.fedex.openship.stub.AssociatedTrackingId[] associatedTrackingIds) {
           this.type = type;
           this.role = role;
           this.completedTransborderDistributionDetail = completedTransborderDistributionDetail;
           this.associatedTrackingIds = associatedTrackingIds;
    }


    /**
     * Gets the type value for this CompletedShipmentConsolidationDetail.
     * 
     * @return type   * Identifies the type of consolidation containing this shipment.
     */
    public com.fedex.openship.stub.ConsolidationType getType() {
        return type;
    }


    /**
     * Sets the type value for this CompletedShipmentConsolidationDetail.
     * 
     * @param type   * Identifies the type of consolidation containing this shipment.
     */
    public void setType(com.fedex.openship.stub.ConsolidationType type) {
        this.type = type;
    }


    /**
     * Gets the role value for this CompletedShipmentConsolidationDetail.
     * 
     * @return role   * Identifies the role of this shipment within the consolidation.
     */
    public com.fedex.openship.stub.ConsolidationShipmentRoleType getRole() {
        return role;
    }


    /**
     * Sets the role value for this CompletedShipmentConsolidationDetail.
     * 
     * @param role   * Identifies the role of this shipment within the consolidation.
     */
    public void setRole(com.fedex.openship.stub.ConsolidationShipmentRoleType role) {
        this.role = role;
    }


    /**
     * Gets the completedTransborderDistributionDetail value for this CompletedShipmentConsolidationDetail.
     * 
     * @return completedTransborderDistributionDetail
     */
    public com.fedex.openship.stub.CompletedTransborderDistributionDetail getCompletedTransborderDistributionDetail() {
        return completedTransborderDistributionDetail;
    }


    /**
     * Sets the completedTransborderDistributionDetail value for this CompletedShipmentConsolidationDetail.
     * 
     * @param completedTransborderDistributionDetail
     */
    public void setCompletedTransborderDistributionDetail(com.fedex.openship.stub.CompletedTransborderDistributionDetail completedTransborderDistributionDetail) {
        this.completedTransborderDistributionDetail = completedTransborderDistributionDetail;
    }


    /**
     * Gets the associatedTrackingIds value for this CompletedShipmentConsolidationDetail.
     * 
     * @return associatedTrackingIds   * Identifies other tracking IDs associated with this shipment
     * in the same consolidation.
     */
    public com.fedex.openship.stub.AssociatedTrackingId[] getAssociatedTrackingIds() {
        return associatedTrackingIds;
    }


    /**
     * Sets the associatedTrackingIds value for this CompletedShipmentConsolidationDetail.
     * 
     * @param associatedTrackingIds   * Identifies other tracking IDs associated with this shipment
     * in the same consolidation.
     */
    public void setAssociatedTrackingIds(com.fedex.openship.stub.AssociatedTrackingId[] associatedTrackingIds) {
        this.associatedTrackingIds = associatedTrackingIds;
    }

    public com.fedex.openship.stub.AssociatedTrackingId getAssociatedTrackingIds(int i) {
        return this.associatedTrackingIds[i];
    }

    public void setAssociatedTrackingIds(int i, com.fedex.openship.stub.AssociatedTrackingId _value) {
        this.associatedTrackingIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletedShipmentConsolidationDetail)) return false;
        CompletedShipmentConsolidationDetail other = (CompletedShipmentConsolidationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.completedTransborderDistributionDetail==null && other.getCompletedTransborderDistributionDetail()==null) || 
             (this.completedTransborderDistributionDetail!=null &&
              this.completedTransborderDistributionDetail.equals(other.getCompletedTransborderDistributionDetail()))) &&
            ((this.associatedTrackingIds==null && other.getAssociatedTrackingIds()==null) || 
             (this.associatedTrackingIds!=null &&
              java.util.Arrays.equals(this.associatedTrackingIds, other.getAssociatedTrackingIds())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getCompletedTransborderDistributionDetail() != null) {
            _hashCode += getCompletedTransborderDistributionDetail().hashCode();
        }
        if (getAssociatedTrackingIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedTrackingIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedTrackingIds(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedShipmentConsolidationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedShipmentConsolidationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationShipmentRoleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedTransborderDistributionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedTransborderDistributionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedTransborderDistributionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedTrackingIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedTrackingIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedTrackingId"));
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
