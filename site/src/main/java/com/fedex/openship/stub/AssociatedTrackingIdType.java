/**
 * AssociatedTrackingIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class AssociatedTrackingIdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AssociatedTrackingIdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = "COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN";
    public static final java.lang.String _COD_RETURN = "COD_RETURN";
    public static final java.lang.String _CONSOLIDATION_DOCUMENTS = "CONSOLIDATION_DOCUMENTS";
    public static final java.lang.String _CONSOLIDATION_MASTER = "CONSOLIDATION_MASTER";
    public static final java.lang.String _DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = "DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN";
    public static final AssociatedTrackingIdType COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = new AssociatedTrackingIdType(_COD_AND_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN);
    public static final AssociatedTrackingIdType COD_RETURN = new AssociatedTrackingIdType(_COD_RETURN);
    public static final AssociatedTrackingIdType CONSOLIDATION_DOCUMENTS = new AssociatedTrackingIdType(_CONSOLIDATION_DOCUMENTS);
    public static final AssociatedTrackingIdType CONSOLIDATION_MASTER = new AssociatedTrackingIdType(_CONSOLIDATION_MASTER);
    public static final AssociatedTrackingIdType DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN = new AssociatedTrackingIdType(_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN);
    public java.lang.String getValue() { return _value_;}
    public static AssociatedTrackingIdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AssociatedTrackingIdType enumeration = (AssociatedTrackingIdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AssociatedTrackingIdType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AssociatedTrackingIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedTrackingIdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
