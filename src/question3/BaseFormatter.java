package question3;

import java.util.ArrayList;

public class BaseFormatter implements NumberFormatter{

    private int base;
    String sign = "+";
    public BaseFormatter(int n){
        this.base = n;
    }

    @Override
    public String format(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        String formatedString = "";

        if(n<0){
            sign = "-";
            n = n * -1;
        }

        while(n>0){
            digits.add(n % base);
            n = n / base;
        }

        for(int i=digits.size()-1;i>=0;i--){
            if(digits.get(i) > 9){
                formatedString += (char)(digits.get(i)+55);
            }
            else formatedString += digits.get(i);
        }

        return sign+formatedString;
    }
}
