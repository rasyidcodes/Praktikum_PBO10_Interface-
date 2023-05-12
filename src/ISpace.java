public interface ISpace {

    public int getLSpaceLeft();
    public boolean isAllowedToBeOpened();

    public boolean canFit(int person);
}
