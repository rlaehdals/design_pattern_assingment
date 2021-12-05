import java.util.Scanner;

public class CalcV1 {
    private Scanner scanner;
    private String inputStr;
    private int operand1; // 첫 번째 피 연산자값 저장
    private int operand2; // 두 번째 피 연산자값 저장
    private State state;
    private State firstState;
    private State startState;
    private State secondState;
    private State operatorState;
    private char operator;
    public State getFirstState() {
        return firstState;
    }

    public State getStartState() {
        return startState;
    }

    public State getSecondState() {
        return secondState;
    }

    public State getOperatorState() {
        return operatorState;
    }

    public CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        this.firstState = new FirstOperandState(this);
        this.startState =  new StartState(this);
        this.secondState = new SecondOperandState(this);
        this.operatorState = new OperatorState(this);
        this.state= startState;
    }
    // 사칙 연산자 저장

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
    }

    /* 정수가 입력되었을 때 처리 */
    void processNumber(String ch) {
        state.NumberProcess(Integer.parseInt(ch));
    }

    /* 사칙 연산자 혹은 = 연산자 처리 */
    void processOperator(char ch) {
        state.OperatorProcess(ch);
    }

    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            processNumber(inputStr);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
            processOperator(ch);
        }
        return true;
    }
}
