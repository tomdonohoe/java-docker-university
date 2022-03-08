build:
	docker build -t my-java-app .
.PHONY: build

start:
	docker run --rm -it my-java-app
.PHONY: start

shell:
	docker run --rm -it my-java-app bash
.PHONY: docker-exec