import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    public void null_word_returns_validation() {
        // Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // Act
        System.err.println("Please enter a valid value");

        // Assert
        assertEquals("Please enter a valid value", out.toString());

    }
}