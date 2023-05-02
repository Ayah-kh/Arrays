public class Bank {
    private ExpandedArray branches;
    private int lastIndex = 0;

    public Bank() {
        branches = new ExpandedArray();
    }

    public int addBranch(String branch) {

        return branches.addElement(branch);
    }

    public boolean removeBranchByIndex(int index) {

        return branches.removeElementByIndex(index);
    }

    public boolean removeBranchByValue(String branch) {

        return branches.removeByValue(branch);
    }

    public void print() {
        branches.print();
    }

}

