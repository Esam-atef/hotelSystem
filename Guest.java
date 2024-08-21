public class Guest
{
    private int guest_ID;
    private String address;
    private String name;
    private String PhoneNumber;

    public Guest(int guest_ID, String address, String name, String phoneNumber)
    {
        this.guest_ID = guest_ID;
        this.address = address;
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public int getGuest_ID() {
        return guest_ID;
    }

    public void setGuest_ID(int guest_ID) {
        this.guest_ID = guest_ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
