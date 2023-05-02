public class BankApplication {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addBranch("amman");
        bank.addBranch("Irbid");
        bank.addBranch("Zarka");
        bank.addBranch("Ramtha");

        bank.print();

        bank.removeBranchByIndex(0);
        bank.removeBranchByValue("Zarka");
        bank.print();
    }

}
