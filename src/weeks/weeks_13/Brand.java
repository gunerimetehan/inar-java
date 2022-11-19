package weeks.weeks_13;

public class Brand extends Car {
    private double price;
    private String color;
    private String driveType;
    private String transmission;
    private String make; //brand

    Brand(){
    this("diesel",1111,234,4,"coupe","bramd-new",100,false,
            200000,"blue","4*4","auto","ford");
    }


    public Brand(String engineType, double weight, int horsePower, int numberOfDoors, String bodyStyle, String status,
                 double fuel, boolean engineON, double price, String color, String driveType, String transmission, String make) {
        super(engineType, weight, horsePower, numberOfDoors, bodyStyle, status, fuel, engineON);
        this.price = price;
        this.color = color;
        this.driveType = driveType;
        this.transmission = transmission;
        this.make = make;
    }



}
