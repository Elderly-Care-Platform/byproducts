/**
 * BrokerDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class BrokerDetail  implements java.io.Serializable {
    private com.fedex.openship.stub.BrokerType type;

    private com.fedex.openship.stub.Party broker;

    /* Specifies details about how the charges for the brokerage processing
     * are paid for. */
    private com.fedex.openship.stub.Payment brokerageProcessingChargesPayment;

    public BrokerDetail() {
    }

    public BrokerDetail(
           com.fedex.openship.stub.BrokerType type,
           com.fedex.openship.stub.Party broker,
           com.fedex.openship.stub.Payment brokerageProcessingChargesPayment) {
           this.type = type;
           this.broker = broker;
           this.brokerageProcessingChargesPayment = brokerageProcessingChargesPayment;
    }


    /**
     * Gets the type value for this BrokerDetail.
     * 
     * @return type
     */
    public com.fedex.openship.stub.BrokerType getType() {
        return type;
    }


    /**
     * Sets the type value for this BrokerDetail.
     * 
     * @param type
     */
    public void setType(com.fedex.openship.stub.BrokerType type) {
        this.type = type;
    }


    /**
     * Gets the broker value for this BrokerDetail.
     * 
     * @return broker
     */
    public com.fedex.openship.stub.Party getBroker() {
        return broker;
    }


    /**
     * Sets the broker value for this BrokerDetail.
     * 
     * @param broker
     */
    public void setBroker(com.fedex.openship.stub.Party broker) {
        this.broker = broker;
    }


    /**
     * Gets the brokerageProcessingChargesPayment value for this BrokerDetail.
     * 
     * @return brokerageProcessingChargesPayment   * Specifies details about how the charges for the brokerage processing
     * are paid for.
     */
    public com.fedex.openship.stub.Payment getBrokerageProcessingChargesPayment() {
        return brokerageProcessingChargesPayment;
    }


    /**
     * Sets the brokerageProcessingChargesPayment value for this BrokerDetail.
     * 
     * @param brokerageProcessingChargesPayment   * Specifies details about how the charges for the brokerage processing
     * are paid for.
     */
    public void setBrokerageProcessingChargesPayment(com.fedex.openship.stub.Payment brokerageProcessingChargesPayment) {
        this.brokerageProcessingChargesPayment = brokerageProcessingChargesPayment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrokerDetail)) return false;
        BrokerDetail other = (BrokerDetail) obj;
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
            ((this.broker==null && other.getBroker()==null) || 
             (this.broker!=null &&
              this.broker.equals(other.getBroker()))) &&
            ((this.brokerageProcessingChargesPayment==null && other.getBrokerageProcessingChargesPayment()==null) || 
             (this.brokerageProcessingChargesPayment!=null &&
              this.brokerageProcessingChargesPayment.equals(other.getBrokerageProcessingChargesPayment())));
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
        if (getBroker() != null) {
            _hashCode += getBroker().hashCode();
        }
        if (getBrokerageProcessingChargesPayment() != null) {
            _hashCode += getBrokerageProcessingChargesPayment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrokerDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BrokerDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BrokerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Broker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokerageProcessingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BrokerageProcessingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Payment"));
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
