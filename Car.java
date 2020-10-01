class Car extends Vehicle {

    public Car(String name, double speedMax, double tankValeu, double tnakContent, double fuelConsuption) {

        super(name, speedMax);
        this.tankValeu = tankValeu;
        this.tankContent = tnakContent;
        this.fuelConsuption = fuelConsuption;

    }

    public double tankValeu;
    public double tankContent;
    public double fuelConsuption;

    public double run(double timeGlobal) {

        double deltaDistance = super.run(timeGlobal);
        double deltaFuel = deltaDistance * fuelConsuption / 100;

        tankContent -= deltaFuel; 

        if (tankContent < 0) 
        {
            deltaFuel = 0 - tankContent;
            tankContent = 0;
            distance += fuelConsuption / 100 / deltaFuel;
            speedMax = 0;
            return distance;
        }
        else if (tankContent == 0) return distance;
        else {distance += deltaDistance;return deltaDistance;}
    
    }


    @Override
    public String toString() {

        return super.toString() + "\t tank: " + tankValeu + "\t fuelConsuption: " + fuelConsuption + "\t tnakContent: " + String.format("%.3f", tankContent);

    }
}