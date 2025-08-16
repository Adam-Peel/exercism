import java.lang.IllegalArgumentException;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {
       if (operation == null){
           throw new IllegalArgumentException("Operation cannot be null");
       }


       if (operation == ""){
           throw new IllegalArgumentException("Operation cannot be empty");
       } else if (operation != "*" && operation != "+" && operation != "/") {
           throw new IllegalOperationException("Operation '" + operation + "' does not exist");
       } else {

           int sum = 0;
             try {
           if (operation == "+"){
               sum = operand1 + operand2;
           } else if(operation == "*") {
               sum = operand1 * operand2;
           } else if (operation == "/"){
               sum = operand1 / operand2;
           }

                   } catch (ArithmeticException e) {
                 throw new IllegalOperationException("Division by zero is not allowed", e);
           }
           return operand1 + " " + operation + " " + operand2 + " = " + sum;
       }
    }
}
