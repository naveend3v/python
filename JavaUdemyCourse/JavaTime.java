package code.JavaUdemyCourse;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

public class JavaTime {
    public static void main(String[] args){
//        Date d = new Date();
//        System.out.println(d);
/*
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.withMonth(3));
        System.out.println(ldt.plusMonths(3));
*/
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zdt);

/*
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        Period p = Period.of(2,3,4);
        System.out.println(p.addTo(zdt));

        Duration d = Duration.ofHours(4);
        System.out.println(d.addTo(zdt));

        Instant i = Instant.now();
        System.out.println(i);
*/

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zdt.get(ChronoField.DAY_OF_YEAR));
    }
}
