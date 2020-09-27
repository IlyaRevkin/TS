class Car extends Vehicle {

    public Car(String name, double speedMax, double tankValeu) {

        super(name, speedMax);
        this.tankValeu = tankValeu;

    }

    public double tankValeu;

    @Override
    public String toString() {

        return super.toString() + "\t tank: " + tankValeu;

    }
}