import java.util.Scanner;
public class EvaluateBoolExpr
{

  public static void main(String[] args)
  {
     StringStack ops = new FixedCapacityStack();
     StringStack vals = new FixedCapacityStack();

     Scanner scan = new Scanner(System.in);

     while(scan.hasNext())
     {
        String token = scan.next();//StdIn.readString();
        if(token.equals("true") ||token.equals("false")) vals.push(token);
        else {
           if (token.equals("("))                ;
           else if(token.equals("&&")) ops.push(token);
           else if(token.equals("||")) ops.push(token);
           else if(token.equals("!")) ops.push(token);
           else if(token.equals(")"))
           {
              boolean u = Boolean.parseBoolean(vals.pop());

              boolean result = true;

              String op = ops.pop();

              if(op.equals("&&")) result = u && Boolean.parseBoolean(vals.pop());
              else if(op.equals("||")) result = u || Boolean.parseBoolean(vals.pop());
              else if(op.equals("!")) result = !u;

              vals.push(Boolean.toString(result));
            }
          }

     }
     System.out.println("The result of evaluation is: " + vals.pop());
     scan.close();
  }
}
