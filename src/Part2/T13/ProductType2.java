package Part2.T13;

public class ProductType2 extends Product{

    public ProductType2(String name) {
        super(name);
    }
    @Override
    public int getTypeCode() {
        return 2;
    }

    @Override
    public void process() {
        //Послідовність дій для типу 2
    }
}