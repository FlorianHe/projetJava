class Hangar {
    public static void main(String[] args) {
        Vehicle car = new Car("Clio", 50000);
        Vehicle boat = new Boat("Titanic", 2000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}