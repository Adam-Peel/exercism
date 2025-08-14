import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/uuuu HH:mm:ss");
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, formatter);
        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        if (hour >= 12 && hour <18) {
            return true;
        } else {
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String start = "You have an appointment on ";
        DayOfWeek dayWeek = appointmentDate.getDayOfWeek();
        String day = dayWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int dayOfMonth = appointmentDate.getDayOfMonth();
        Month month = appointmentDate.getMonth();
        String displayMonth = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year = appointmentDate.getYear();
        int hour = appointmentDate.getHour();
        int minute = appointmentDate.getMinute();
        String minutePad = "";
        String timeZone;

        if (hour >= 12 ) {
            timeZone = "PM";
            hour -= 12;
        } else {
            timeZone = "AM";
        }

        if (minute < 10) {
            minutePad = "0";
        }
        
       return start + day + ", " + displayMonth + " " + dayOfMonth + ", "  + year + ", at " + hour + ":" + minutePad + minute + " " + timeZone + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime today = LocalDateTime.now();
        int year = today.getYear();
        return LocalDate.of(year, 9, 15);
    }
}
