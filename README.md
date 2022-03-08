# Java Environment within Docker

This is a Java SDK 8 environment within a Docker container to enable me to do university course work.

## Getting started

```bash
# build container
$ make build

# enter into shell inside docker container
$ make shell

```

## Example usage

```bash
# enter into shell inside docker container
$ make shell

# compile java
$ javac Main.java

# run java
$ java Main
```