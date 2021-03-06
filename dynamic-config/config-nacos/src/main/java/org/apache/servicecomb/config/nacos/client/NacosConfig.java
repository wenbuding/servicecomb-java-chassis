/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.servicecomb.config.nacos.client;

import org.apache.commons.configuration.Configuration;

public class NacosConfig {
  public static final NacosConfig INSTANCE = new NacosConfig();

  private static Configuration finalConfig;

  private static final String DATA_ID = "nacos.config.dataId";

  private static final String SERVER_ADDR = "nacos.config.serverAddr";

  private static final String GROUP = "nacos.config.group";

  private NacosConfig() {
  }

  public static void setConcurrentCompositeConfiguration(Configuration config) {
    finalConfig = config;
  }

  public Configuration getConcurrentCompositeConfiguration() {
    return finalConfig;
  }

  public String getServerAddr() {
    return finalConfig.getString(SERVER_ADDR);
  }

  public String getDataId(){
    return finalConfig.getString(DATA_ID);
  }

  public String getGroup(){
    return finalConfig.getString(GROUP);
  }
}
