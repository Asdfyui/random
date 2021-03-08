public class Car {
    private String name;
    private String colour;
    private int maxSpeed;
    private int currentSpeed;
    static int modelNumber = 1;
    private int idNum;
    Car(){
         name = " ";
         colour = "black";
         maxSpeed = 100;
         currentSpeed = 0;
         idNum = modelNumber;
         modelNumber++;

    }
    Car(String name, String colour, int maxSpeed){
        this.name = name;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.idNum = modelNumber;
        modelNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public void speedUp(){
        currentSpeed++;
        if(currentSpeed > maxSpeed){
            currentSpeed = maxSpeed;
        }
    }
    public void slowDown(){
        currentSpeed--;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
    }
}
