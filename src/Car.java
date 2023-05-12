public class Car extends Vehicle implements ISpace{

    private int seat;
    private int currentCapacity;
    private  boolean isMoving;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    @Override
    public int getLSpaceLeft() {
        return 0;
    }

    @Override
    public boolean isAllowedToBeOpened() {
        return !isMoving;
    }

    @Override
    public boolean canFit(int person) {
        return seat >= person;
    }
}
