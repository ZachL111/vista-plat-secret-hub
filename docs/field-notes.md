# Field Notes

I would read this project from the data inward: cases first, implementation second.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stale` is the strongest case at 217 on `rollout width`. `edge` is the cautious anchor at 104 on `route drift`.

The local verifier covers this data so the notes stay tied to code.
