import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTimeAPIDemo {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();

        System.out.println(todayDate);

        LocalDate birthDate = LocalDate.of(1990, 10, 10);

        System.out.println(birthDate);

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);

        LocalDateTime today = LocalDateTime.now();

        System.out.println(today);

        //formatting the date

        DateTimeFormatter myFormat = DateTimeFormatter
                            .ofPattern("dd/MMMM/YYYY, EEEE h a");
        String formattedDate = today.format(myFormat);

        System.out.println(formattedDate);

        //find the difference between the dates

        long difference = ChronoUnit.YEARS.between(birthDate, todayDate);
        System.out.println("Difference = " + difference);
    }
}
