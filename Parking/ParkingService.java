package Parking;

import java.util.Comparator;
import java.util.List;

public class ParkingService {
    private Parking parking;

    public ParkingService(Parking parking) {
        this.parking = parking;
    }

    public Parking getParking() {
        return parking;
    }

    public long freePlaceCalculator(List<Car> cars) {
        long occupiedParking = cars.stream()
                .filter(car -> car.parkingId == parking.getId())
                .limit(parking.getCapacity())
                .count();
        return parking.getCapacity() - occupiedParking;
    }

    public double bestParkingPercentage(List<Car> cars) {
        return ((double) freePlaceCalculator(cars) / parking.getCapacity()) * 100;
    }


}

