/**
 * ConsolidationDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidationDataType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConsolidationDataType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TOTAL_CUSTOMS_VALUE = "TOTAL_CUSTOMS_VALUE";
    public static final java.lang.String _TOTAL_FREIGHT_CHARGES = "TOTAL_FREIGHT_CHARGES";
    public static final java.lang.String _TOTAL_HANDLING_COSTS = "TOTAL_HANDLING_COSTS";
    public static final java.lang.String _TOTAL_INSURANCE_CHARGES = "TOTAL_INSURANCE_CHARGES";
    public static final java.lang.String _TOTAL_INSURED_VALUE = "TOTAL_INSURED_VALUE";
    public static final java.lang.String _TOTAL_PACKING_COSTS = "TOTAL_PACKING_COSTS";
    public static final java.lang.String _TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES = "TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES";
    public static final ConsolidationDataType TOTAL_CUSTOMS_VALUE = new ConsolidationDataType(_TOTAL_CUSTOMS_VALUE);
    public static final ConsolidationDataType TOTAL_FREIGHT_CHARGES = new ConsolidationDataType(_TOTAL_FREIGHT_CHARGES);
    public static final ConsolidationDataType TOTAL_HANDLING_COSTS = new ConsolidationDataType(_TOTAL_HANDLING_COSTS);
    public static final ConsolidationDataType TOTAL_INSURANCE_CHARGES = new ConsolidationDataType(_TOTAL_INSURANCE_CHARGES);
    public static final ConsolidationDataType TOTAL_INSURED_VALUE = new ConsolidationDataType(_TOTAL_INSURED_VALUE);
    public static final ConsolidationDataType TOTAL_PACKING_COSTS = new ConsolidationDataType(_TOTAL_PACKING_COSTS);
    public static final ConsolidationDataType TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES = new ConsolidationDataType(_TOTAL_TAXES_OR_MISCELLANEOUS_CHARGES);
    public java.lang.String getValue() { return _value_;}
    public static ConsolidationDataType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ConsolidationDataType enumeration = (ConsolidationDataType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ConsolidationDataType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ConsolidationDataType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDataType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
