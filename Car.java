class Car extends Vehicle {

    public Car(String name, double speedMax, double tankValeu, double tnakContent, double fuelConsuption) {

        super(name, speedMax);
        this.tankValeu = tankValeu;
        this.tnakContent = tnakContent;
        this.fuelConsuption = fuelConsuption;

    }

    public double tankValeu;
    public double tnakContent;
    public double fuelConsuption;

    public double run(double timeGlobal) {
        
        double deltaDistance = super.run(timeGlobal);
        double deltaFuel = deltaDistance * fuelConsuption / 100;

        tnakContent -= deltaFuel;

        return deltaDistance;
    
    }


    @Override
    public String toString() {

        return super.toString() + "\t tank: " + tankValeu + "\t fuelConsuption: " + fuelConsuption + "\t tnakContent: " + String.format("%.3f", tnakContent);

    }
}