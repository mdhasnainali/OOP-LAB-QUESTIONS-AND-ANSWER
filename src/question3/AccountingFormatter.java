package question3;

public class AccountingFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        if(n>=0) return Integer.toString(n);
        else{
            return "(" + (n * -1) + ")";
        }
    }
}

/*
100 -> "100"
-199 -> "(100)"
 */