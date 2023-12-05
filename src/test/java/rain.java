import SilvanBonus.Raintrap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class rain {


    @Test
    void trapTest_when0100101_thenReturn3() {
        // Given
        int[] height = {0, 1, 0, 0, 1, 0, 1};
        int rain = 0;
        // When
        int actual = Raintrap.trapper(height, rain);

        // Then
        assertEquals(3, actual);
    }

    @Test
    void trapTest_when010210132121_thenReturn6() {
        // Given
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int rain = 0;

        // When
        int actual = Raintrap.trapper(height, rain);

        // Then
        assertEquals(6, actual);
    }

    @Test
    void trapTest_when010_thenReturn0() {
        // Given
        int[] height = {0, 1, 0};
        int rain = 0;

        // When
        int actual = Raintrap.trapper(height, rain);

        // Then
        assertEquals(0, actual);
    }
}

