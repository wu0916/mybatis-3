/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.lazy_properties;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Mapper {
    User getUser(Integer id);

    @ResultMap("user")
    @Select("SELECT 11 id, 'lazy1' name FROM (VALUES(0))")
    User getLazy1();

    @ResultMap("user")
    @Select("SELECT 12 id, 'lazy2' name FROM (VALUES(0))")
    User getLazy2();

    @ResultMap("user")
    @Select("SELECT 13 id, 'lazy3' name FROM (VALUES(0))")
    List<User> getLazy3();
}
