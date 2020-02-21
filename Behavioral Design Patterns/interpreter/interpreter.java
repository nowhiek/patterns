interface Expression {
    String interpret(Context context);
}

class Context {
    public String getLowerCase(String s){
        return s.toLowerCase();
    }
    public String getUpperCase(String s){
        return s.toUpperCase();
    }
}

class LowerExpression implements Expression {
    private String s;
    public LoverExpression(String s) {
        this.s = s;
    }
    public String interpret(Context context) {
        return context.getLoverCase(s);
    }
}

class UpperExpression implements Expression {
    private String s;
    public UpperExpression(String s) {
        this.s = s;
    }
    public String interpret(Context context) {
        return context.getUpperCase(s);
    }
}

public class InterpreterTest {
    public static void main(String[] args) {
        String str = "TesT";
        Context context = new Context();
        Expression loverExpression = new LoverExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);
        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
