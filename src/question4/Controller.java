package question4;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            PrintWriter out = new PrintWriter("output.txt");

            int lineNo = 0;

            while (in.hasNext()){
                lineNo = lineNo +1;
                out.println("/*" + lineNo + "*/ " + in.nextLine());
            }

            in.close();
            out.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
