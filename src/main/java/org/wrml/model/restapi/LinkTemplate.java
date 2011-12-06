/**
 * Copyright (C) 2011 WRML.org <mark@wrml.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wrml.model.restapi;

import java.net.URI;

import org.wrml.MediaType;
import org.wrml.model.Document;
import org.wrml.model.UriTemplateParameter;
import org.wrml.model.Versioned;
import org.wrml.model.relation.LinkRelation;
import org.wrml.util.ObservableList;
import org.wrml.util.ObservableMap;

/**
 * A Link template exists within a specific API's design metadata. It is part of
 * a Resource Template which is specific to a design-time linking of two REST
 * API resource templates.
 * 
 * Note: This is a metadata class - instances should be edited with tools and
 * persisted for reuse.
 */
// Generated from a Web Resource Schema
public interface LinkTemplate extends Versioned, Document {

    // Generated from Field
    //     Name: defaultDestinationUriTemplateParameters 
    //     Value: List[Schema[UriTemplateParameter]]
    public ObservableList<UriTemplateParameter> getDefaultDestinationUriTemplateParameters();

    public ResourceTemplate getDestinationResourceTemplate();

    public URI getDestinationResourceTemplateId();

    // Generated from Field
    //     Name: destinationUriTemplateParameters 
    //     Value: Map[ Key=Text[URI], Value=List[Schema[UriTemplateParameter]] ]
    public ObservableMap<URI, ObservableList<UriTemplateParameter>> getDestinationUriTemplateParameters();

    public LinkRelation getLinkRelation();

    public URI getLinkRelationId();

    // Generated from Field
    //     Name: requestTypes 
    //     Value: List[Text[MediaType]]
    public ObservableList<MediaType> getRequestTypes();

    // Generated from Field
    //     Name: responseTypes 
    //     Value: List[Text[MediaType]]    
    public ObservableList<MediaType> getResponseTypes();

    // Generated from Link
    //     Relation: restApiTemplate
    //         Methods: GET 
    //         ResponseSchema: RestApiTemplate
    //     EnabledFormula: restApiTemplateId != null
    //     DestinationUriTemplate: {restApiTemplateId} 
    //     DestinationUriTemplateParameters: [FieldUriTemplateParameter["restApiTemplateId"]]
    //     Href: <restApiTemplateId>
    public RestApiTemplate getRestApiTemplate();

    // Generated from Field
    //     Name: restApiTemplateId 
    //     Value: Text[URI] 
    //     Flags: Required, ReadOnly
    public URI getRestApiTemplateId();

    // Generated from Link
    //     Relation: sourceResourceTemplate
    //         Method: GET 
    //         ResponseSchema: ResourceTemplate
    //     EnabledFormula: sourceResourceTemplateId != null
    //     DestinationUriTemplate: {sourceResourceTemplateId} 
    //     DestinationUriTemplateParameters: [FieldUriTemplateParameter["sourceResourceTemplateId"]]
    //     Href: <sourceResourceTemplateId>
    public ResourceTemplate getSourceResourceTemplate();

    // Generated from Field
    //     Name: sourceResourceTemplateId 
    //     Value: Text[URI] 
    public URI getSourceResourceTemplateId();

    public URI setDestinationResourceTemplateId(URI destinationResourceTemplateId);

    public URI setLinkRelationId(URI linkRelationId);

    public URI setSourceResourceTemplateId(URI sourceResourceTemplateId);

}