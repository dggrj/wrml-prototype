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

package org.wrml.model.runtime;

import java.net.URI;

import org.wrml.Model;
import org.wrml.model.schema.Constraint;
import org.wrml.model.schema.Field;
import org.wrml.model.schema.Link;
import org.wrml.model.schema.Schema;
import org.wrml.util.ObservableMap;

public interface Prototype extends Model {

    public ObservableMap<URI, Schema> getAllBaseSchemas();

    public ObservableMap<URI, Constraint> getConstraints();

    public ObservableMap<String, Field> getFields();

    public ObservableMap<URI, Link> getLinks();

    public URI getBlueprintSchemaId();

    public Schema getBlueprintSchema();

}