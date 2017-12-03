# Android File Logger

This is my first library to save the log in the file(External)

Download
--------
Via Maven
```xml
<dependency>
  <groupId>com.ak.mylibrary</groupId>
  <artifactId>file-logger</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```
or Via Gradle
```groovy
compile 'com.ak.mylibrary:file-logger:1.0'
```

Implementation
--------------
In Application class
`public class Appcontroller extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FileLogger.getInstance().attachApplication(this);
    }
}`
##In Activity or Fragment
`FileLogger logger=FileLogger.getInstance();
        logger.startLoggerForTag(TAG);
         logger.appendLog(TAG, "Onstart");
         //Called on OnDestory method
        logger.flush(TAG);
        `
[Sample](https://github.com/ananthDev/FileLogger/tree/master/app/src/main/java/com/ak/filelogger)

Later release
-------------
1. More options for log 
2. Encryption and decryption log 

### Issues
Please free to share your [issues](https://github.com/ananthDev/FileLogger/issues) and feedbacks(maakdeveloper@gmail.com) 

License
=======

    Copyright 2017 Ananth

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
