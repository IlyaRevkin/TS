class Vehicle {

    public int id;
    public String name;
    private static int max_id = 1;

    public double speedMax;
    public double distance;
    public double timeGlobal;
    public double timeCurrent;

    public Vehicle(String name, double speedMax) {

        this.name = name;
        this.id = max_id++;
        this.speedMax = speedMax;

    }

    public double run(double timeGlobal) {


        this.timeGlobal = timeGlobal;
        double deltaTime = timeGlobal - timeCurrent;
        double deltaDistance = deltaTime / 60.0 * speedMax;
        
        this.distance += deltaDistance;
        this.timeCurrent = timeGlobal;

        return deltaDistance;
    
    }

    @Override
    public String toString() {

        return "id: " + id + "\t name: " + name + "\t speed: " + speedMax + "\t distance: " + String.format("%.3f", distance);

    }

}