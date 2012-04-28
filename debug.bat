cls && mvn clean package && java -agentlib:jdwp=transport=dt_socket,server=y,address=8000,suspend=n  -jar target\dependency\jetty-runner.jar target\*.war
