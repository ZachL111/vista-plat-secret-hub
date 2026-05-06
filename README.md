# vista-plat-secret-hub

`vista-plat-secret-hub` is a Java project in platform engineering. Its focus is to package a Java local lab for secret analysis with fixture event logs, golden state snapshots, and documented operating limits.

## Why This Exists

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Vista Plat Secret Hub Review Notes

The first comparison I would make is `rollout width` against `route drift` because it shows where the rule is most opinionated.

## Capabilities

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/vista-plat-secret-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `rollout width` and `route drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Shape

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Java addition stays small enough to inspect in one sitting.

## Local Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Verification

The same command runs the local verification path. The highest-scoring domain case is `stale` at 217, which lands in `ship`. The most cautious case is `edge` at 104, which lands in `hold`.

## Roadmap

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
