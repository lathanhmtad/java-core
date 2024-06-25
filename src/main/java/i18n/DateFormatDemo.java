package i18n;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        Locale vi = Locale.of("vi");
        Locale ja = Locale.of("ja");
        Locale en = new Locale("en");

        String s1 = formatDateByLocale(today, vi);
        String s2 = formatDateByLocale(today, ja);
        String s3 = formatDateByLocale(today, en);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        // String s4 = formatByPattern(today, "YYYY-MM-dd");
        String s4 = formatByPattern(today, "EEEE, YYYY-MM-dd");
        System.out.println("s4 = " + s4);


        // System.out.println(LocalDate.of(2024, 6, 25).compareTo(today));
        // System.out.println(today.getLong(ChronoField.DAY_OF_YEAR) - LocalDate.of(2024, 5, 1).getLong(ChronoField.DAY_OF_YEAR));
        // System.out.println(LocalDate.of(2024, 5, 1).plusDays(55));

}

    public static String formatDateByLocale(LocalDate date, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
                .withLocale(locale);
        return formatter.format(date);
    }

    public static String formatByPattern(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }
}
