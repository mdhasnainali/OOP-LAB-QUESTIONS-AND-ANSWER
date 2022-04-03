package question3;

public class Controller {
    public static void main(String[] args) {
        DefaultFormatter defaultFormatter = new DefaultFormatter();

        System.out.println(defaultFormatter.format(100000));


        DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
        System.out.println(decimalSeparatorFormatter.format(12345678));

        AccountingFormatter accountingFormatter = new AccountingFormatter();
        System.out.println(accountingFormatter.format(56378));

        BaseFormatter baseFormatter = new BaseFormatter(16);
        System.out.println(baseFormatter.format(-10));

    }
}
