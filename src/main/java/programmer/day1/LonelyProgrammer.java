package programmer.day1;

import programmer.staff.BankCard;
import programmer.staff.PassCard;
import programmer.staff.SmartPhone;

public class LonelyProgrammer {

    private final BankCard bankCard;
    private final PassCard passCard;
    private final SmartPhone smartPhone;

    public LonelyProgrammer(BankCard bankCard, PassCard passCard, SmartPhone smartPhone) {
        this.bankCard = bankCard;
        this.passCard = passCard;
        this.smartPhone = smartPhone;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public PassCard getPassCard() {
        return passCard;
    }

    public SmartPhone getSmartPhone() {
        return smartPhone;
    }

    public void work(){
        System.out.println("Working...");
    }
}
