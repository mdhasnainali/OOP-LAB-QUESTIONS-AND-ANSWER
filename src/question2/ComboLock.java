package question2;

import java.util.ArrayList;
import java.util.Arrays;

public class ComboLock {
    private static final int HIGHEST = 39;
    private static final int LOWEST = 0;
    private enum Turn{LEFT,RIGHT};
    private static final ArrayList<Turn> DIRECTIONS = new ArrayList<>(Arrays.asList(Turn.RIGHT,Turn.LEFT,Turn.RIGHT));

    private int dial;
    private ArrayList <Integer> secretKeys;
    private ArrayList <Integer> inputKeyValues;
    private ArrayList <Turn> inputKeyDirections;


    public ComboLock(int secret1, int secret2, int secret3) {
        this.secretKeys = new ArrayList<>();
        this.inputKeyValues = new ArrayList<>();
        this.inputKeyDirections = new ArrayList<>();
        this.dial = 0;

        this.secretKeys.add(secret1);
        this.secretKeys.add(secret2);
        this.secretKeys.add(secret3);
    }
    public void reset() {
        this.dial = 0;
        this.inputKeyDirections.clear();
        this.inputKeyValues.clear();
    }
    public void turnLeft(int ticks) {
        while(ticks!=0){
            ticks = ticks - 1;
            dial = dial - 1;
            if(dial < LOWEST){
                dial = 39;
            }
        }
        inputKeyValues.add(dial);
        inputKeyDirections.add(Turn.LEFT);
    }
    public void turnRight(int ticks) {
        while(ticks!=0){
            ticks = ticks - 1;
            dial = dial + 1;
            if(dial > HIGHEST){
                dial = 0;
            }
        }
        inputKeyValues.add(dial);
        inputKeyDirections.add(Turn.RIGHT);
    }
    public boolean open() {
        if(inputKeyDirections.equals(DIRECTIONS) && inputKeyValues.equals(secretKeys)){
            return true;
        }
        else return false;
    }
}
