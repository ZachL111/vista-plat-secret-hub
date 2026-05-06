package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(56, 37, 31, 60);
        if (DomainReview.score(item) != 116) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("watch")) throw new AssertionError("domain lane mismatch");
    }
}
