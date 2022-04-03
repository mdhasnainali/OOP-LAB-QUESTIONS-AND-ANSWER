package question5.default_code;

import java.io.File;
import java.util.Scanner;

public class MyThread extends Thread{
    private String fileName;
    private String hasToFind;

    public MyThread(String fileName, String hasToFind){
        this.fileName = fileName;
        this.hasToFind = hasToFind;
    }

    public void run(){
        try{
            Scanner in = new Scanner(new File(fileName));

            while(in.hasNext()){
                String line = in.nextLine();
                if(line.contains(hasToFind)){
                    System.out.println(fileName + ": " + line);
                }
            }
            in.close();
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
