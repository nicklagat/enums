package enums.general_examples;

public enum Cereals {

    CAPTAIN_CRUNCH(60),
    FROOT_LOOPS(79),
    REESES_PUFFS(40),
    COCOA_PUFFS(88);


    // using final so that the values can't be changed accidentally
    public final int howTasty;

    Cereals(int howTasty) {
        this.howTasty = howTasty;
    }
}
