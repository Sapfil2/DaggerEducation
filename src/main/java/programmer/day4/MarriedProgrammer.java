package programmer.day4;

import programmer.staff.BankCard;
import programmer.staff.PassCard;
import programmer.staff.SmartPhone;

import javax.inject.Inject;

public class MarriedProgrammer {

    @Inject
    protected BankCard bankCard;

    @Inject
    protected PassCard passCard;

    @Inject
    protected SmartPhone smartPhone;

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
