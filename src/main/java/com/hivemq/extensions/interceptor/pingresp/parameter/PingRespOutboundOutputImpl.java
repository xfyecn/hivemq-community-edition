/*
 * Copyright 2019 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hivemq.extensions.interceptor.pingresp.parameter;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.interceptor.pingresp.parameter.PingRespOutboundOutput;
import com.hivemq.extensions.executor.PluginOutPutAsyncer;
import com.hivemq.extensions.executor.task.AbstractSimpleAsyncOutput;
import com.hivemq.extensions.executor.task.PluginTaskOutput;

import java.util.function.Supplier;

/**
 * @author Robin Atherton
 */
public class PingRespOutboundOutputImpl extends AbstractSimpleAsyncOutput<PingRespOutboundOutput>
        implements PingRespOutboundOutput, PluginTaskOutput, Supplier<PingRespOutboundOutputImpl> {

    public PingRespOutboundOutputImpl(final @NotNull PluginOutPutAsyncer asyncer) {
        super(asyncer);
    }

    @Override
    public @NotNull PingRespOutboundOutputImpl get() {
        return this;
    }
}