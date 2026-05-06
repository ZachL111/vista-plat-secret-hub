# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 116, lane `watch`
- `stress`: `quota pressure`, score 216, lane `ship`
- `edge`: `route drift`, score 104, lane `hold`
- `recovery`: `secret scope`, score 118, lane `watch`
- `stale`: `rollout width`, score 217, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
