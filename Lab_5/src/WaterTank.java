public class WaterTank {
    private int currentCapacity;
    private int maxCapacity;

    public WaterTank(int currentCapacity, int maxCapacity) {
        this.currentCapacity = currentCapacity;
        this.maxCapacity = maxCapacity;

        if (currentCapacity > maxCapacity) {
            this.currentCapacity = maxCapacity;
        }
    }

    public int getCurrentCapacity() {
        return (currentCapacity);
    }

    public int getMaxCapacity() {
        return (maxCapacity);
    }

    void add(int volume) {
        this.currentCapacity = currentCapacity + volume;
        if (currentCapacity > maxCapacity) {
            this.currentCapacity = maxCapacity;
        }
    }

    void drain(int volume) {
        this.currentCapacity = currentCapacity - volume;
        if(currentCapacity < 0) {
            this.currentCapacity = 0;
        }
    }

    void print() {
        System.out.println("Current volume is: " + currentCapacity + " gallons.");
    }
}