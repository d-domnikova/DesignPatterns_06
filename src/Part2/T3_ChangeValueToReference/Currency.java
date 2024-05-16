package Part2.T3_ChangeValueToReference;

public class Currency {
    private String code;
    private Currency(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}