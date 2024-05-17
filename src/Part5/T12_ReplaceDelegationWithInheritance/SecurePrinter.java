package Part5.T12_ReplaceDelegationWithInheritance;

public class SecurePrinter {
    private final Printer printer = new Printer();
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        printer.print(document);
    }
}
