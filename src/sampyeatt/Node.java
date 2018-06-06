package sampyeatt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam Pyeatt on 11/24/2017.
 */
public class Node {
    int row;
    int column;
    //TODO: I'm assuming these are possible values. So I'd name it possibleValues
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

    // TODO: should be called cantBe(). Also, in the inline documentation
    // put in a comment that states if the possibleValues is down to 1
    // this method sets the actual value
    void cantB(Integer val){
        if(!isSet()){
            posval.remove(val);
            if(posval.size() == 1){
                setValue(posval.get(0));
            }
        }
    }
    public String printableVal(){
        if(isSet())
        {
            return actval.toString();
        }
        return " ";
    }
}
