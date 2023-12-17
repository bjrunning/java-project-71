.DEFAULT_GOAL := build-run

clean:
	@./gradlew clean

build:
	@./gradlew clean build

install:
	@./gradlew clean install

run-dist:
	@./build/install/app/bin/app

help:
	@./build/install/app/bin/app -h

version:
	@./build/install/app/bin/app -V

json:
	@./build/install/app/bin/app src/test/resources/fixtures/json1.json src/test/resources/fixtures/json2.json

yaml:
	@./build/install/app/bin/app src/test/resources/fixtures/yaml1.yaml src/test/resources/fixtures/yaml2.yaml

yml:
	@./build/install/app/bin/app src/test/resources/fixtures/yml1.yml src/test/resources/fixtures/yml2.yml

stylish:
	@./build/install/app/bin/app -f stylish src/test/resources/fixtures/json1.json src/test/resources/fixtures/json2.json

plain:
	@./build/install/app/bin/app -f plain src/test/resources/fixtures/json1.json src/test/resources/fixtures/json2.json

big-json:
	@./build/install/app/bin/app -f json src/test/resources/fixtures/json1.json src/test/resources/fixtures/json2.json
run:
	@./gradlew run

test:
	@./gradlew test

report:
	@./gradlew jacocoTestReport

lint:
	@./gradlew checkstyleMain checkstyleTest

update-deps:
	@./gradlew useLatestVersions


build-run: build run

.PHONY: build