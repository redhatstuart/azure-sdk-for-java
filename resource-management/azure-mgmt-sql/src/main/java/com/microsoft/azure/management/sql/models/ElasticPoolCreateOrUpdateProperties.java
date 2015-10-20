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

package com.microsoft.azure.management.sql.models;

/**
* Create or update Azure Sql Database Elastic Pool parameters properties.
*/
public class ElasticPoolCreateOrUpdateProperties {
    private Integer databaseDtuMax;
    
    /**
    * Optional. Gets or sets the maximum DTU any one Sql Azure Database can
    * consume.
    * @return The DatabaseDtuMax value.
    */
    public Integer getDatabaseDtuMax() {
        return this.databaseDtuMax;
    }
    
    /**
    * Optional. Gets or sets the maximum DTU any one Sql Azure Database can
    * consume.
    * @param databaseDtuMaxValue The DatabaseDtuMax value.
    */
    public void setDatabaseDtuMax(final Integer databaseDtuMaxValue) {
        this.databaseDtuMax = databaseDtuMaxValue;
    }
    
    private Integer databaseDtuMin;
    
    /**
    * Optional. Gets or sets the minimum DTU all Sql Azure Databases are
    * guaranteed.
    * @return The DatabaseDtuMin value.
    */
    public Integer getDatabaseDtuMin() {
        return this.databaseDtuMin;
    }
    
    /**
    * Optional. Gets or sets the minimum DTU all Sql Azure Databases are
    * guaranteed.
    * @param databaseDtuMinValue The DatabaseDtuMin value.
    */
    public void setDatabaseDtuMin(final Integer databaseDtuMinValue) {
        this.databaseDtuMin = databaseDtuMinValue;
    }
    
    private Integer dtu;
    
    /**
    * Optional. Gets or sets the total shared DTU for the Sql Azure Database
    * Elastic Pool.This must agree with the StorageMB if both are specified.
    * @return The Dtu value.
    */
    public Integer getDtu() {
        return this.dtu;
    }
    
    /**
    * Optional. Gets or sets the total shared DTU for the Sql Azure Database
    * Elastic Pool.This must agree with the StorageMB if both are specified.
    * @param dtuValue The Dtu value.
    */
    public void setDtu(final Integer dtuValue) {
        this.dtu = dtuValue;
    }
    
    private String edition;
    
    /**
    * Optional. Gets or sets the edition for the Azure Sql Database Elastic
    * Pool being updated or created.
    * @return The Edition value.
    */
    public String getEdition() {
        return this.edition;
    }
    
    /**
    * Optional. Gets or sets the edition for the Azure Sql Database Elastic
    * Pool being updated or created.
    * @param editionValue The Edition value.
    */
    public void setEdition(final String editionValue) {
        this.edition = editionValue;
    }
    
    private Integer storageMB;
    
    /**
    * Optional. Gets or sets storage limit for the Sql Azure Database Elastic
    * Pool in MB.This must agree with the Dtu if both are specified.
    * @return The StorageMB value.
    */
    public Integer getStorageMB() {
        return this.storageMB;
    }
    
    /**
    * Optional. Gets or sets storage limit for the Sql Azure Database Elastic
    * Pool in MB.This must agree with the Dtu if both are specified.
    * @param storageMBValue The StorageMB value.
    */
    public void setStorageMB(final Integer storageMBValue) {
        this.storageMB = storageMBValue;
    }
}
