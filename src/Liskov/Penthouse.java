package Liskov;

public class Penthouse extends Apartment implements BedroomAddable {
    public Penthouse() {
        this.setNumberOfBedrooms(4);
    }

    @Override
    public void setSquareFootage(int sqft) {
        this.setSquareFootage(this.getSquareFootage());
    }
}
