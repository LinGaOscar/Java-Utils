# Development notes

## Setup

Just a JDK — no Maven, Gradle, or other build tool. Any recent JDK works (developed/verified against JDK 21). No external dependencies.

## Build & run

```bash
cd JavaPupUtils
javac -d bin src/App.java src/utils/DateUtils.java
java -cp bin App
```

`bin/` (compiled `.class` files) is checked into the repo as a build artifact rather than generated in CI — if you change the source, recompile and commit the updated `.class` files too, or they'll go stale.

## Testing

There is no test suite (no JUnit, no test folder). If you add tests, that's a good moment to also introduce a real build tool (Maven/Gradle) rather than hand-rolling `javac` invocations.

## Structure

- `JavaPupUtils/src/App.java` — entry point, currently a no-op `Hello, World!`.
- `JavaPupUtils/src/utils/DateUtils.java` — the actual library code: three static methods for date-format validation/parsing and leap-year checks. See `README.md` for the API.
- `JavaPupUtils/README.md` — leftover default VS Code Java extension boilerplate, not project-specific; safe to ignore or replace.

This is a single small utility class, not a multi-module or layered project — there isn't more architecture to document than what's in `CLAUDE.md`.

## Note on repo contents

The repo root and `repo-package/` also contain several large split `.zip` archives (`mh-repo.zip.*`, `m2-repo.zip.*`, `wbs-scaff-repo.zip.*`, several hundred MB total) unrelated to the Java source. They weren't touched or inspected as part of this doc update — worth reviewing separately since this repo is public.
