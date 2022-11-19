package weeks.weeks_13;

public class Car {


    protected String engineType;
    protected double weight;
    protected int horsePower;
    protected int numberOfDoors;
    protected String bodyStyle;
    protected String status;


    protected boolean engineON;



    protected double fuel;

     Car(){
     this("diesel",2000,248,3,"coupe","Brand-new",0,false);
    }

     Car(String engineType, double weight, int horsePower, int numberOfDoors, String bodyStyle, String status,double fuel,boolean engineON) {
        this.engineType = engineType;
        this.weight = weight;
        this.horsePower = horsePower;
        this.numberOfDoors = numberOfDoors;
        this.bodyStyle = bodyStyle;
        this.status = status;
        this.fuel=fuel;
        this.engineON=engineON;
    }
    public boolean isFuelFull(){
         return fuel==100;
    }
    public void switchOn(){
         engineON=true;
    }
    public void switchOff(){
         engineON=false;
    }
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public boolean isEngineON() {
        return engineON;
    }

    public void setEngineON(boolean engineON) {
        this.engineON = engineON;
    }


}
