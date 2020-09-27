class Traffic {
    
    public static void main(String[] args) {

        Vehicle subaru = new Vehicle("Subaru", 1);
        
        Car volvo = new Car("Volvo", 2, 55);
        
        for (double globalTime = 0.0; globalTime < 2000.0; globalTime += 1.0) {

            subaru.run(globalTime);
            volvo.run(globalTime);

            System.out.println(subaru.toString());
            System.out.println(volvo.toString());

        }
    }
}