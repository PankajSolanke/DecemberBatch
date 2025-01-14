package moReal;

public class Hotel {
    void bookRoom (String roomType) {
        System.out.println("Room of type " + roomType + " has been booked");
    }
    void bookRoom (String roomType , int days) {
        System.out.println("Room of type " + roomType + " has been booked for " + days + " days");
    }
}
