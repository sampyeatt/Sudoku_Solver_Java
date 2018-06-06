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

    //TODO: What does printB mean? It looks like it's printing the board. So call
    // it printBoard().
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
            System.out.println("| " + (row+1));
        }
    }
    public boolean isComplete(){
        for(int row =0; row<9;row++)
        {
            for(int col =0; col <9;col++)
            {
                if(!nodes[row][col].isSet()){
                    return false;
                }
            }
        }
        return true;
    }
    public void scanRow(){
        for(int row=0;row<9;row++)
        {
            for(int col =0; col < 9; col++)
            {
                Node n = nodes[row][col];
                if(!n.isSet()){
                    for(int i =0; i <9;i++)
                    {
                        Node temp = nodes[row][i];
                        if(temp.isSet())
                        {
                            n.cantB(temp.actval);
                        }
                    }
                }
            }
        }
    }
    public void scanCol(){
        for(int col=0;col<9;col++)
        {
            for(int row =0; row < 9; row++)
            {
                Node n = nodes[row][col];
                if(!n.isSet()){
                    for(int i =0; i <9;i++)
                    {
                        Node temp = nodes[i][col];
                        if(temp.isSet())
                        {
                            n.cantB(temp.actval);
                        }
                    }
                }
            }
        }
    }

    // TODO: Again, spell out names completely, it makes things more readable.
    public void scanSqua(){
        for(int row =0; row<9;row++)
        {
            for(int col =0; col <9;col++)
            {
                // TODO: Really needs comments to explain what is going on here.
                int topSqua = (row/3)*3;
                int leftSqua = (col/3)*3;
                Node n = nodes[row][col];
                for(int i =topSqua; i < (topSqua+3); i++)
                {
                    for(int j = leftSqua; j < (leftSqua+3); j++)
                    {
                        Node temp = nodes[i][j];
                        if(temp.isSet())
                        {
                            n.cantB(temp.actval);
                        }
                    }
                }
            }
        }
    }

    public boolean validate(){
        if(isComplete())
        {

            for(int row = 0; row < 9; row++)
            {
                int total = 0;
                for(int col = 0; col < 9; col++)
                {
                    total += nodes[row][col].actval;
                }
                if(total != 45)
                {
                    System.out.println("Row " + row + "is no good. " + total);
                    return false;
                }
            }
            for(int c = 0; c < 9; c++)
            {
                int total = 0;
                for(int r = 0; r < 9; r++)
                {
                    total += nodes[r][c].actval;
                }
                if(total != 45)
                {
                    System.out.println("Column " + c + "is no good. " + total);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void solve()
    {
        int count = 0;
        // TODO: This is a good example of something called a 'magic number'
        // You generally want to avoid magic numbers in code. Instead, add
        // a private static int variable to the class called something like
        // MAX_ITERATIONS = 21.
        // so your while loop would then look like this.
        // while (!isComplete() && count < MAX_ITERATIONS)
        while(!isComplete() && count < 21)
        {
            scanCol();
            scanRow();
            scanSqua();
            count++;
        }
    }
}
