/*
    Jeff Chadrick
    February 17, 2023
    CSCI2467
    The Water Tank
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t::The Magnificent Water Tank::");

        WaterTank tank = new WaterTank(350, 300);
        tank.print();

        tank.add(100);

        tank.drain(180);
        tank.print();

        tank.add(60);

        tank.drain(200);
        tank.print();

        tank.drain(50);

        tank.add(375);

        tank.drain(142);
        tank.print();
    }

}