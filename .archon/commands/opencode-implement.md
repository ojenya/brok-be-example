---
description: Implement a Paperclip task using OpenCode only
argument-hint: <paperclip-task-description>
---

# OpenCode Implement

Input task:

```text
$ARGUMENTS
```

## Constraints

- Use OpenCode as the coding agent.
- Do not use Claude Code, Claude SDK, or the `claude` CLI.
- Keep the change focused on the task.
- Prefer existing repository patterns.
- Do not commit, push, or create a PR in this step.
- Do not print secrets.

## Context

If `$ARTIFACTS_DIR/plan.md` exists, read it before editing.

## Your Task

Implement the requested change in the repository. Read `$ARTIFACTS_DIR/plan.md` only if it exists. Keep the change minimal. After editing, write a short implementation summary to:

```text
$ARTIFACTS_DIR/implementation.md
```

The summary must include:

- Files changed.
- Main behavior changed.
- Any verification commands that still need to be run.
