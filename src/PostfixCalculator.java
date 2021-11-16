public class PostfixCalculator {

    public double evaluate(double a, double b, String op){
        switch(op){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            default: return a/b;
        }
    }

    public static void main(String[] args) {

    }

}
