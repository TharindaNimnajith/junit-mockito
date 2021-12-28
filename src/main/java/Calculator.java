public class Calculator {
    ICalculatorService iCalculatorService;

    @SuppressWarnings("Convert2Lambda")
    INewCalculatorService iNewCalculatorService = new INewCalculatorService() {
       public int add(int i, int j) {
           return i + j;
       }
    };

    public int add(int i, int j) {
        return i + j;
    }

    public int addIncorrect(int i, int j) {
        return i + j + 1;
    }

    public int addService(int i, int j) {
        return iCalculatorService.add(i, j);
    }

    public int addNewService(int i, int j) {
        return iNewCalculatorService.add(i, j);
    }
}
