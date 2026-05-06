# Vista Plat Secret Hub Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 116 | watch |
| stress | quota pressure | 216 | ship |
| edge | route drift | 104 | hold |
| recovery | secret scope | 118 | watch |
| stale | rollout width | 217 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `edge` becomes less cautious without a clear reason, I would inspect the drag input first.
