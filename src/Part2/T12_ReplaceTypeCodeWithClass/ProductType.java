package Part2.T12_ReplaceTypeCodeWithClass;

public class ProductType {
    private int typeCode;

    public ProductType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }

    private static final ProductType Type1 = new ProductType(1);
    private static final ProductType Type2 = new ProductType(2);
}
