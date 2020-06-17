import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class initlocaldate {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 1, 8);
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 8);
        LocalDate date3 = LocalDate.ofEpochDay(18269);
        LocalDate date4 = LocalDate.ofYearDay(2020, 8);

        LocalDate date5 = LocalDate.parse("2020-01-08");
        LocalDate date6 = LocalDate.parse("8-Jan-2020", DateTimeFormatter.ofPattern("d-MMM-yyyy"));

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
        System.out.println(date6);
    }

}