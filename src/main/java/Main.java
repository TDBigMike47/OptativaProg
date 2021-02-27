public class Main {
    public static void main(String[] args){
        System.out.println("Main Proccess");

        Bycicle myBike = new Bycicle(1,2,3);
        System.out.println(("Current Speed " + myBike.speed));
        myBike.speedUp(5);
        System.out.println(("Current Speed " + myBike.speed));
        myBike.applyBreak(2);
        System.out.println(("Current Speed " + myBike.speed));
        myBike.setGear(5);
    }
}
