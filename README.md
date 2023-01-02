# MuleSoft Secure Properties Tool

The tool uses [MuleSoft Secure Properties Tool](https://docs.mulesoft.com/mule-runtime/4.4/secure-configuration-properties#secure_props_tool) jar file to generate secure configuration properties for a [MuleSoft](https://www.mulesoft.com/) project. It provides a simple web interface (HTML + JavaScript) powered by RAML defined MuleSoft REST API at back end.

## Prerequisites

- Anypoint Studio 7.x
- Mule runtime 4.4.x or later
- Java 8 or later

## Installation and Configuration

1. Clone or download the project from [GitHub](https://github.com/apurbagiri/mule-secure-config-web-api/tree/main).
2. In Anypoint Studio, import the project as a MuleSoft project.
3. Deploy and run the project on recommended Mule runtime.

**The repository provides the required jar file to simplify the building process. However, it can also be downloaded from MuleSoft directly from [here](https://docs.mulesoft.com/mule-runtime/4.4/secure-configuration-properties#secure_props_tool) and placed under `<project-root>/ext-lib/`

#### Access Web UI
```sh
http://localhost:8081/
```  

#### REST API URL
```sh
http://localhost:8081/api/
``` 

#### Access embedded REST API Console
```sh
http://localhost:8081/console/
```
<br />


## Usage

1. Access the Web UI on a browser
2. Select desired `Operation`, `Algorithm` & `Mode of Operation`
3. Select `Encryption Scope`
4. Enter encryption `Key`
5. For `String` encryption, enter a string `Value`. For `Property Value` or `All File Content` encryption, select the input file from system. 
6. Click on `Encrypt` or `Decrypt` button to apply the desired operation.
7. For `String` scoped encryption, the encrypted/decrypted value will be displayed in the `Output` window at the bottom of the Web UI. For `File Property Value` or `All File Content` scoped encryption, the encrypted/decrypted property file will be downloaded.

## Features

1. Uses java to implement supported operations & encryption types: `string`, `file` & `file-level`
2. Can encrypt/decrypt both `.properties` file & `.yaml` file
3. Error messages returned during operation are clearly shown in `Output` section
4. Due to nature of operation, no sensitve values are logged

To create secure properties within a MuleSoft application, please follow [this](https://docs.mulesoft.com/mule-runtime/4.4/secure-configuration-properties)

<br />

<br />

## Web UI Interface

![image](https://user-images.githubusercontent.com/1264854/210201629-14f1b73e-2d55-4809-9992-101bac3c95ae.png)
