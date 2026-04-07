import java.util.*;

/**
 * ============================================
 * SINGLE FILE PROGRAM
 * Booking History & Reporting
 * ============================================
 */

// -------- Reservation Class --------
class Reservation {
    private String guestName;
    private String roomType;

    // Constructor
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

// -------- BookingHistory Class --------
class BookingHistory {
    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}

// -------- BookingReportService Class --------
class BookingReportService {

    public void generateReport(BookingHistory history) {
        System.out.println("\nBooking History Report\n");

        for (Reservation r : history.getConfirmedReservations()) {
            System.out.println("Guest: " + r.getGuestName()
                    + ", Room Type: " + r.getRoomType());
        }
    }
}

// -------- Main Class --------
public class BookMyStayApp {

    public static void main(String[] args) {

        // Create history
        BookingHistory history = new BookingHistory();

        // Add data
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        // Generate report
        BookingReportService report = new BookingReportService();
        report.generateReport(history);
    }
}