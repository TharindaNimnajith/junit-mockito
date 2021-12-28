public class Calculator {
    ICalculatorService iCalculatorService;

    public int add(int i, int j) {
        return i + j;
    }

    public int addIncorrect(int i, int j) {
        return i + j + 1;
    }

    public int addService(int i, int j) {
        return iCalculatorService.add(j, j);
    }
}
