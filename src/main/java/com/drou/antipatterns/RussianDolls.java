package com.drou.antipatterns;

public class RussianDolls {

    public String compute(String input) {
        return new SlowService().call("Slow main-" + input);
    }

    static class GrandMaDoll extends RussianDolls {
        @Override
        public String compute(String input) {
            return super.compute("GrandMa-" + input);
        }
    }

    // Another level
    static class MommyDoll extends GrandMaDoll {
        @Override
        public String compute(String input) {
            return super.compute("Mommy-" + input);
        }
    }

    // Final leaf class
    public static class BabyDoll extends MommyDoll {
        @Override
        public String compute(String input) {
            return super.compute("Baby-" + input);
        }
    }
}
