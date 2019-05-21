/*
 * Copyright 2019 wobiancao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sugar.demo.core;

import com.sugar.demo.config.DemoConfigure;
import com.sugar.sugarlibrary.base.LibApplication;
import com.sugar.sugarlibrary.base.config.AppSetting;

/**
 * @author wobiancao
 * @date 2019/5/17
 * desc :
 */
public class DemoApplication extends LibApplication {

    @Override
    protected void init() {

    }

    @Override
    protected AppSetting getSetting() {
        return new DemoConfigure().getAppSetting(this);
    }



}