package question5.default_code;

public class Find {
    public static void main(String[] args) {
        String hasToFind = args[0];

        int numberOfFiles = args.length;

        for(int i = 1; i<numberOfFiles; i++){
            String fileName = args[i];
            new MyThread(fileName,hasToFind).start();
        }
    }
}
