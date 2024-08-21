import java.util.ArrayList;
import java.util.List;
class HotelManagementSystem
{
    public List<Room> rooms;
    public List<Guest> guests;
    public List<Booking> bookings;

    public HotelManagementSystem() {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public boolean deleteRoom(int roomNumber) {
        return rooms.removeIf(room -> room.getRoomNumber() == roomNumber);
    }

    public Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }


    public void addGuest(Guest guest)
    {
        guests.add(guest);
    }

    public boolean deleteGuest(int guestId)
    {
        return guests.removeIf(guest -> guest.getGuest_ID() == guestId);
    }

    public Guest findGuest(int guestId)
    {
        for (Guest guest : guests) {
            if (guest.getGuest_ID() == guestId)
            {
                return guest;
            }
        }
        return null;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public boolean deleteBooking(int bookingId) {
        return bookings.removeIf(booking -> booking.getBookingId() == bookingId);
    }

    public Booking findBooking(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }
}
