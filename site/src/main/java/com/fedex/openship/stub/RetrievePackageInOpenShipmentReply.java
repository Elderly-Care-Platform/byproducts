/**
 * RetrievePackageInOpenShipmentReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RetrievePackageInOpenShipmentReply  implements java.io.Serializable {
    private com.fedex.openship.stub.NotificationSeverityType highestSeverity;

    private com.fedex.openship.stub.Notification[] notifications;

    private com.fedex.openship.stub.TransactionDetail transactionDetail;

    private com.fedex.openship.stub.VersionId version;

    /* Contains the data for the package specified in the request. */
    private com.fedex.openship.stub.RequestedPackageLineItem requestedPackageLineItem;

    public RetrievePackageInOpenShipmentReply() {
    }

    public RetrievePackageInOpenShipmentReply(
           com.fedex.openship.stub.NotificationSeverityType highestSeverity,
           com.fedex.openship.stub.Notification[] notifications,
           com.fedex.openship.stub.TransactionDetail transactionDetail,
           com.fedex.openship.stub.VersionId version,
           com.fedex.openship.stub.RequestedPackageLineItem requestedPackageLineItem) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.requestedPackageLineItem = requestedPackageLineItem;
    }


    /**
     * Gets the highestSeverity value for this RetrievePackageInOpenShipmentReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.openship.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this RetrievePackageInOpenShipmentReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.openship.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this RetrievePackageInOpenShipmentReply.
     * 
     * @return notifications
     */
    public com.fedex.openship.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this RetrievePackageInOpenShipmentReply.
     * 
     * @param notifications
     */
    public void setNotifications(com.fedex.openship.stub.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.openship.stub.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.openship.stub.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this RetrievePackageInOpenShipmentReply.
     * 
     * @return transactionDetail
     */
    public com.fedex.openship.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this RetrievePackageInOpenShipmentReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.openship.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this RetrievePackageInOpenShipmentReply.
     * 
     * @return version
     */
    public com.fedex.openship.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RetrievePackageInOpenShipmentReply.
     * 
     * @param version
     */
    public void setVersion(com.fedex.openship.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the requestedPackageLineItem value for this RetrievePackageInOpenShipmentReply.
     * 
     * @return requestedPackageLineItem   * Contains the data for the package specified in the request.
     */
    public com.fedex.openship.stub.RequestedPackageLineItem getRequestedPackageLineItem() {
        return requestedPackageLineItem;
    }


    /**
     * Sets the requestedPackageLineItem value for this RetrievePackageInOpenShipmentReply.
     * 
     * @param requestedPackageLineItem   * Contains the data for the package specified in the request.
     */
    public void setRequestedPackageLineItem(com.fedex.openship.stub.RequestedPackageLineItem requestedPackageLineItem) {
        this.requestedPackageLineItem = requestedPackageLineItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrievePackageInOpenShipmentReply)) return false;
        RetrievePackageInOpenShipmentReply other = (RetrievePackageInOpenShipmentReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.requestedPackageLineItem==null && other.getRequestedPackageLineItem()==null) || 
             (this.requestedPackageLineItem!=null &&
              this.requestedPackageLineItem.equals(other.getRequestedPackageLineItem())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getRequestedPackageLineItem() != null) {
            _hashCode += getRequestedPackageLineItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrievePackageInOpenShipmentReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedPackageLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedPackageLineItem"));
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
