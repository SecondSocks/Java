package learning;

public class LearnExtendes {
    
    public static void main(String[] args) {
        
        Mercedes car = new Mercedes(202, 1225.5, 1.8, "Mercedes Benz");
        System.out.printf("All Info About Car: %d\n%.2f\n%.2f\n%s\n", car.getPower(),
                                                                           car.getWeight(), 
                                                                           car.getVolume(), 
                                                                           car.getModel());

        car.setPower(600);
        System.out.printf("I get new engine. Now I have %d power", car.getPower());
    }
}

class Car {

    private int power;
    private double weight;
    private double volume;
    private String model;

    public int getPower() { return power; }
    public double getWeight() { return weight; }
    public double getVolume() { return volume; }
    public String getModel() { return model; }

    public void setPower(int power) { this.power = power; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setVolume(double volume) { this.volume = volume; }
    public void setModel(String model) { this.model = model; }

    public Car(int power, double weight, double volume, String model) {
        this.power = power;
        this.weight = weight;
        this.volume = volume;
        this.model = model;
    }

}

class Mercedes extends Car {

    public Mercedes(int power, double weight, double volume, String model) {
        super(power, weight, volume, model);
    }
}