/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* ApplicationGateways resource
*/
public class ApplicationGateway extends TopLevelResource {
    private ArrayList<ApplicationGatewayBackendAddressPool> backendAddressPools;
    
    /**
    * Optional. Gets or sets backend address pool of application gateway
    * resource
    * @return The BackendAddressPools value.
    */
    public ArrayList<ApplicationGatewayBackendAddressPool> getBackendAddressPools() {
        return this.backendAddressPools;
    }
    
    /**
    * Optional. Gets or sets backend address pool of application gateway
    * resource
    * @param backendAddressPoolsValue The BackendAddressPools value.
    */
    public void setBackendAddressPools(final ArrayList<ApplicationGatewayBackendAddressPool> backendAddressPoolsValue) {
        this.backendAddressPools = backendAddressPoolsValue;
    }
    
    private ArrayList<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;
    
    /**
    * Optional. Gets or sets backend http settings of application gateway
    * resource
    * @return The BackendHttpSettingsCollection value.
    */
    public ArrayList<ApplicationGatewayBackendHttpSettings> getBackendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }
    
    /**
    * Optional. Gets or sets backend http settings of application gateway
    * resource
    * @param backendHttpSettingsCollectionValue The
    * BackendHttpSettingsCollection value.
    */
    public void setBackendHttpSettingsCollection(final ArrayList<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollectionValue) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollectionValue;
    }
    
    private ArrayList<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations;
    
    /**
    * Optional. Gets or sets frontend IP addresses of application gateway
    * resource
    * @return The FrontendIPConfigurations value.
    */
    public ArrayList<ApplicationGatewayFrontendIPConfiguration> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations;
    }
    
    /**
    * Optional. Gets or sets frontend IP addresses of application gateway
    * resource
    * @param frontendIPConfigurationsValue The FrontendIPConfigurations value.
    */
    public void setFrontendIPConfigurations(final ArrayList<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurationsValue) {
        this.frontendIPConfigurations = frontendIPConfigurationsValue;
    }
    
    private ArrayList<ApplicationGatewayFrontendPort> frontendPorts;
    
    /**
    * Optional. Gets or sets frontend ports of application gateway resource
    * @return The FrontendPorts value.
    */
    public ArrayList<ApplicationGatewayFrontendPort> getFrontendPorts() {
        return this.frontendPorts;
    }
    
    /**
    * Optional. Gets or sets frontend ports of application gateway resource
    * @param frontendPortsValue The FrontendPorts value.
    */
    public void setFrontendPorts(final ArrayList<ApplicationGatewayFrontendPort> frontendPortsValue) {
        this.frontendPorts = frontendPortsValue;
    }
    
    private ArrayList<ApplicationGatewayIPConfiguration> gatewayIPConfigurations;
    
    /**
    * Optional. Gets or sets subnets of application gateway resource
    * @return The GatewayIPConfigurations value.
    */
    public ArrayList<ApplicationGatewayIPConfiguration> getGatewayIPConfigurations() {
        return this.gatewayIPConfigurations;
    }
    
    /**
    * Optional. Gets or sets subnets of application gateway resource
    * @param gatewayIPConfigurationsValue The GatewayIPConfigurations value.
    */
    public void setGatewayIPConfigurations(final ArrayList<ApplicationGatewayIPConfiguration> gatewayIPConfigurationsValue) {
        this.gatewayIPConfigurations = gatewayIPConfigurationsValue;
    }
    
    private ArrayList<ApplicationGatewayHttpListener> httpListeners;
    
    /**
    * Optional. Gets or sets HTTP listeners of application gateway resource
    * @return The HttpListeners value.
    */
    public ArrayList<ApplicationGatewayHttpListener> getHttpListeners() {
        return this.httpListeners;
    }
    
    /**
    * Optional. Gets or sets HTTP listeners of application gateway resource
    * @param httpListenersValue The HttpListeners value.
    */
    public void setHttpListeners(final ArrayList<ApplicationGatewayHttpListener> httpListenersValue) {
        this.httpListeners = httpListenersValue;
    }
    
    private String operationalState;
    
    /**
    * Optional. Gets operational state of application gateway resource
    * @return The OperationalState value.
    */
    public String getOperationalState() {
        return this.operationalState;
    }
    
    /**
    * Optional. Gets operational state of application gateway resource
    * @param operationalStateValue The OperationalState value.
    */
    public void setOperationalState(final String operationalStateValue) {
        this.operationalState = operationalStateValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the ApplicationGateway
    * resource Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the ApplicationGateway
    * resource Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private ArrayList<ApplicationGatewayRequestRoutingRule> requestRoutingRules;
    
    /**
    * Optional. Gets or sets request routing rules of application gateway
    * resource
    * @return The RequestRoutingRules value.
    */
    public ArrayList<ApplicationGatewayRequestRoutingRule> getRequestRoutingRules() {
        return this.requestRoutingRules;
    }
    
    /**
    * Optional. Gets or sets request routing rules of application gateway
    * resource
    * @param requestRoutingRulesValue The RequestRoutingRules value.
    */
    public void setRequestRoutingRules(final ArrayList<ApplicationGatewayRequestRoutingRule> requestRoutingRulesValue) {
        this.requestRoutingRules = requestRoutingRulesValue;
    }
    
    private String resourceGuid;
    
    /**
    * Optional. Gets or sets resource guid property of the ApplicationGateway
    * resource
    * @return The ResourceGuid value.
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    
    /**
    * Optional. Gets or sets resource guid property of the ApplicationGateway
    * resource
    * @param resourceGuidValue The ResourceGuid value.
    */
    public void setResourceGuid(final String resourceGuidValue) {
        this.resourceGuid = resourceGuidValue;
    }
    
    private ApplicationGatewaySku sku;
    
    /**
    * Optional. Gets or sets sku of application gateway resource
    * @return The Sku value.
    */
    public ApplicationGatewaySku getSku() {
        return this.sku;
    }
    
    /**
    * Optional. Gets or sets sku of application gateway resource
    * @param skuValue The Sku value.
    */
    public void setSku(final ApplicationGatewaySku skuValue) {
        this.sku = skuValue;
    }
    
    private ArrayList<ApplicationGatewaySslCertificate> sslCertificates;
    
    /**
    * Optional. Gets or sets ssl certificates of application gateway resource
    * @return The SslCertificates value.
    */
    public ArrayList<ApplicationGatewaySslCertificate> getSslCertificates() {
        return this.sslCertificates;
    }
    
    /**
    * Optional. Gets or sets ssl certificates of application gateway resource
    * @param sslCertificatesValue The SslCertificates value.
    */
    public void setSslCertificates(final ArrayList<ApplicationGatewaySslCertificate> sslCertificatesValue) {
        this.sslCertificates = sslCertificatesValue;
    }
    
    /**
    * Initializes a new instance of the ApplicationGateway class.
    *
    */
    public ApplicationGateway() {
        super();
        this.setBackendAddressPools(new LazyArrayList<ApplicationGatewayBackendAddressPool>());
        this.setBackendHttpSettingsCollection(new LazyArrayList<ApplicationGatewayBackendHttpSettings>());
        this.setFrontendIPConfigurations(new LazyArrayList<ApplicationGatewayFrontendIPConfiguration>());
        this.setFrontendPorts(new LazyArrayList<ApplicationGatewayFrontendPort>());
        this.setGatewayIPConfigurations(new LazyArrayList<ApplicationGatewayIPConfiguration>());
        this.setHttpListeners(new LazyArrayList<ApplicationGatewayHttpListener>());
        this.setRequestRoutingRules(new LazyArrayList<ApplicationGatewayRequestRoutingRule>());
        this.setSslCertificates(new LazyArrayList<ApplicationGatewaySslCertificate>());
    }
    
    /**
    * Initializes a new instance of the ApplicationGateway class with required
    * arguments.
    *
    * @param location Gets or sets the location of the resource.
    */
    public ApplicationGateway(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
