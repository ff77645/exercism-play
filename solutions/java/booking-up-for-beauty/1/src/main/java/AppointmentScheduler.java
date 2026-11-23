import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyy,");
        DateTimeFormatter printer2 = DateTimeFormatter.ofPattern("K:mm a.");
        return "You have an appointment on " + printer.format(appointmentDate) + " at " + printer2.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate date = LocalDate.now();
        return LocalDate.of(date.getYear(),9,15);
    }
}
