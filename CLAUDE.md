# CLAUDE.md

Small Java utility library (date-format helpers), no build tool — plain `javac`/`java`.

## Commands

No Maven/Gradle. Compile and run from the `JavaPupUtils` folder:

```bash
cd JavaPupUtils
javac -d bin src/App.java src/utils/DateUtils.java
java -cp bin App
```

There is no test suite.

## Architecture

Flat structure, not a layered architecture:

- `JavaPupUtils/src/App.java` — entry point (`main`), currently just prints `Hello, World!` and does not exercise the utilities.
- `JavaPupUtils/src/utils/DateUtils.java` (`utils` package) — static date-handling helpers:
  - `isValidDateFormat(String dateStr, String pattern)` — strict-parses `dateStr` against a `SimpleDateFormat` pattern.
  - `parseDate(String dateStr, String pattern)` — returns a `Date`, or `null` if invalid.
  - `isLeapYear(int year)` — leap-year check.
- `JavaPupUtils/bin/` — precompiled `.class` output, checked into git (build artifact, not source).

That's the whole codebase: one utility class with three static methods. No other packages, no dependencies, no config to understand beyond this.
