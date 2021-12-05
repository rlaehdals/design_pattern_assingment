public class StartState implements State{

    private CalcV1 calcV1;


    public StartState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void NumberProcess(int num) {
        calcV1.setOperand1(num);
        calcV1.setState(calcV1.getFirstState());
    }
}
