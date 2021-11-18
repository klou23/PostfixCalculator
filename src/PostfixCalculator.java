import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PostfixCalculator {

    public double evaluate(double a, double b, String op){
        switch(op){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            default: return a/b;
        }
    }

    public static void main(String[] args) throws IOException {
        PostfixCalculator p = new PostfixCalculator();
        p.test();
    }

    public void test() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("tests.txt"));
        String s;
        while((s=br.readLine()) != null){
            double sol = pFix(s);
            s = br.readLine();
            double correct = Double.parseDouble(s);
            if(sol == correct) System.out.println("Correct");
            else System.out.println("Incorrect"+sol);
        }
    }

    public double pFix(String str){
        StringTokenizer st = new StringTokenizer(str);
        Stack<Double> s = new Stack<>();

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                double b = s.pop();
                double a = s.pop();
                s.push(evaluate(a,b,token));
            }else{
                s.push(Double.parseDouble(token));
            }
        }
        return s.peek();
    }

}
