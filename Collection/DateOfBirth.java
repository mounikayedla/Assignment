import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DateOfBirth {

	public static void main(String[] args) {
LocalDate cal=LocalDate.of(2020, 07, 23);
LocalDate cal1=LocalDate.of(1999, 10, 23);
List<LocalDate>CL=new LinkedList<>();
CL.add(cal);
CL.add(cal1);

for (LocalDate c : CL) {
    String formattedDate = c.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    if (c.isLeapYear()) {
        System.out.println(formattedDate + " is a leap year");

    } else {
        System.out.println(formattedDate + " is not a leap year");
    }
}
}
}


