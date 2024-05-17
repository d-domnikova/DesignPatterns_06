package Part5.T6_ExtractSubclass;

public class Chordophones extends MusicalInstrument{
    private String classification;
    public Chordophones(String name, Range range, String classification) {
        super(name, range);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }

    public void produceSound(){
        //method that used only by this group of instruments
    }
}
