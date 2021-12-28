public class Calculator {
    ICalculatorService iCalculatorService1;

    @SuppressWarnings("Convert2Lambda")
    ICalculatorService iCalculatorService2 = new ICalculatorService() {
        public int add(int i, int j) {
            return i + j;
        }
    };

    ICalculatorService iCalculatorService3;

    public Calculator() {
    }

    public Calculator(ICalculatorService iCalculatorService) {
        this.iCalculatorService3 = iCalculatorService;
    }

    public int add(int i, int j) {
        return i + j;
    }

    public int addIncorrect(int i, int j) {
        return i + j + 1;
    }

    public int addService1(int i, int j) {
        return iCalculatorService1.add(i, j);
    }

    public int addService2(int i, int j) {
        return iCalculatorService2.add(i, j);
    }

    public int addService3(int i, int j) {
        return iCalculatorService3.add(i, j);
    }
}
