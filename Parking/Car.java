package Parking;

public class Car {
    int id;
    int parkingId;

    public int getId() {
        return id;
    }

    public int getParkingId() {
        return parkingId;
    }

    public Car(int parkingId) {
        this.parkingId = parkingId;
    }

    public Car(int id, int parkingId) {
        this.id = id;
        this.parkingId = parkingId;
    }
}
