package io.gatling.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Randomizer
 * Utility class implements a method to get a random value.
 */

public class Randomizer {

    // Get and return the random integer within min and max values

    public int getRandomValue(int min, int max) {

        return ThreadLocalRandom
                .current()
                .nextInt(min, max + 1);
    }
}
