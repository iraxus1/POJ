package pl.edu.pja;

public enum Shield {
    No_SHIELD(1),
    BULLETPROOF_VEST(5);

    private final int value;

    Shield(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
