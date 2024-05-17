package Part5.T6_ExtractSubclass;

public class MusicalInstrument {
    protected String name;
    protected Range range;

    public MusicalInstrument(String name, Range range) {
        this.name = name;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public Range getRange() {
        return range;
    }
}
