import java.util.Arrays;

public class Bank {
    private String[] branches;
    private int lastIndex=0;

    public Bank(){
        branches=new String[3];


    }

    public int addBranch(String branch){
        if (lastIndex>=branches.length)
            expandBranchesArray();

        branches[lastIndex]=branch;
        return lastIndex++;
    }

    public boolean removeBranchByIndex(int index){
        if (index<0||index>=lastIndex) {
            return false;
        }
        for (int i = index; i < lastIndex-1; i++) {
            branches[i]=branches[i+1];

        }
        branches[--lastIndex]=null;
        return true;
    }

    public boolean removeBranchByValue(String branch){
        for (int i = 0; i < lastIndex; i++) {
            if (branches[i].equals(branch))
                return removeBranchByIndex(i);

        }

        return false;
    }

    public void print(){
        for (int i = 0; i < lastIndex; i++) {


            System.out.print(branches[i]+" ");

        }
        System.out.println();
    }

    private void expandBranchesArray(){
        branches= Arrays.copyOf(branches,branches.length*2);

    }
}

