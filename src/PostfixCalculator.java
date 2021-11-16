import java.util.StringTokenizer;

public class PostfixCalculator {

    public static void main(String[] args) {

    }

    public double pFix(String str){
        StringTokenizer st = new StringTokenizer(str);
        Stack<Double> s = new Stack<>();

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                double a = s.pop();
                double b = s.pop();
                s.push(evaluate(a,b,token));
            }else{
                s.push(Double.parseDouble(token));
            }
        }
        return s.peek();
    }

}
