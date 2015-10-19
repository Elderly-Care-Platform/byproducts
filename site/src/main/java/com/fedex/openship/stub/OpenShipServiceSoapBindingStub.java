/**
 * OpenShipServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class OpenShipServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.openship.stub.OpenShipPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[22];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationRequest"), com.fedex.openship.stub.ModifyConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationReply"));
        oper.setReturnClass(com.fedex.openship.stub.ModifyConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentRequest"), com.fedex.openship.stub.ValidateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.ValidateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentRequest"), com.fedex.openship.stub.RetrieveOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrieveOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOpenConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationRequest"), com.fedex.openship.stub.DeleteOpenConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationReply"));
        oper.setReturnClass(com.fedex.openship.stub.DeleteOpenConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationRequest"), com.fedex.openship.stub.CreateConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationReply"));
        oper.setReturnClass(com.fedex.openship.stub.CreateConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrievePackageInOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentRequest"), com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveConsolidatedCommodities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesRequest"), com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPackageInOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentRequest"), com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentRequest"), com.fedex.openship.stub.CreateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.CreateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPendingShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreatePendingShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentRequest"), com.fedex.openship.stub.CreateOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.CreateOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreatePendingShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePendingShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentRequest"), com.fedex.openship.stub.DeletePendingShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.DeletePendingShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentRequest"), com.fedex.openship.stub.ConfirmOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.ConfirmOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConfirmOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsRequest"), com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConfirmConsolidationResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsRequest"), com.fedex.openship.stub.GetConfirmConsolidationResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentRequest"), com.fedex.openship.stub.ModifyOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.ModifyOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationRequest"), com.fedex.openship.stub.ConfirmConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationReply"));
        oper.setReturnClass(com.fedex.openship.stub.ConfirmConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModifyOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsRequest"), com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePackagesFromOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentRequest"), com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPackagesToOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentRequest"), com.fedex.openship.stub.AddPackagesToOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.AddPackagesToOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreateOpenShipmentResults");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsRequest"), com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsReply"));
        oper.setReturnClass(com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveConsolidation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationRequest"), com.fedex.openship.stub.RetrieveConsolidationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationReply"));
        oper.setReturnClass(com.fedex.openship.stub.RetrieveConsolidationReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteOpenShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentRequest"), com.fedex.openship.stub.DeleteOpenShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentReply"));
        oper.setReturnClass(com.fedex.openship.stub.DeleteOpenShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

    }

    public OpenShipServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OpenShipServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OpenShipServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AddPackagesToOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AddPackagesToOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AddPackagesToOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AddPackagesToOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AdrLicenseDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AdrLicenseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedAccount");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedAccountNumberType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedAccountNumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedTrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedTrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AssociatedTrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AssociatedTrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingResultsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingResultsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "AsynchronousProcessingResultType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.AsynchronousProcessingResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BinaryBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.BinaryBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BinaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.BinaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "BrokerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodReturnPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodReturnPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedCodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedCodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedEtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedEtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedHazardousPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedHazardousShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedHazardousSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHazardousSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedHoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedHoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedShipmentConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedShipmentConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedSmartPostDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedSmartPostDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedTagDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedTagDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CompletedTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CompletedTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CondensedCrnReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CondensedCrnReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfirmConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfirmConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfirmOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConfirmOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConfirmOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommoditiesSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommoditiesSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommodityDestinationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommodityDestinationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedPartyReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedPartyReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidatedSoldToSummaryReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidatedSoldToSummaryReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationCustomsLinehaulReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationCustomsLinehaulReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDataSource");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDataSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDataSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDataType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDocument");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationKey");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationShipment");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ConsolidationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ConsolidationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CreateConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CreateConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CreateOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CreateOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CreateOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CreateOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CrnReportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CrnReportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomConsolidationDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomConsolidationDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsDeclarationStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsDeclarationStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsDeclarationStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsDeclarationStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsPackingListDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsPackingListDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "CustomsRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.CustomsRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeclarationCurrency");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeclarationCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeclarationValueType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeclarationValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeleteOpenConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeleteOpenConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeleteOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeleteOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeleteOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePackagesFromOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePendingShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeletePendingShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeletePendingShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DistributionClearanceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DistributionClearanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocumentFormatOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EmailOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FedExDistributionLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FedExDistributionLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmConsolidationResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmConsolidationResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetConfirmOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetCreateOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GetModifyOpenShipmentResultsRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "GroundDeliveryEligibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.GroundDeliveryEligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDistributionSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDistributionSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LicenseOrPermitDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LicenseOrPermitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentActionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ModifyPackageInOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaLowValueStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaLowValueStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "OperationalInstruction");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.OperationalInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageBarcodes");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageBarcodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Party");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Payment");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Payor");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentAccessDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentAccessDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentAccessorDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentAccessorDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PrintedReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PrintedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PrintedReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PrintedReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadioactiveLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadioactiveLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedConsolidation");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedConsolidation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedConsolidationDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedConsolidationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedDistributionLocation");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedDistributionLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidatedCommoditiesRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidationReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveConsolidationRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveConsolidationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrieveOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrieveOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RetrievePackageInOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnedConsolidationDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnedConsolidationDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Rma");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "RotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ServiceCategoryType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ServiceCategoryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentConsolidationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentConsolidationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentInclusionSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentInclusionSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentInternationalDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentInternationalDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentManifestDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentManifestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShipmentTransborderDistributionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShipmentTransborderDistributionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocument");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SplitPaymentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SplitPaymentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SplitPaymentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SplitPaymentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SplitPaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SplitPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Tax");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TinType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionLtlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionLtlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionRoutingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionRoutingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransborderDistributionSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransborderDistributionSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UnitSystemType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UnitSystemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UploadDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UploadDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidatedHazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidatedHazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidatedHazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidatedHazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidatedHazardousContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidatedHazardousContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidateOpenShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "ValidateOpenShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.ValidateOpenShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Volume");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/openship/v7", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.openship.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.openship.stub.ModifyConsolidationReply modifyConsolidation(com.fedex.openship.stub.ModifyConsolidationRequest modifyConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/modifyConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ModifyConsolidationReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ModifyConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ModifyConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ValidateOpenShipmentReply validateOpenShipment(com.fedex.openship.stub.ValidateOpenShipmentRequest validateOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/validateOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validateOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ValidateOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ValidateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ValidateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrieveOpenShipmentReply retrieveOpenShipment(com.fedex.openship.stub.RetrieveOpenShipmentRequest retrieveOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/retrieveOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrieveOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.RetrieveOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrieveOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.DeleteOpenConsolidationReply deleteOpenConsolidation(com.fedex.openship.stub.DeleteOpenConsolidationRequest deleteOpenConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/deleteOpenConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOpenConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteOpenConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.DeleteOpenConsolidationReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.DeleteOpenConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.DeleteOpenConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.CreateConsolidationReply createConsolidation(com.fedex.openship.stub.CreateConsolidationRequest createConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/createConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.CreateConsolidationReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.CreateConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.CreateConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrievePackageInOpenShipmentReply retrievePackageInOpenShipment(com.fedex.openship.stub.RetrievePackageInOpenShipmentRequest retrievePackageInOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/retrievePackageInOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrievePackageInOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrievePackageInOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrievePackageInOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.RetrievePackageInOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrievePackageInOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply retrieveConsolidatedCommodities(com.fedex.openship.stub.RetrieveConsolidatedCommoditiesRequest retrieveConsolidatedCommoditiesRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/retrieveConsolidatedCommodities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveConsolidatedCommodities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveConsolidatedCommoditiesRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrieveConsolidatedCommoditiesReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ModifyPackageInOpenShipmentReply modifyPackageInOpenShipment(com.fedex.openship.stub.ModifyPackageInOpenShipmentRequest modifyPackageInOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/modifyPackageInOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyPackageInOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyPackageInOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ModifyPackageInOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ModifyPackageInOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ModifyPackageInOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.CreateOpenShipmentReply createOpenShipment(com.fedex.openship.stub.CreateOpenShipmentRequest createOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/createOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.CreateOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.CreateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.CreateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.CreateOpenShipmentReply createPendingShipment(com.fedex.openship.stub.CreateOpenShipmentRequest createPendingShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/createPendingShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createPendingShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createPendingShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.CreateOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.CreateOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.CreateOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.DeletePendingShipmentReply deletePendingShipment(com.fedex.openship.stub.DeletePendingShipmentRequest deletePendingShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/deletePendingShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePendingShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deletePendingShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.DeletePendingShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.DeletePendingShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.DeletePendingShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ConfirmOpenShipmentReply confirmOpenShipment(com.fedex.openship.stub.ConfirmOpenShipmentRequest confirmOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/confirmOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {confirmOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ConfirmOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ConfirmOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ConfirmOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply getConfirmOpenShipmentResults(com.fedex.openship.stub.GetConfirmOpenShipmentResultsRequest getConfirmOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/getConfirmOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConfirmOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getConfirmOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetConfirmOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetConfirmConsolidationResultsReply getConfirmConsolidationResults(com.fedex.openship.stub.GetConfirmConsolidationResultsRequest getConfirmConsolidationResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/getConfirmConsolidationResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConfirmConsolidationResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getConfirmConsolidationResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetConfirmConsolidationResultsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.GetConfirmConsolidationResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetConfirmConsolidationResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ModifyOpenShipmentReply modifyOpenShipment(com.fedex.openship.stub.ModifyOpenShipmentRequest modifyOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/modifyOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ModifyOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ModifyOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ModifyOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.ConfirmConsolidationReply confirmConsolidation(com.fedex.openship.stub.ConfirmConsolidationRequest confirmConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/confirmConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "confirmConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {confirmConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.ConfirmConsolidationReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.ConfirmConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.ConfirmConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetModifyOpenShipmentResultsReply getModifyOpenShipmentResults(com.fedex.openship.stub.GetModifyOpenShipmentResultsRequest getModifyOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/getModifyOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getModifyOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getModifyOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetModifyOpenShipmentResultsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.GetModifyOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetModifyOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply deletePackagesFromOpenShipment(com.fedex.openship.stub.DeletePackagesFromOpenShipmentRequest deletePackagesFromOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/deletePackagesFromOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deletePackagesFromOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deletePackagesFromOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.DeletePackagesFromOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.AddPackagesToOpenShipmentReply addPackagesToOpenShipment(com.fedex.openship.stub.AddPackagesToOpenShipmentRequest addPackagesToOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/addPackagesToOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addPackagesToOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {addPackagesToOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.AddPackagesToOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.AddPackagesToOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.AddPackagesToOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.GetCreateOpenShipmentResultsReply getCreateOpenShipmentResults(com.fedex.openship.stub.GetCreateOpenShipmentResultsRequest getCreateOpenShipmentResultsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/getCreateOpenShipmentResults");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCreateOpenShipmentResults"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCreateOpenShipmentResultsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.GetCreateOpenShipmentResultsReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.GetCreateOpenShipmentResultsReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.GetCreateOpenShipmentResultsReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.RetrieveConsolidationReply retrieveConsolidation(com.fedex.openship.stub.RetrieveConsolidationRequest retrieveConsolidationRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/retrieveConsolidation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveConsolidation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {retrieveConsolidationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.RetrieveConsolidationReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.RetrieveConsolidationReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.RetrieveConsolidationReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.openship.stub.DeleteOpenShipmentReply deleteOpenShipment(com.fedex.openship.stub.DeleteOpenShipmentRequest deleteOpenShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/openship/v7/deleteOpenShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteOpenShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteOpenShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.openship.stub.DeleteOpenShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.openship.stub.DeleteOpenShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.openship.stub.DeleteOpenShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
