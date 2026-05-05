package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(62, 102, 10, 8, 11);
        if (Policy.score(signalcase_1) != 212) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(60, 97, 26, 10, 4);
        if (Policy.score(signalcase_2) != 87) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(91, 81, 13, 23, 9);
        if (Policy.score(signalcase_3) != 150) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("review")) throw new AssertionError("decision mismatch");
    }
}
