/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.laptop.linuxdevice.plugin.constants;

import org.wso2.carbon.utils.CarbonUtils;
import java.io.File;

/**
 * Device type specific constants which includes all transport protocols configurations,
 * stream definition and device specific dome constants
 */
public class DeviceTypeConstants {
    public final static String DEVICE_TYPE = "linuxdevice";
    public final static String DEVICE_PLUGIN_DEVICE_NAME = "DEVICE_NAME";
    public final static String DEVICE_PLUGIN_DEVICE_ID = "linuxdevice_DEVICE_ID";
    public final static String STATE_ON = "ON";
    public final static String STATE_OFF = "OFF";

    //sensor events summerized table name
//    public static final String SENSOR_TYPE1_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_batterylevelsensor";
//    public static final String SENSOR_TYPE2_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_batterystatussensor";
//    //cpuusage
//    public static final String SENSOR_TYPE3_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_cpuusagesensor";

    //sensor events summerized table name
    public static final String SENSOR_TYPE1_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_BATTERYLEVELSENSOR";
    public static final String SENSOR_TYPE2_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_BATTERYSTATUSSENSOR";
    //cpuusage
    public static final String SENSOR_TYPE3_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_CPUUSAGESENSOR";
    public static final String SENSOR_TYPE4_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_MEMORYSPACESENSOR";
    public static final String SENSOR_TYPE5_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_DISKSPACESENSOR";
    public static final String SENSOR_TYPE6_EVENT_TABLE = "ORG_WSO2_IOT_DEVICES_LOADAVERAGESENSOR";

    public static final String DATA_SOURCE_NAME = "jdbc/linuxdeviceDM_DB";
    public final static String DEVICE_TYPE_PROVIDER_DOMAIN = "carbon.super";
    public final static String SENSOR_TYPE1 = "batterylevelsensor";
    public final static String SENSOR_TYPE2 = "batterystatussensor";
    //cpuusage
    public final static String SENSOR_TYPE3 = "cpuusagesensor";
    public final static String SENSOR_TYPE4 = "memoryspacesensor";
    public final static String SENSOR_TYPE5 = "diskspacesensor";
    public final static String SENSOR_TYPE6 = "loadaveragesensor";

    //mqtt tranport related constants
    public static final String MQTT_ADAPTER_NAME = "batterylevelsensor_mqtt";
    public static final String MQTT_ADAPTER_TYPE = "oauth-mqtt";
    public static final String ADAPTER_TOPIC_PROPERTY = "topic";
    public static final String MQTT_PORT = "\\{mqtt.broker.port\\}";
    public static final String MQTT_BROKER_HOST = "\\{mqtt.broker.host\\}";
    public static final String CARBON_CONFIG_PORT_OFFSET = "Ports.Offset";
    public static final String DEFAULT_CARBON_LOCAL_IP_PROPERTY = "carbon.local.ip";
    public static final int CARBON_DEFAULT_PORT_OFFSET = 0;
    public static final int DEFAULT_MQTT_PORT = 1883;
    public static final String SUBSCRIBED_TOPIC = "carbon.super/linuxdevice/+/batterylevelsensor";
    public static final String CONTENT_TRANSFORMATION = "contentTransformer";
    public static final String CONTENT_VALIDATION = "contentValidator";
    public static final String RESOURCE = "resource";

    public static final String USERNAME_PROPERTY_KEY = "username";
    public static final String DCR_PROPERTY_KEY = "dcrUrl";
    public static final String BROKER_URL_PROPERTY_KEY = "url";
    public static final String SCOPES_PROPERTY_KEY = "scopes";
    public static final String QOS_PROPERTY_KEY = "qos";
    public static final String CLIENT_ID_PROPERTY_KEY = "qos";
    public static final String CLEAR_SESSION_PROPERTY_KEY = "clearSession";
    public static final String TOPIC = "topic";

    public final static String SENSOR_TYPE1_STREAM_DEFINITION = "org.wso2.iot.devices.batterylevelsensor";
    public final static String SENSOR_TYPE1_STREAM_DEFINITION_VERSION = "1.0.0";

    public final static String SENSOR_TYPE2_STREAM_DEFINITION = "org.wso2.iot.devices.batterystatussensor";
    public final static String SENSOR_TYPE2_STREAM_DEFINITION_VERSION = "1.0.0";

    //cpuusage
    public final static String SENSOR_TYPE3_STREAM_DEFINITION = "org.wso2.iot.devices.cpuusagesensor";
    public final static String SENSOR_TYPE3_STREAM_DEFINITION_VERSION = "1.0.0";

    public final static String SENSOR_TYPE4_STREAM_DEFINITION = "org.wso2.iot.devices.memoryspacesensor";
    public final static String SENSOR_TYPE4_STREAM_DEFINITION_VERSION = "1.0.0";

    public final static String SENSOR_TYPE5_STREAM_DEFINITION = "org.wso2.iot.devices.diskspacesensor";
    public final static String SENSOR_TYPE5_STREAM_DEFINITION_VERSION = "1.0.0";

    public final static String SENSOR_TYPE6_STREAM_DEFINITION = "org.wso2.iot.devices.loadaveragesensor";
    public final static String SENSOR_TYPE6_STREAM_DEFINITION_VERSION = "1.0.0";

    public static final String MQTT_CONFIG_LOCATION = CarbonUtils.getEtcCarbonConfigDirPath() + File.separator
            + "mqtt.properties";
}

