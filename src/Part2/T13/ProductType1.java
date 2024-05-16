package Part2.T13;

public class ProductType1 extends Product{

    public ProductType1(String name) {
        super(name);
    }
    @Override
    public int getTypeCode() {
        return 1;
    }

    @Override
    public void process() {
        //Послідовність дій для типу 1
    }
}