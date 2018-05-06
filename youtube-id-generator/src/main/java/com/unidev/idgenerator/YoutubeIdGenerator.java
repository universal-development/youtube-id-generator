package com.unidev.idgenerator;

import java.util.Random;

/**
 * Generation of Youtube like id from provided input string, same string - same generated id.
 */
public class YoutubeIdGenerator {

    private static final String YOUTUBE_LIKE_ID_DIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-";

    private static final int MIN_LENGTH = 11;
    private static final int MAX_LENGTH = 15;

    public String generate(String input) {
        return genHash(input, MIN_LENGTH, MAX_LENGTH, YOUTUBE_LIKE_ID_DIC);
    }

    /**
     * Generate string unique hash based on provided dictionary
     */
    private String genHash(String str, int minLength, int maxLength, String dictionary) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random(str.hashCode());
        int length = minLength + random.nextInt(maxLength - minLength);
        for (int i = 0; i < length; i++) {

            int id = random.nextInt(dictionary.length());
            stringBuilder.append(dictionary.charAt(id));


        }
        return stringBuilder.toString();
    }

}
