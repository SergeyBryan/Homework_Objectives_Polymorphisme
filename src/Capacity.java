public enum Capacity {
    EXTRASMALL(0,10),
    SMALL(10,25),
    MEDIUM(40, 50),
    LARGE(60,80),
    EXTRALARGE(100, 120);

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}

