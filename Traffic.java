class Traffic {
    
    public static void main(String[] args) {
        
        Car volvo = new Car("Volvo", 150, /*почему при изменении этого числа ничего не меняется*/55, 35, 13);

        Bicycle gt = new Bicycle("gt", 100);
        
        for (double globalTime = 0.0; globalTime < 2000.0; globalTime += 1.0) {

            volvo.run(globalTime);
            gt.run(globalTime);

            System.out.println(volvo.toString());
            System.out.println(gt.toString());

        }
    }
}