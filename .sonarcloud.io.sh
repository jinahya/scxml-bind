#!/bin/sh
mvn sonar:sonar \
  -Dsonar.projectKey=jinahya_scxml-bind \
  -Dsonar.organization=jinahya-github \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=d9bf5bfc55c72888f6f31a4f63087875d29987ed
