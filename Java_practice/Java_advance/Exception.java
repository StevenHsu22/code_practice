package Java_advance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception {
    public static void main(String[] args) {
        try {
            testException();
        } catch (ParseException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }

    public static void testException() throws ParseException {
        String dateString = "invalid-date";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sdf.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Caught a ParseException: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }

    public void printStackTrace() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'printStackTrace'");
    }

    void printStackTrace() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}
