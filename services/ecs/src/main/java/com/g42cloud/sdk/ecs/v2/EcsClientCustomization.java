/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.g42cloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientCustomization;
import com.huaweicloud.sdk.core.CustomizationConfigure;

public class EcsClientCustomization implements ClientCustomization {

    private static com.g42cloud.sdk.ecs.v2.EcsCustomModule ecsCustomModule =
            new com.g42cloud.sdk.ecs.v2.EcsCustomModule();

    @Override
    public void customize(CustomizationConfigure customizationConfigure) {
        customizationConfigure.configJson(objectMapper -> {
            if (!objectMapper.getRegisteredModuleIds().contains(ecsCustomModule.getTypeId())) {
                objectMapper.registerModule(ecsCustomModule);
            }
        });
    }
}
