json-jackson
===
Basic Java application to test out JSON parsing using the Jackson JSON library.

All commands are run from the project root in a CLI.

# Run

1. Build the application package
    ```shell
    mvn package
    ```

2. Execute the application
    ```shell
    java -cp target/json-jackson-${version}.jar uk.org.aeb.json.jackson.Main
    ```
    where the JAR `${version}` can be found in the [pom.xml](pom.xml)

# Test

```shell
mvn test
```
