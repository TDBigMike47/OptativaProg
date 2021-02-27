public class Bycicle {
    public int cadence;
    public int gear;
    public int speed;

    public Bycicle(int cadence, int gear, int speed){
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;

    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
        //speed = speed - decrement
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
