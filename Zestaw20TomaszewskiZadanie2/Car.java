package Zestaw20TomaszewskiZadanie2;

public class Car {
    double fuelLevel;
    public Car(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }
    static void drive(Car car, double dystans){
        if(dystans<=car.fuelLevel*10)
            System.out.println("Paliwa jest wystaczajaco. \n" +
                    "Uruchomic silnik! ");
        else
            System.out.println("Nie wystarcza paliwa!");
    }
}
