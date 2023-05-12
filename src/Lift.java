public class Lift implements ISpace {
    private int maximumCapacity;
    private int currentCapacity;
    private boolean isGoingUp;
    private boolean isGoingDown;

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public boolean isGoingUp() {
        return isGoingUp;
    }

    public void setGoingUp(boolean goingUp) {
        isGoingUp = goingUp;
    }

    public boolean isGoingDown() {
        return isGoingDown;
    }

    public void setGoingDown(boolean goingDown) {
        isGoingDown = goingDown;
    }

    @Override
    public int getLSpaceLeft() {
        return maximumCapacity - currentCapacity;
    }

    @Override
    public boolean isAllowedToBeOpened() {
        if (isGoingUp || isGoingDown){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean canFit(int person) {
        return maximumCapacity >= person;
    }
}
