---
description: Investigate and fix a bug from a Paperclip task using OpenCode only
argument-hint: <paperclip-bug-description>
---

# OpenCode Bugfix

Bug report:

```text
$ARGUMENTS
```

## Constraints

- Use OpenCode as the only coding agent.
- Do not use Claude Code, Claude SDK, or the `claude` CLI.
- Reproduce or reason about the bug before changing code.
- Keep the fix minimal and aligned with existing patterns.
- Do not commit, push, or create a PR in this step.
- Do not print secrets.

## Your Task

Investigate the root cause, implement the smallest safe fix, and write an investigation summary to:

```text
$ARTIFACTS_DIR/investigation.md
```

The summary must include:

- Root cause.
- Files changed.
- Why the fix addresses the bug.
- Verification commands that should pass.
