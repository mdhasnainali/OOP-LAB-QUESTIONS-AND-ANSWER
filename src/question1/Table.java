package question1;

public class Table {
    private int[][] values;

    /**
     * Constructor
     * @param rows numberOfRowsInTheTable
     * @param columns numberOfColumnsInTheTable
     */
    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    public double neighborAverage(int row, int column) {
        int numberOfNeighbors = 0;
        int sumOfNeighbors = 0;

        int tableRow = values.length;
        int tableColumn = values[0].length;

        int [] rowColumnOffset = {-1, 0, 1};

        for(int deltaRow: rowColumnOffset){
            for(int deltaColumn: rowColumnOffset){
                if(row+deltaRow>=0 && row+deltaRow<tableRow && column+deltaColumn>=0 && column+deltaColumn<tableColumn){
                    sumOfNeighbors = sumOfNeighbors + values[row+deltaRow][column+deltaColumn];
                    numberOfNeighbors = numberOfNeighbors + 1;
                }
            }
        }

        sumOfNeighbors = sumOfNeighbors - values[row][column];


        //Another way of logic
        /*

        if(row-1>=0 && column-1>=0) {
            sumOfNeighbors = sumOfNeighbors + values[row-1][column-1];
            numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row-1>=0 && column==column) {
                    sumOfNeighbors = sumOfNeighbors + values[row-1][column];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row-1>=0 && column+1<tableColumn) {
                    sumOfNeighbors = sumOfNeighbors + values[row-1][column+1];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row==row && column-1>=0) {
                    sumOfNeighbors = sumOfNeighbors + values[row][column-1];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row==row && column+1<tableColumn) {
                    sumOfNeighbors = sumOfNeighbors + values[row][column+1];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row+1<tableRow && column-1>=0) {
                    sumOfNeighbors = sumOfNeighbors + values[row+1][column-1];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }

        if(row+1<tableRow && column==column) {
                    sumOfNeighbors = sumOfNeighbors + values[row+1][column];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
        if(row+1<tableRow && column+1<tableColumn) {
                    sumOfNeighbors = sumOfNeighbors + values[row+1][column+1];
                    numberOfNeighbors = numberOfNeighbors + 1;
        }
         */

        return (double) sumOfNeighbors/(numberOfNeighbors-1);
    }

}
