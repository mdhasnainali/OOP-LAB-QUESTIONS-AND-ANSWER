package question2;

public class Controller {
    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(5,5,15);

        comboLock.turnRight(5);
        comboLock.turnLeft(40);
        comboLock.turnRight(10);

        System.out.println(comboLock.open());
    }
}
