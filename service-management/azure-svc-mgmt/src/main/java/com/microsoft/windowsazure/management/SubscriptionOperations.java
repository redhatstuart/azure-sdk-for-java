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

package com.microsoft.windowsazure.management;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.models.SubscriptionGetResponse;
import com.microsoft.windowsazure.management.models.SubscriptionListOperationsParameters;
import com.microsoft.windowsazure.management.models.SubscriptionListOperationsResponse;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

/**
* Operations for listing subscription details.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/gg715315.aspx for more
* information)
*/
public interface SubscriptionOperations {
    /**
    * The Get Subscription operation returns account and resource allocation
    * information for the specified subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh403995.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Subscription operation response.
    */
    SubscriptionGetResponse get() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The Get Subscription operation returns account and resource allocation
    * information for the specified subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh403995.aspx for
    * more information)
    *
    * @return The Get Subscription operation response.
    */
    Future<SubscriptionGetResponse> getAsync();
    
    /**
    * The List Subscription Operations operation returns a list of create,
    * update, and delete operations that were performed on a subscription
    * during the specified timeframe.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg715318.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the List Subscription
    * Operations operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Subscription Operations operation response.
    */
    SubscriptionListOperationsResponse listOperations(SubscriptionListOperationsParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The List Subscription Operations operation returns a list of create,
    * update, and delete operations that were performed on a subscription
    * during the specified timeframe.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/gg715318.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the List Subscription
    * Operations operation.
    * @return The List Subscription Operations operation response.
    */
    Future<SubscriptionListOperationsResponse> listOperationsAsync(SubscriptionListOperationsParameters parameters);
    
    /**
    * Register a resource with your subscription.
    *
    * @param resourceName Required. Name of the resource to register.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse registerResource(String resourceName) throws IOException, ServiceException;
    
    /**
    * Register a resource with your subscription.
    *
    * @param resourceName Required. Name of the resource to register.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> registerResourceAsync(String resourceName);
    
    /**
    * Unregister a resource with your subscription.
    *
    * @param resourceName Required. Name of the resource to unregister.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse unregisterResource(String resourceName) throws IOException, ServiceException;
    
    /**
    * Unregister a resource with your subscription.
    *
    * @param resourceName Required. Name of the resource to unregister.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> unregisterResourceAsync(String resourceName);
}
