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

package org.wrml.service;

import java.net.URI;

import org.wrml.Model;
import org.wrml.model.resource.Action;

public abstract class AbstractExecutableService<K, M extends Model> extends AbstractService<K, M> implements
        ExecutableService<K, M> {

    public Model execute(URI id) {
        return execute(id, null, null);
    }

    public Model execute(URI id, Action action) {
        return execute(id, action, null);
    }

    public Model execute(URI id, Model requestor) {
        return execute(id, null, requestor);
    }

}
