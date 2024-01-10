package edu.estu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

    @Test
    public void testInfiniteLoop() {
        // For demonstration purposes, let's assume the bug occurs when the input is positive infinity.
        double input = Double.POSITIVE_INFINITY;

        try {
            // Call the infiniteLoop method with the problematic input
            App.infiniteLoop(input);

            // If the method did not throw an IllegalStateException, fail the test
            fail("The infiniteLoop method did not throw the expected IllegalStateException.");
        } catch (IllegalStateException expected) {
            // The method is expected to throw an IllegalStateException, and the test passes.
            
            // We can add more specific checks on the exception message or other details if needed.
            assertNotNull(expected.getMessage());
            assertTrue(expected.getMessage().contains("infinite loop"));

            // Additional assertions if there are specific properties or conditions you want to check
            // For example, if the exception has a custom error code:
            assertEquals("ERROR_CODE_123", ((CustomException) expected).getErrorCode());
        } catch (Exception unexpected) {
            // If any other type of exception is thrown, fail the test with an explanation
            fail("Unexpected exception: " + unexpected.getClass().getSimpleName());
        }
    }
}
