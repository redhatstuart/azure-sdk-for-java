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

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.ManagementLockGetQueryParameter;
import com.microsoft.azure.management.resources.models.ManagementLockListResult;
import com.microsoft.azure.management.resources.models.ManagementLockProperties;
import com.microsoft.azure.management.resources.models.ManagementLockReturnResult;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ResourceIdentity;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.Future;

/**
* Operations for managing locks.
*/
public interface ManagementLockOperations {
    /**
    * Create or update a management lock at the resource group level.
    *
    * @param resourceGroupName Required. The resource group name.
    * @param lockName Required. The lock name.
    * @param parameters Required. The management lock parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Management lock information.
    */
    ManagementLockReturnResult createOrUpdateAtResourceGroupLevel(String resourceGroupName, String lockName, ManagementLockProperties parameters) throws IOException, ServiceException;
    
    /**
    * Create or update a management lock at the resource group level.
    *
    * @param resourceGroupName Required. The resource group name.
    * @param lockName Required. The lock name.
    * @param parameters Required. The management lock parameters.
    * @return Management lock information.
    */
    Future<ManagementLockReturnResult> createOrUpdateAtResourceGroupLevelAsync(String resourceGroupName, String lockName, ManagementLockProperties parameters);
    
    /**
    * Create or update a management lock at the resource level or any level
    * below resource.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param identity Required. Resource identity.
    * @param lockName Required. The name of lock.
    * @param parameters Required. Create or update management lock parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Management lock information.
    */
    ManagementLockReturnResult createOrUpdateAtResourceLevel(String resourceGroupName, ResourceIdentity identity, String lockName, ManagementLockProperties parameters) throws IOException, ServiceException;
    
    /**
    * Create or update a management lock at the resource level or any level
    * below resource.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param identity Required. Resource identity.
    * @param lockName Required. The name of lock.
    * @param parameters Required. Create or update management lock parameters.
    * @return Management lock information.
    */
    Future<ManagementLockReturnResult> createOrUpdateAtResourceLevelAsync(String resourceGroupName, ResourceIdentity identity, String lockName, ManagementLockProperties parameters);
    
    /**
    * Create or update a management lock at the subscription level.
    *
    * @param lockName Required. The name of lock.
    * @param parameters Required. The management lock parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Management lock information.
    */
    ManagementLockReturnResult createOrUpdateAtSubscriptionLevel(String lockName, ManagementLockProperties parameters) throws IOException, ServiceException;
    
    /**
    * Create or update a management lock at the subscription level.
    *
    * @param lockName Required. The name of lock.
    * @param parameters Required. The management lock parameters.
    * @return Management lock information.
    */
    Future<ManagementLockReturnResult> createOrUpdateAtSubscriptionLevelAsync(String lockName, ManagementLockProperties parameters);
    
    /**
    * Deletes the management lock of a resource group.
    *
    * @param resourceGroup Required. The resource group names.
    * @param lockName Required. The name of lock.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse deleteAtResourceGroupLevel(String resourceGroup, String lockName) throws IOException, ServiceException;
    
    /**
    * Deletes the management lock of a resource group.
    *
    * @param resourceGroup Required. The resource group names.
    * @param lockName Required. The name of lock.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAtResourceGroupLevelAsync(String resourceGroup, String lockName);
    
    /**
    * Deletes the management lock of a resource or any level below resource.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param identity Required. Resource identity.
    * @param lockName Required. The name of lock.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse deleteAtResourceLevel(String resourceGroupName, ResourceIdentity identity, String lockName) throws IOException, ServiceException;
    
    /**
    * Deletes the management lock of a resource or any level below resource.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param identity Required. Resource identity.
    * @param lockName Required. The name of lock.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAtResourceLevelAsync(String resourceGroupName, ResourceIdentity identity, String lockName);
    
    /**
    * Deletes the management lock of a subscription.
    *
    * @param lockName Required. The name of lock.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse deleteAtSubscriptionLevel(String lockName) throws IOException, ServiceException;
    
    /**
    * Deletes the management lock of a subscription.
    *
    * @param lockName Required. The name of lock.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAtSubscriptionLevelAsync(String lockName);
    
    /**
    * Gets the management lock of a scope.
    *
    * @param lockName Required. Name of the management lock.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Management lock information.
    */
    ManagementLockReturnResult get(String lockName) throws IOException, ServiceException;
    
    /**
    * Gets the management lock of a scope.
    *
    * @param lockName Required. Name of the management lock.
    * @return Management lock information.
    */
    Future<ManagementLockReturnResult> getAsync(String lockName);
    
    /**
    * Gets all the management locks of a resource group.
    *
    * @param resourceGroupName Required. Resource group name.
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at, above or below the resource group.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of management locks.
    */
    ManagementLockListResult listAtResourceGroupLevel(String resourceGroupName, ManagementLockGetQueryParameter parameters) throws IOException, ServiceException;
    
    /**
    * Gets all the management locks of a resource group.
    *
    * @param resourceGroupName Required. Resource group name.
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at, above or below the resource group.
    * @return List of management locks.
    */
    Future<ManagementLockListResult> listAtResourceGroupLevelAsync(String resourceGroupName, ManagementLockGetQueryParameter parameters);
    
    /**
    * Gets all the management locks of a resource or any level below resource.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at or below the resource.If atScope() is passed returns all
    * locks at the resource level.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of management locks.
    */
    ManagementLockListResult listAtResourceLevel(String resourceGroupName, ResourceIdentity identity, ManagementLockGetQueryParameter parameters) throws IOException, ServiceException;
    
    /**
    * Gets all the management locks of a resource or any level below resource.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at or below the resource.If atScope() is passed returns all
    * locks at the resource level.
    * @return List of management locks.
    */
    Future<ManagementLockListResult> listAtResourceLevelAsync(String resourceGroupName, ResourceIdentity identity, ManagementLockGetQueryParameter parameters);
    
    /**
    * Gets all the management locks of a subscription.
    *
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at, above or below the subscription.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of management locks.
    */
    ManagementLockListResult listAtSubscriptionLevel(ManagementLockGetQueryParameter parameters) throws IOException, ServiceException;
    
    /**
    * Gets all the management locks of a subscription.
    *
    * @param parameters Optional. Query parameters. If empty is passed returns
    * all locks at, above or below the subscription.
    * @return List of management locks.
    */
    Future<ManagementLockListResult> listAtSubscriptionLevelAsync(ManagementLockGetQueryParameter parameters);
    
    /**
    * Get a list of management locks at resource level or below.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return List of management locks.
    */
    ManagementLockListResult listNext(String nextLink) throws IOException, ServiceException;
    
    /**
    * Get a list of management locks at resource level or below.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @return List of management locks.
    */
    Future<ManagementLockListResult> listNextAsync(String nextLink);
}
