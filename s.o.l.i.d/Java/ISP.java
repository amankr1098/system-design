// Interface Segregation Principle(ISP) : It states that it should not implement un-necessary method.

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultifunctionPrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

// IN above ex. we can see if segregated the functionality of printer, as in MultiFuntionPrinter it required both , but for 
// simple printer only print is required. 