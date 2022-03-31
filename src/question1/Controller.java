package question1;

public class Controller {
    public static void main(String[] args) {

        final int COLUMN = 3;
        final int ROW = 3;

        Table table = new Table(ROW,COLUMN);

        int [][] personalTable = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Set the values to the table
        for(int i = 0; i<ROW; i++){
            for(int j=0; j<COLUMN; j++){
                table.set(i,j,personalTable[i][j]);
            }
        }

        System.out.println(table.neighborAverage(1,1));
        System.out.println(table.neighborAverage(2,0));
        System.out.println(table.neighborAverage(1,2));

    }
}

/**
 *  [1 2 3]  Avg(5) = (1+3+4+5+6)/5 --> neighborAverage(0,1)
 *  [4 5 6]  Avg(7) = (4+5+8)/3;
 *  [7 8 9]
 */