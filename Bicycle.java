class Bicycle extends Vehicle {
    
    public Bicycle(String name, double speedMax) {

        super(name, speedMax);

    }
    int i=1;
    public double run(double timeGlobal){
        
        double deltaTime = timeGlobal - timeCurrent;
        double deltaDistance = deltaTime / 60.0 * speedMax;
        
        this.distance += deltaDistance;
        this.timeCurrent = timeGlobal;
        
        if (speedMax >= 12 && distance < 20) {return speedMax;}
        else if (speedMax >= 12 && distance/20 < i) {return speedMax;}
        else if (distance/20 >= i && speedMax > 12){i++;return speedMax *= 0.80;}
        else return speedMax = 0;
    }


    @Override
    public String toString() {

        return super.toString();

    }
}