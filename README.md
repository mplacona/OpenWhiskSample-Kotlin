# OpenWhiskSample-Kotlin
A sample application using OpenWhisk and Kotlin

## Build
From terminal just run `gradle jar` and a fat-jar will get created under `build/libs`

## Deploying
- Create a new package called "demo"
```
bx wsk package create demo
```
- Create a web action
```
bx wsk action create demo/myKotlinProject build/libs/OpenWhiskSample-1.0-SNAPSHOT.jar --main MainKt --web true
```

The above will create a web action called "myKotlinProject" in your existing workspace.

### Useful
- Listing workspaces: `bx wsk namespace list`
- URL for Web Action: `https://openwhisk.eu-gb.bluemix.net/api/v1/web/{{workspace}}/{{package}}/{{project-name}}.json`

## Running

- Curl
```
curl -X POST \
  https://openwhisk.eu-gb.bluemix.net/api/v1/web/{{workspace}}/{{package}}/{{project-name}}.json \
  -H 'content-type: application/json' \
  -d '{"name":"Marcos"}'
```

- CLI
```
bx wsk action invoke {{package}}/{{project-name}} -r -p name "Marcos"
```
