# Java demo project

This project is a simple demonstration of a WS

This project use Quarkus and need a Mandrel or GraalVM edition compatible with Java 11.
You will also need Maven.

## Java mode

### Compiling

To compile the project as a Uber-jar run the commande:

```shell
mvn package -Dquarkus.package.type=uber-jar
```

### Running

To run the project, launch the command:

```
java -jar target/gitpod_java-1.0.0-SNAPSHOT-runner.jar
```

The server will be launched on port 8080

## Native mode

### Compiling

To compile in native mode, be sure that the Mandrel/GraalVM is avaiable in the Path and run:

```shell
mvn package -Pnative
```

### Running

Execute the native binary:

```shell
target/gitpod_java-1.0.0-SNAPSHOT-runner
```

## Services

### get /hello

Return the «Hello, word!» String.

### get /hello/\<name>

Catch the "name" url variable and return the «Hello, {name}!» String.

## get /complex

Return the following Json:

```Json
{"id":35,"name":"test","description":["human","animal"],"map":{"Test":"one","other":"two"}}
```

## post /complex

Take a Json in the following format:

```Json
{"id": number, "name": string, "description": Array<String>, "map": Map<String, String>}
```

And return the String «Received object with id {id} and name {name}»
