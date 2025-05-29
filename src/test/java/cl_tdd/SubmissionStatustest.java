package cl_tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SubmissionStatustest {

    @Test
    public void testStatus_NotSubmitted() {
        SubmissionStatus service = new SubmissionStatus();
        service.setStatus("Not Submitted");
        assertEquals("Not Submitted", service.getStatus());
    }

    @Test
    public void testStatus_WorkingOnIt() {
        SubmissionStatus service = new SubmissionStatus();
        service.setStatus("Working on It");
        assertEquals("Working on It", service.getStatus());
    }

    @Test
    public void testStatus_NeedHelp() {
        SubmissionStatus service = new SubmissionStatus();
        service.setStatus("Need Help");
        assertEquals("Need Help", service.getStatus());
    }

    @Test
    public void testStatus_ReadyForFeedback() {
        SubmissionStatus service = new SubmissionStatus();
        service.setStatus("Ready for Feedback");
        assertEquals("Ready for Feedback", service.getStatus());
    }

    @Test
    public void testInvalidStatus() {
        SubmissionStatus service = new SubmissionStatus();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.setStatus("Done");
        });
        assertTrue(exception.getMessage().contains("Invalid status"));
    }
}
