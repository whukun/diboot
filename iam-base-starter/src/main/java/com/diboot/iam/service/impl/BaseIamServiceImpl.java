/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.iam.service.impl;

import com.diboot.core.mapper.BaseCrudMapper;
import com.diboot.core.service.impl.BaseServiceImpl;
import com.diboot.iam.service.BaseIamService;
import lombok.extern.slf4j.Slf4j;

/**
* 自定义BaseService接口实现
* @author mazc@dibo.ltd
* @version 2.0
* @date 2019-12-17
*/
@Slf4j
public class BaseIamServiceImpl<M extends BaseCrudMapper<T>, T> extends BaseServiceImpl<M, T> implements BaseIamService<T> {

}
