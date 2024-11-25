


first run this (kafkademocrud) project then run simplifiedlicenseapi 
must sure 
1.kafka server start
2. producer
3. consumer






Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\nsw-project-training\kafkademocrud> git init
Initialized empty Git repository in C:/nsw-project-training/kafkademocrud/.git/
PS C:\nsw-project-training\kafkademocrud> git remote add origin https://github.com/bsmmutarrif/kafkademocrud.git
PS C:\nsw-project-training\kafkademocrud> git branch -M master
PS C:\nsw-project-training\kafkademocrud> git push -u origin master  
error: src refspec master does not match any
error: failed to push some refs to 'https://github.com/bsmmutarrif/kafkademocrud.git'
PS C:\nsw-project-training\kafkademocrud> git add .
warning: in the working copy of '.gitattributes', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'build.gradle', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'gradle/wrapper/gradle-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'settings.gradle', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/example/kafkademocrud/KafkademocrudApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/example/kafkademocrud/KafkademocrudApplicationTests.java', LF will be replaced by CRLF the next time Git touches it
PS C:\nsw-project-training\kafkademocrud> git commit -m "kafkademocrud 1st push"
[master (root-commit) a28bdd5] kafkademocrud 1st push
 21 files changed, 792 insertions(+)
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 build.gradle
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100644 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 settings.gradle
 create mode 100644 src/main/java/com/example/kafkademocrud/KafkademocrudApplication.java
 create mode 100644 src/main/java/com/example/kafkademocrud/controller/LicenseTypeController.java
 create mode 100644 src/main/java/com/example/kafkademocrud/entity/LicenseType.java
 create mode 100644 src/main/java/com/example/kafkademocrud/entity/SimplifiedLicense.java
 create mode 100644 src/main/java/com/example/kafkademocrud/repository/LicenseTypeRepository.java
 create mode 100644 src/main/java/com/example/kafkademocrud/repository/SimplifiedLicenseRepository.java
 create mode 100644 src/main/java/com/example/kafkademocrud/service/KafkaConsumerService.java
 create mode 100644 src/main/java/com/example/kafkademocrud/service/KafkaProducerService.java
 create mode 100644 src/main/java/com/example/kafkademocrud/service/LicenseTypeService.java
 create mode 100644 src/main/java/com/example/kafkademocrud/service/SimplifiedLicenseService.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/main/resources/application.yml
 create mode 100644 src/test/java/com/example/kafkademocrud/KafkademocrudApplicationTests.java
PS C:\nsw-project-training\kafkademocrud> git push origin master
fatal: unable to connect to cache daemon: Unknown error
Enumerating objects: 41, done.
Counting objects: 100% (41/41), done.
Delta compression using up to 8 threads
Compressing objects: 100% (31/31), done.
Writing objects: 100% (41/41), 49.18 KiB | 1.59 MiB/s, done.
Total 41 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/bsmmutarrif/kafkademocrud.git
 * [new branch]      master -> master
PS C:\nsw-project-training\kafkademocrud> 
