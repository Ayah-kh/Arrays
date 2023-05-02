public class BankApplication {
    public static void main(String[] args) {

        BankV2 bank = new BankV2();
        bank.addBranch("amman");
        bank.addBranch("Irbid");
        bank.addBranch("Zarka");
        bank.addBranch("Ramtha");




        bank.print();

//        bank.removeBranchByIndex(0);
//        bank.removeBranchByValue("Zarka");
//        bank.print();
    }

}
