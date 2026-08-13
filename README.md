# Java-Utils

A small Java utility library. Right now it provides one helper class, `utils.DateUtils`, for validating and parsing date strings with `java.text.SimpleDateFormat`.

## What it provides

`utils.DateUtils`:

- `isValidDateFormat(String dateStr, String pattern)` — returns `true` if `dateStr` strictly matches the given `SimpleDateFormat` pattern (e.g. `"yyyy-MM-dd"`), `false` otherwise (including `null`/blank input).
- `parseDate(String dateStr, String pattern)` — parses `dateStr` with `pattern` and returns a `java.util.Date`, or `null` if the string doesn't match.
- `isLeapYear(int year)` — returns `true` if `year` is a leap year.

`App` is currently just a `Hello, World!` entry point and doesn't call into `DateUtils`.

## Usage

Copy `JavaPupUtils/src/utils/DateUtils.java` into your project (package `utils`), or compile it yourself and put the class on your classpath — there's no published artifact or build tool yet.

```java
import utils.DateUtils;

boolean ok = DateUtils.isValidDateFormat("2026-08-14", "yyyy-MM-dd"); // true
Date d = DateUtils.parseDate("2026-08-14", "yyyy-MM-dd");
boolean leap = DateUtils.isLeapYear(2026); // false
```

## Build

No Maven or Gradle — plain `javac`. From the `JavaPupUtils` folder:

```bash
cd JavaPupUtils
javac -d bin src/App.java src/utils/DateUtils.java
java -cp bin App
```

Requires a JDK (tested with JDK 21). There is no automated test suite.
