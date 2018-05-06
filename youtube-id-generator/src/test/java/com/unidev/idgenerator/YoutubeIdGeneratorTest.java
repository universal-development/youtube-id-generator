package com.unidev.idgenerator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class YoutubeIdGeneratorTest {

    private YoutubeIdGenerator youtubeIdGenerator;

    @BeforeEach
    public void init() {
        youtubeIdGenerator = new YoutubeIdGenerator();
    }

    @Test
    public void testIdGeneration() {
        String hash1 = youtubeIdGenerator.generate("potato");
        String hash2 = youtubeIdGenerator.generate("potato");

        assertThat(hash1).isEqualTo(hash2);
    }

}
