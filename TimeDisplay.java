import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDisplay {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Format the time in HH:mm:ss format
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(timeFormatter);

        // Display the formatted time
        System.out.println("Current time: " + formattedTime);
    }
}