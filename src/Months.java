public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int NO_OF_DAYS;

    Months(int NO_OF_DAYS){
        this.NO_OF_DAYS = NO_OF_DAYS;
    }

    public int getNO_OF_DAYS() {
        return NO_OF_DAYS;
    }
}
