museum
======

Framework for digital museum companioning

# Development

Make sure to have JRE on your current machine.

Set shell commands which we will use from here on out

```sh
alias gradle=./gradlew
```

Run tourist app on connected device

```sh
gradle appTouristAndroid:installDebug
```

Run tour guide app on connected device

```sh
gradle appGuideAndroid:installDebug
```

Run cloud service on local network (:8080)

```sh
gradle service:run
```

Run creator app on local network (:8080)

```sh
gradle appCreatorWeb:jsBrowserDevelopmentRun
```
