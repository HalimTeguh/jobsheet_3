public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        System.out.println();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikamMesin();
        motor.printStatus();
    }
}
