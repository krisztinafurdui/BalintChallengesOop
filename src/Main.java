import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        questionnaire();

    }

    public static void questionnaire() {
        Scanner myObj = new Scanner(System.in);
        Car myCar = new Car();
        System.out.println("írd be az autó márkáját: ");
        String carMake = myObj.nextLine();
        myCar.setMake(carMake);
        System.out.println("írd be az autó rendszámát: ");
        String carLicencePlate = myObj.nextLine();
        myCar.setLicencePlateNumber(carLicencePlate);
        System.out.println("írd be az autó színét: ");
        String carColor = myObj.nextLine();
        myCar.setColor(carColor);
        System.out.println("Az autó egy " + myCar.getMake() + ", rendszáma: " + myCar.getLicencePlateNumber() + ", és színe " + myCar.getColor());

    }
}