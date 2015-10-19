/**
 * RequestedDistributionLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Specifies the type and location id of a distribution location used
 * to process a consolidation.
 */
public class RequestedDistributionLocation  implements java.io.Serializable {
    /* This is a customer-specified or system-assigned identifier
     * that uniquely identifies the specific distibution location within
     * a collection of distribution locations. This is not the same as the
     * FedEx locationId or locationNumber. */
    private java.lang.String id;

    /* Identifies whether the distirbution location is a FedEx Express
     * Station or a FedEx Ground Terminal. */
    private com.fedex.openship.stub.FedExDistributionLocationType type;

    private java.lang.String locationId;

    private java.lang.Integer locationNumber;

    private com.fedex.openship.stub.ContactAndAddress locationContactAndAddress;

    /* This specifies the clearance number (e.g.- PAPS number for
     * US imports) associated with the distribution location. */
    private java.lang.String clearanceNumber;

    /* Specifies which kinds of shipments will be processed by this
     * distribution location. */
    private com.fedex.openship.stub.ShipmentInclusionSpecification[] inclusionSpecifications;

    public RequestedDistributionLocation() {
    }

    public RequestedDistributionLocation(
           java.lang.String id,
           com.fedex.openship.stub.FedExDistributionLocationType type,
           java.lang.String locationId,
           java.lang.Integer locationNumber,
           com.fedex.openship.stub.ContactAndAddress locationContactAndAddress,
           java.lang.String clearanceNumber,
           com.fedex.openship.stub.ShipmentInclusionSpecification[] inclusionSpecifications) {
           this.id = id;
           this.type = type;
           this.locationId = locationId;
           this.locationNumber = locationNumber;
           this.locationContactAndAddress = locationContactAndAddress;
           this.clearanceNumber = clearanceNumber;
           this.inclusionSpecifications = inclusionSpecifications;
    }


    /**
     * Gets the id value for this RequestedDistributionLocation.
     * 
     * @return id   * This is a customer-specified or system-assigned identifier
     * that uniquely identifies the specific distibution location within
     * a collection of distribution locations. This is not the same as the
     * FedEx locationId or locationNumber.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this RequestedDistributionLocation.
     * 
     * @param id   * This is a customer-specified or system-assigned identifier
     * that uniquely identifies the specific distibution location within
     * a collection of distribution locations. This is not the same as the
     * FedEx locationId or locationNumber.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the type value for this RequestedDistributionLocation.
     * 
     * @return type   * Identifies whether the distirbution location is a FedEx Express
     * Station or a FedEx Ground Terminal.
     */
    public com.fedex.openship.stub.FedExDistributionLocationType getType() {
        return type;
    }


    /**
     * Sets the type value for this RequestedDistributionLocation.
     * 
     * @param type   * Identifies whether the distirbution location is a FedEx Express
     * Station or a FedEx Ground Terminal.
     */
    public void setType(com.fedex.openship.stub.FedExDistributionLocationType type) {
        this.type = type;
    }


    /**
     * Gets the locationId value for this RequestedDistributionLocation.
     * 
     * @return locationId
     */
    public java.lang.String getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this RequestedDistributionLocation.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.String locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the locationNumber value for this RequestedDistributionLocation.
     * 
     * @return locationNumber
     */
    public java.lang.Integer getLocationNumber() {
        return locationNumber;
    }


    /**
     * Sets the locationNumber value for this RequestedDistributionLocation.
     * 
     * @param locationNumber
     */
    public void setLocationNumber(java.lang.Integer locationNumber) {
        this.locationNumber = locationNumber;
    }


    /**
     * Gets the locationContactAndAddress value for this RequestedDistributionLocation.
     * 
     * @return locationContactAndAddress
     */
    public com.fedex.openship.stub.ContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }


    /**
     * Sets the locationContactAndAddress value for this RequestedDistributionLocation.
     * 
     * @param locationContactAndAddress
     */
    public void setLocationContactAndAddress(com.fedex.openship.stub.ContactAndAddress locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }


    /**
     * Gets the clearanceNumber value for this RequestedDistributionLocation.
     * 
     * @return clearanceNumber   * This specifies the clearance number (e.g.- PAPS number for
     * US imports) associated with the distribution location.
     */
    public java.lang.String getClearanceNumber() {
        return clearanceNumber;
    }


    /**
     * Sets the clearanceNumber value for this RequestedDistributionLocation.
     * 
     * @param clearanceNumber   * This specifies the clearance number (e.g.- PAPS number for
     * US imports) associated with the distribution location.
     */
    public void setClearanceNumber(java.lang.String clearanceNumber) {
        this.clearanceNumber = clearanceNumber;
    }


    /**
     * Gets the inclusionSpecifications value for this RequestedDistributionLocation.
     * 
     * @return inclusionSpecifications   * Specifies which kinds of shipments will be processed by this
     * distribution location.
     */
    public com.fedex.openship.stub.ShipmentInclusionSpecification[] getInclusionSpecifications() {
        return inclusionSpecifications;
    }


    /**
     * Sets the inclusionSpecifications value for this RequestedDistributionLocation.
     * 
     * @param inclusionSpecifications   * Specifies which kinds of shipments will be processed by this
     * distribution location.
     */
    public void setInclusionSpecifications(com.fedex.openship.stub.ShipmentInclusionSpecification[] inclusionSpecifications) {
        this.inclusionSpecifications = inclusionSpecifications;
    }

    public com.fedex.openship.stub.ShipmentInclusionSpecification getInclusionSpecifications(int i) {
        return this.inclusionSpecifications[i];
    }

    public void setInclusionSpecifications(int i, com.fedex.openship.stub.ShipmentInclusionSpecification _value) {
        this.inclusionSpecifications[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedDistributionLocation)) return false;
        RequestedDistributionLocation other = (RequestedDistributionLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.locationNumber==null && other.getLocationNumber()==null) || 
             (this.locationNumber!=null &&
              this.locationNumber.equals(other.getLocationNumber()))) &&
            ((this.locationContactAndAddress==null && other.getLocationContactAndAddress()==null) || 
             (this.locationContactAndAddress!=null &&
              this.locationContactAndAddress.equals(other.getLocationContactAndAddress()))) &&
            ((this.clearanceNumber==null && other.getClearanceNumber()==null) || 
             (this.clearanceNumber!=null &&
              this.clearanceNumber.equals(other.getClearanceNumber()))) &&
            ((this.inclusionSpecifications==null && other.getInclusionSpecifications()==null) || 
             (this.inclusionSpecifications!=null &&
              java.util.Arrays.equals(this.inclusionSpecifications, other.getInclusionSpecifications())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getLocationNumber() != null) {
            _hashCode += getLocationNumber().hashCode();
        }
        if (getLocationContactAndAddress() != null) {
            _hashCode += getLocationContactAndAddress().hashCode();
        }
        if (getClearanceNumber() != null) {
            _hashCode += getClearanceNumber().hashCode();
        }
        if (getInclusionSpecifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInclusionSpecifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInclusionSpecifications(), i);
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
        new org.apache.axis.description.TypeDesc(RequestedDistributionLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedDistributionLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FedExDistributionLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LocationContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClearanceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inclusionSpecifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InclusionSpecifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentInclusionSpecification"));
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
