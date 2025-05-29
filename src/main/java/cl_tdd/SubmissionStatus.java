package cl_tdd;

public class SubmissionStatus{
    private String status;

    private static final String[] VALID_STATUSES = {
//        "Not Submitted", "Working on It",  "Ready for Feedbac"
    };

    public void setStatus(String status) {
        for (String s : VALID_STATUSES) {
            if (s.equals(status)) {
                this.status = status;
                return;
            }
        }
//        throw new IllegalArgumentException("Invalid status: " + status);
    }

    public String getStatus() {
        return this.status;
    }
}
