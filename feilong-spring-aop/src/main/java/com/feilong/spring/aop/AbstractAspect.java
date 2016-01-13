/*
 * Copyright (C) 2008 feilong
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
package com.feilong.spring.aop;

import org.springframework.core.Ordered;

/**
 * {@link org.aspectj.lang.annotation.Aspect}相关父类.
 * 
 * @author feilong
 * @version 1.0 2012-4-13 上午1:14:20
 * @version 1.1.1 add implements Ordered
 * @see org.springframework.core.Ordered
 */
public abstract class AbstractAspect implements Ordered{

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.core.Ordered#getOrder()
     */
    @Override
    public int getOrder(){
        return 0;
    }
}