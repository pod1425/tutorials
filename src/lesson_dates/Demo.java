package lesson_dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Demo {
    private static String formatDuration(Duration duration) {
        long hours = duration.toHours() % 31;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        long days = duration.toDays();

        return String.format("%01d days, %02d:%02d:%02d", days, hours, minutes, seconds);
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss, dd/MM/yy");
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime endTime = LocalDateTime.of(date.getYear(), date.getMonth().plus(1), 10, 18, 0, 0);

        Duration d = Duration.between(date, endTime);

        System.out.println(formatDuration(d));

    }
}
