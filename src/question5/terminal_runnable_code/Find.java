package question5.terminal_runnable_code;

import java.io.File;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String hasToFind = args[0];

        int numberOfFiles = args.length;

        for(int i = 1; i<numberOfFiles; i++){
            String fileName = args[i];
            new question5.default_code.MyThread(fileName,hasToFind).start();
        }
    }
}

class MyThread extends Thread{
    private String fileName;
    private String hasToFind;

    public MyThread(String fileName, String hasToFind){
        this.fileName = fileName;
        this.hasToFind = hasToFind;
    }

    public void run(){
        try{
            Scanner in = new Scanner(new File(fileName));

            while(in.hasNextLine()){
                String line = in.nextLine();
                if(line.contains(hasToFind)){
                    System.out.println(fileName + ": " + line);
                }
            }
            in.close();
        }catch (Exception e){
	    e.printStackTrace();
        }
    }
}
