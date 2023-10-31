package LSL_EX_14.LSL_EX_14_2;

public class DangerException extends Exception {
    String message;
    public DangerException() {
        message = "危险品!";
    }
    public void toShow() {
        System.out.println(message);
    }
}
