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

/**
* PublicIPAddress resource
*/
public class PublicIpAddress extends TopLevelResource {
    private PublicIpAddressDnsSettings dnsSettings;
    
    /**
    * Optional. Gets or sets FQDN of the DNS record associated with the public
    * IP address
    * @return The DnsSettings value.
    */
    public PublicIpAddressDnsSettings getDnsSettings() {
        return this.dnsSettings;
    }
    
    /**
    * Optional. Gets or sets FQDN of the DNS record associated with the public
    * IP address
    * @param dnsSettingsValue The DnsSettings value.
    */
    public void setDnsSettings(final PublicIpAddressDnsSettings dnsSettingsValue) {
        this.dnsSettings = dnsSettingsValue;
    }
    
    private Integer idleTimeoutInMinutes;
    
    /**
    * Optional. Gets or sets the Idletimeout of the public IP address
    * @return The IdleTimeoutInMinutes value.
    */
    public Integer getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    
    /**
    * Optional. Gets or sets the Idletimeout of the public IP address
    * @param idleTimeoutInMinutesValue The IdleTimeoutInMinutes value.
    */
    public void setIdleTimeoutInMinutes(final Integer idleTimeoutInMinutesValue) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutesValue;
    }
    
    private String ipAddress;
    
    /**
    * Optional. Gets the assigned public IP address
    * @return The IpAddress value.
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    
    /**
    * Optional. Gets the assigned public IP address
    * @param ipAddressValue The IpAddress value.
    */
    public void setIpAddress(final String ipAddressValue) {
        this.ipAddress = ipAddressValue;
    }
    
    private ResourceId ipConfiguration;
    
    /**
    * Optional. Gets a reference to the network interface IP configurations
    * using this public IP address
    * @return The IpConfiguration value.
    */
    public ResourceId getIpConfiguration() {
        return this.ipConfiguration;
    }
    
    /**
    * Optional. Gets a reference to the network interface IP configurations
    * using this public IP address
    * @param ipConfigurationValue The IpConfiguration value.
    */
    public void setIpConfiguration(final ResourceId ipConfigurationValue) {
        this.ipConfiguration = ipConfigurationValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the PublicIP resource
    * Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
    
    private String publicIpAllocationMethod;
    
    /**
    * Required. Gets or sets PublicIP allocation method (Static/Dynamic)
    * @return The PublicIpAllocationMethod value.
    */
    public String getPublicIpAllocationMethod() {
        return this.publicIpAllocationMethod;
    }
    
    /**
    * Required. Gets or sets PublicIP allocation method (Static/Dynamic)
    * @param publicIpAllocationMethodValue The PublicIpAllocationMethod value.
    */
    public void setPublicIpAllocationMethod(final String publicIpAllocationMethodValue) {
        this.publicIpAllocationMethod = publicIpAllocationMethodValue;
    }
    
    private String resourceGuid;
    
    /**
    * Optional. Gets or sets resource guid property of the PublicIP resource
    * @return The ResourceGuid value.
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    
    /**
    * Optional. Gets or sets resource guid property of the PublicIP resource
    * @param resourceGuidValue The ResourceGuid value.
    */
    public void setResourceGuid(final String resourceGuidValue) {
        this.resourceGuid = resourceGuidValue;
    }
    
    /**
    * Initializes a new instance of the PublicIpAddress class.
    *
    */
    public PublicIpAddress() {
        super();
    }
    
    /**
    * Initializes a new instance of the PublicIpAddress class with required
    * arguments.
    *
    * @param publicIpAllocationMethod Gets or sets PublicIP allocation method
    * (Static/Dynamic)
    * @param location Gets or sets the location of the resource.
    */
    public PublicIpAddress(String publicIpAllocationMethod, String location) {
        this();
        if (publicIpAllocationMethod == null) {
            throw new NullPointerException("publicIpAllocationMethod");
        }
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setPublicIpAllocationMethod(publicIpAllocationMethod);
        this.setLocation(location);
    }
}
