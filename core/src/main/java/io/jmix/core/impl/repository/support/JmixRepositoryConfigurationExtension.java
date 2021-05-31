/*
 * Copyright 2021 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.jmix.core.impl.repository.support;

import io.jmix.core.repository.JmixDataRepository;
import org.springframework.data.repository.config.RepositoryConfigurationExtensionSupport;

import java.util.Collection;
import java.util.Collections;

public class JmixRepositoryConfigurationExtension extends RepositoryConfigurationExtensionSupport {

    @Override
    public String getRepositoryFactoryBeanClassName() {
        return JmixRepositoryFactoryBean.class.getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getModulePrefix() {
        return "Jmix";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Collection<Class<?>> getIdentifyingTypes() {
        return Collections.singleton(JmixDataRepository.class);
    }
}
