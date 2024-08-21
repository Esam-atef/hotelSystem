import java.util.Date;
public class Booking
{
    private int BookingId;
    private int GuestId;
    private String status;
    private int roomNumber;
    private Date checkin;
    private Date checkOut;

    public Booking(int bookingId, int guestId, String status, int roomNumber, Date checkin, Date checkOut)
    {
        BookingId = bookingId;
        GuestId = guestId;
        this.status = status;
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkOut = checkOut;
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public int getGuestId() {
        return GuestId;
    }

    public void setGuestId(int guestId) {
        GuestId = guestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
}
