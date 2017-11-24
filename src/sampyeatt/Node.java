package sampyeatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam Pyeatt on 11/24/2017.
 */
public class Node {
    int row;
    int column;
    List<Integer> posval = new ArrayList<>();
    Integer actval;

    public Node(int row, int  column){
        this.row = row;
        this.column = column;
        for(int i =0; i < 9; i++)
        {
            posval.add(new Integer(i+1));
        }
    }
    boolean isSet(){
        return (actval != null);
    }

    void setValue(Integer val){
        actval = val;
        posval.clear();
    }

    void cantB(Integer val){
        if(!isSet()){
            posval.remove(val);
            if(posval.size() == 1){
                setValue(posval.get(0));
            }
        }
    }
}
