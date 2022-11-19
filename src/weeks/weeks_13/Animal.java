package weeks.weeks_13;

public class Animal {
    //Datafields
    protected double weight;
    private double height;
    protected boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    public Animal(){
        this.hasFlyingSkills=false;
        this.hasSwimmingSkills=false;
        this.weight=0;
        this.height=0;
    }
    public void runs(){
        System.out.println("Animal is running");
    }
    public void eats(){
        System.out.println("Animal is eating");
    }
    public void sleeps(){
        System.out.println("Animal is sleeping");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
}
