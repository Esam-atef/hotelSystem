import java.text.SimpleDateFormat;
import java.util.Date;
public class Main
{
    public static void main(String[] args)
    {
        HotelManagementSystem hotelSystem = new HotelManagementSystem();

        hotelSystem.addRoom(new Room(101, "Single", 100.0, "Available"));
        hotelSystem.addRoom(new Room(102, "Double", 150.0, "Available"));
        hotelSystem.addRoom(new Room(103, "Suite", 250.0, "Available"));

        System.out.println("Available Rooms:");
        for (Room room : hotelSystem.rooms) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getType() + ", Price: " + room.getPrice() + ", Status: " + room.getStatus());
        }

        hotelSystem.addGuest(new Guest(1, "John Doe", "123 Elm St", "555-1234"));
        hotelSystem.addGuest(new Guest(2, "Jane Smith", "456 Oak St", "555-5678"));

        System.out.println("\nGuests:");
        for (Guest guest : hotelSystem.guests) {
            System.out.println("Guest ID: " + guest.getGuest_ID() + ", Name: " + guest.getName() + ", Address: " + guest.getAddress() + ", Phone: " + guest.getPhoneNumber());
        }

        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date checkInDate = sdf.parse("2024-08-01");
            Date checkOutDate = sdf.parse("2024-08-05");
            hotelSystem.addBooking(new Booking(1, 1, "Confirmed", 101, checkInDate, checkOutDate));

            checkInDate = sdf.parse("2024-08-02");
            checkOutDate = sdf.parse("2024-08-06");
            hotelSystem.addBooking(new Booking(2, 2, "Pending", 102, checkInDate, checkOutDate));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("\nBookings:");
        for (Booking booking : hotelSystem.bookings) {
            System.out.println("Booking ID: " + booking.getBookingId() + ", Guest ID: " + booking.getGuestId() + ", Room Number: " + booking.getRoomNumber() + ", Check-in: " + booking.getCheckin() + ", Check-out: " + booking.getCheckOut() + ", Status: " + booking.getStatus());
        }

        boolean roomDeleted = hotelSystem.deleteRoom(103);
        System.out.println("\nRoom 103 deleted: " + roomDeleted);

        boolean guestDeleted = hotelSystem.deleteGuest(2);
        System.out.println("Guest 2 deleted: " + guestDeleted);

        boolean bookingDeleted = hotelSystem.deleteBooking(1);
        System.out.println("Booking 1 deleted: " + bookingDeleted);

        System.out.println("\nRooms after deletion:");
        for (Room room : hotelSystem.rooms) {
            System.out.println("Room Number: " + room.getRoomNumber() + ", Type: " + room.getType() + ", Price: " + room.getPrice() + ", Status: " + room.getStatus());
        }

        System.out.println("\nGuests after deletion:");
        for (Guest guest : hotelSystem.guests) {
            System.out.println("Guest ID: " + guest.getGuest_ID() + ", Name: " + guest.getName() + ", Address: " + guest.getAddress() + ", Phone: " + guest.getPhoneNumber());
        }

        System.out.println("\nBookings after deletion:");
        for (Booking booking : hotelSystem.bookings) {
            System.out.println("Booking ID: " + booking.getBookingId() + ",");
        }
    }
}