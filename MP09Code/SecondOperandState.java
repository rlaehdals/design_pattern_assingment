public class SecondOperandState implements State{

    private CalcV1 calcV1;

    public SecondOperandState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void OperatorProcess(char ch) {
        if(ch=='='){
            calcV1.printOutResult();
            calcV1.setState(calcV1.getStartState());
        }
    }
}
