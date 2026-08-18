# ci-jenkins-multi-build-demo

A small Java project used to demonstrate Continuous Integration with Jenkins
using three different build tools: Maven, Ant, and Gradle.

## Structure

- `src/main/java/com/vit/demo/App.java` — the application (an `add` method plus a `main` method).
- `src/test/java/com/vit/demo/AppTest.java` — JUnit test used by **Maven** and **Gradle**.
- `src/test/java/com/vit/demo/AntTestRunner.java` — plain test runner used by **Ant** (no JUnit needed).
- `pom.xml` — Maven build configuration.
- `build.xml` — Ant build configuration.
- `build.gradle`, `settings.gradle` — Gradle build configuration.
- `verify-tools.bat` — checks that Java, Git, Maven, Ant, and Gradle are all on PATH.

## Manual build commands

```
mvn -B clean verify
ant build
gradle clean build
```

Each should print:

```
TEST PASSED: App.add(2, 3) returned 5.
```

and produce a JAR:

| Tool   | JAR location                          |
|--------|----------------------------------------|
| Maven  | target/ci-jenkins-demo-1.0.0.jar       |
| Ant    | ant-build/dist/ci-jenkins-demo-1.0.0.jar |
| Gradle | build/libs/ci-jenkins-demo-1.0.0.jar   |
