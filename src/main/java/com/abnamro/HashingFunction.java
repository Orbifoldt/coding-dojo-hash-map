package com.abnamro;

public class HashingFunction {
    public static final int MODULUS = 16;

    public static int hash(String input) {
        final var hash = input.chars()
                .reduce(0, (currentHash, character) -> (currentHash * 17 + character) % MODULUS);
        if(hash < 0) {
            return hash + MODULUS;
        }
        return hash;
    }
}
