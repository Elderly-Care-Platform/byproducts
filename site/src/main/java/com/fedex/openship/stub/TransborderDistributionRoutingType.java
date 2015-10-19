/**
 * TransborderDistributionRoutingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class TransborderDistributionRoutingType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransborderDistributionRoutingType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BY_METER = "BY_METER";
    public static final java.lang.String _BY_ORIGIN = "BY_ORIGIN";
    public static final java.lang.String _CUSTOMER_SPECIFIED = "CUSTOMER_SPECIFIED";
    public static final TransborderDistributionRoutingType BY_METER = new TransborderDistributionRoutingType(_BY_METER);
    public static final TransborderDistributionRoutingType BY_ORIGIN = new TransborderDistributionRoutingType(_BY_ORIGIN);
    public static final TransborderDistributionRoutingType CUSTOMER_SPECIFIED = new TransborderDistributionRoutingType(_CUSTOMER_SPECIFIED);
    public java.lang.String getValue() { return _value_;}
    public static TransborderDistributionRoutingType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransborderDistributionRoutingType enumeration = (TransborderDistributionRoutingType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransborderDistributionRoutingType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransborderDistributionRoutingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionRoutingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
