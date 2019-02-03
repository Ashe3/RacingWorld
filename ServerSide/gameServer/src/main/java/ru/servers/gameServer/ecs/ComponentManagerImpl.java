/*
 * Copyright 2018 Vladimir Balun
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

package ru.servers.gameServer.ecs;

import ru.servers.gameServer.ecs.components.Component;
import ru.servers.gameServer.ecs.components.ComponentType;

import java.util.Iterator;
import java.util.Map;

public class ComponentManagerImpl implements ComponentManager {

    @Override
    public void createComponent(ComponentType componentType) {

    }

    @Override
    public Component getComponent(int entityID, ComponentType componentType) {
        return null;
    }

    @Override
    public Iterator<Map.Entry<ComponentType, Component>> getComponents(int entityID) {
        return null;
    }

    @Override
    public void destroyComponent(int entityID, ComponentType componentType) {

    }

}