public class Car {
    private String make;
    private String licencePlateNumber;
    private String color;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public void setLicencePlateNumber(String licencePlateNumber) {
        this.licencePlateNumber = licencePlateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this("N/A", "000-000", "no color");
    }

    public Car(String make, String licencePlateNumber, String color) {
        this.make = make;
        this.licencePlateNumber = licencePlateNumber;
        this.color = color;
    }


}
