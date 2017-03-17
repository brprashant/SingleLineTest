package Strings;

/**
 * Created by brprashant on 3/16/17.
 */
public class PrintTicTacToe {
    /*abstract

describe 'tic-tac-toe printer' do
  it 'prints an empty board' do
    output = TicTacToe.print [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']

    expected = <<~END
       |   |
    ---+---+---
       |   |
    ---+---+---
       |   |
    END

    expect(output).to eq
  end
end

*/

/* package whatever; // don't place package name! */


    private static char[] board = new char[]{'x', 'x', 'x', 'o', 'O', 'o', 'o', 'x', 'X'};

    PrintTicTacToe() {
    }

    private static final String COLUMN_SEPARATOR = "|";
    private static final String ROW_SEPARATOR = "---";
    private static final String ROW_SEPARATOR_FOR_COL = "+";

    private static int NUMBER_OF_ROWS = 3;
    private static int NUMBER_OF_COLS = 3;


    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Hello Java");
        print();
    }

    private static void print() {
        for (int i = 0; i < NUMBER_OF_COLS*NUMBER_OF_ROWS; ) {
            char[] row = {board[i++], board[i++], board[i++]};
            printDataRow(row);
            if (i%NUMBER_OF_ROWS==0 && i+1 != NUMBER_OF_COLS*NUMBER_OF_ROWS) {
                System.out.println();
                printRowSeparator(NUMBER_OF_COLS);
            }
            System.out.println();
        }
    }

    private static void printDataRow(char[] rowArray) {
        int len = rowArray.length;
        for (int i = 0; i < len; i++) {
            System.out.print(" " + rowArray[i] + " ");
            if (i + 1 != len) {
                System.out.print(COLUMN_SEPARATOR);
            }
        }
    }

    private static void printRowSeparator(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(ROW_SEPARATOR);
            if (i + 1 != size) {
                System.out.print(ROW_SEPARATOR_FOR_COL);
            }
        }

    }


}
