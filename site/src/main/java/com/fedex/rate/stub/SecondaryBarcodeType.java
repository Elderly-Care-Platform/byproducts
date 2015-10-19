/**
 * SecondaryBarcodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class SecondaryBarcodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecondaryBarcodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMMON_2D = "COMMON_2D";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _SSCC_18 = "SSCC_18";
    public static final java.lang.String _USPS = "USPS";
    public static final SecondaryBarcodeType COMMON_2D = new SecondaryBarcodeType(_COMMON_2D);
    public static final SecondaryBarcodeType NONE = new SecondaryBarcodeType(_NONE);
    public static final SecondaryBarcodeType SSCC_18 = new SecondaryBarcodeType(_SSCC_18);
    public static final SecondaryBarcodeType USPS = new SecondaryBarcodeType(_USPS);
    public java.lang.String getValue() { return _value_;}
    public static SecondaryBarcodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SecondaryBarcodeType enumeration = (SecondaryBarcodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SecondaryBarcodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SecondaryBarcodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v16", "SecondaryBarcodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
