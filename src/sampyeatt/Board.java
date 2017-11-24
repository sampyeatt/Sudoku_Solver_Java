package sampyeatt;

/**
 * Created by Sam Pyeatt on 11/24/2017.
 */
public class Board {
    Node[][] nodes = new Node[9][9];
    public Board(){
        for(int row =0; row<9;row++)
        {
            for(int col =0; col <9;col++)
            {
                nodes[row][col] = new Node(row,col);
            }
        }
    }
    public void setVal(int row, int col, int val){
        nodes[row][col].setValue(val);
    }

    public void printB(){
        System.out.println("1 2 3 4 5 6 7 8 9");
        System.out.println("- - - - - - - - -");
        for(int row =0; row < 9; row++)
        {
            for(int col =0; col < 9; col++)
            {
                System.out.print(nodes[row][col].printableVal());
                System.out.print(" ");

            }
            System.out.println("| " + row);
        }
    }
}
