---
description: Fast smoke change using OpenCode only
argument-hint: <paperclip-task-description>
---

# OpenCode Smoke

Task:

```text
$ARGUMENTS
```

## Constraints

- Use OpenCode only. Do not use Claude Code.
- Keep the change minimal.
- Edit at most one file, preferably `README.md`.
- Do not commit, push, or create a PR.
- Finish in one short pass. Avoid long repository exploration.

## Your Task

Implement the task directly in the repository. If `README.md` exists, append one short sentence to it. If it does not exist, create `README.md` with one short sentence.

Write a brief summary to:

```text
$ARTIFACTS_DIR/implementation.md
```
