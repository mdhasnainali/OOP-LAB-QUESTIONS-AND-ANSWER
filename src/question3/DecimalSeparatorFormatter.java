package question3;

import java.util.ArrayList;

public class DecimalSeparatorFormatter implements NumberFormatter {

    @Override
    public String format(int n) {
        String number = Integer.toString(n);
        String formatedNumber = "";
        int lengthOfTheString = number.length();
        String sign = "+";

        if(n<0){
            sign = "-";
            n = n * -1;
        }

        formatedNumber = formatedNumber + number.substring(0,lengthOfTheString%3) + ',';

        int j=1;

        for(int i=lengthOfTheString%3; i<lengthOfTheString;i++,j++){
            formatedNumber += number.charAt(i);
            if(j%3==0 && j!=lengthOfTheString-(lengthOfTheString%3)) formatedNumber+=',';
        }

        return sign + formatedNumber;
    }
}

/*
12345678
12,345,678
8-2 = 6

 */