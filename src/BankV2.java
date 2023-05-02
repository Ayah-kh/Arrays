public class BankV2 {
    private ExpandedArrayGeneric<String> branches;

    public BankV2() {
        branches = new ExpandedArrayGeneric<>();
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
        branches.forEach(new PrintOperation());
    }

}
class PrintOperation implements Operation<String>{

    @Override
    public void doOperation(String s) {
        System.out.print(s+" ");
    }
}


