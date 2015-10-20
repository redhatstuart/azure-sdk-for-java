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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* The Get Details OS Images operation response.
*/
public class VirtualMachineOSImageGetDetailsResponse extends VirtualMachineOSImageGetResponse {
    private ComputeImageAttributes computeImageAttributes;
    
    /**
    * Required. The compute image attributes. Metadata which is required for
    * this image to be useablein the Microsoft.Compute Provider.The
    * combination of values provided for Offer, Sku, and Verison must be
    * unique for a publisher.
    * @return The ComputeImageAttributes value.
    */
    public ComputeImageAttributes getComputeImageAttributes() {
        return this.computeImageAttributes;
    }
    
    /**
    * Required. The compute image attributes. Metadata which is required for
    * this image to be useablein the Microsoft.Compute Provider.The
    * combination of values provided for Offer, Sku, and Verison must be
    * unique for a publisher.
    * @param computeImageAttributesValue The ComputeImageAttributes value.
    */
    public void setComputeImageAttributes(final ComputeImageAttributes computeImageAttributesValue) {
        this.computeImageAttributes = computeImageAttributesValue;
    }
    
    private Boolean isCorrupted;
    
    /**
    * Optional. The indicator of whether the image is corrupted or not.
    * @return The IsCorrupted value.
    */
    public Boolean isCorrupted() {
        return this.isCorrupted;
    }
    
    /**
    * Optional. The indicator of whether the image is corrupted or not.
    * @param isCorruptedValue The IsCorrupted value.
    */
    public void setIsCorrupted(final Boolean isCorruptedValue) {
        this.isCorrupted = isCorruptedValue;
    }
    
    private MarketplaceImageAttributes marketplaceImageAttributes;
    
    /**
    * Optional. The market place image attributes.Metadata which is required
    * for VM Marketplace sourced imagesto be useable in the Microsoft.Compute
    * Provider.
    * @return The MarketplaceImageAttributes value.
    */
    public MarketplaceImageAttributes getMarketplaceImageAttributes() {
        return this.marketplaceImageAttributes;
    }
    
    /**
    * Optional. The market place image attributes.Metadata which is required
    * for VM Marketplace sourced imagesto be useable in the Microsoft.Compute
    * Provider.
    * @param marketplaceImageAttributesValue The MarketplaceImageAttributes
    * value.
    */
    public void setMarketplaceImageAttributes(final MarketplaceImageAttributes marketplaceImageAttributesValue) {
        this.marketplaceImageAttributes = marketplaceImageAttributesValue;
    }
    
    private ArrayList<VirtualMachineOSImageGetDetailsResponse.ReplicationProgressElement> replicationProgress;
    
    /**
    * Optional. The replication progress information of VM images.
    * @return The ReplicationProgress value.
    */
    public ArrayList<VirtualMachineOSImageGetDetailsResponse.ReplicationProgressElement> getReplicationProgress() {
        return this.replicationProgress;
    }
    
    /**
    * Optional. The replication progress information of VM images.
    * @param replicationProgressValue The ReplicationProgress value.
    */
    public void setReplicationProgress(final ArrayList<VirtualMachineOSImageGetDetailsResponse.ReplicationProgressElement> replicationProgressValue) {
        this.replicationProgress = replicationProgressValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineOSImageGetDetailsResponse
    * class.
    *
    */
    public VirtualMachineOSImageGetDetailsResponse() {
        super();
        this.setReplicationProgress(new LazyArrayList<VirtualMachineOSImageGetDetailsResponse.ReplicationProgressElement>());
    }
    
    /**
    * Initializes a new instance of the VirtualMachineOSImageGetDetailsResponse
    * class with required arguments.
    *
    * @param computeImageAttributes The compute image attributes. Metadata
    * which is required for this image to be useablein the Microsoft.Compute
    * Provider.The combination of values provided for Offer, Sku, and Verison
    * must be unique for a publisher.
    */
    public VirtualMachineOSImageGetDetailsResponse(ComputeImageAttributes computeImageAttributes) {
        this();
        if (computeImageAttributes == null) {
            throw new NullPointerException("computeImageAttributes");
        }
        this.setComputeImageAttributes(computeImageAttributes);
    }
    
    /**
    * The replication progress information of VM images.
    */
    public static class ReplicationProgressElement {
        private String location;
        
        /**
        * Optional. The location of the replication of VM image.
        * @return The Location value.
        */
        public String getLocation() {
            return this.location;
        }
        
        /**
        * Optional. The location of the replication of VM image.
        * @param locationValue The Location value.
        */
        public void setLocation(final String locationValue) {
            this.location = locationValue;
        }
        
        private String progress;
        
        /**
        * Optional. The progress of the replication of VM image.
        * @return The Progress value.
        */
        public String getProgress() {
            return this.progress;
        }
        
        /**
        * Optional. The progress of the replication of VM image.
        * @param progressValue The Progress value.
        */
        public void setProgress(final String progressValue) {
            this.progress = progressValue;
        }
    }
}
