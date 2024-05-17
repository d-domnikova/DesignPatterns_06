package Part5.T12_ReplaceDelegationWithInheritance;

public class SecurePrinter extends Printer{
    @Override
    void print(String document) {
        System.out.println("Printing securely: " + document);
        super.print(document);
    }
}