--
--    Copyright 2009-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

DROP TABLE user_profile IF EXISTS;
DROP TABLE user_account IF EXISTS;

CREATE TABLE user_profile
(
    id   INT,
    name VARCHAR(20)
);

CREATE TABLE user_account
(
    id   INT,
    name VARCHAR(20)
);

INSERT INTO user_profile (id, name)
VALUES (1, 'Profile1');
INSERT INTO user_account (id, name)
VALUES (1, 'Account1');
