package programmer.day3.dagger;

import dagger.Component;
import programmer.staff.BankCard;
import programmer.staff.PassCard;
import programmer.staff.SmartPhone;

@Component(modules = {
        BankCardModule.class,
        PassCardModule.class,
        SmartPhoneModule.class
})

public interface WifeComponent {

    BankCard getBankCard();
    PassCard getPassCard();
    SmartPhone getSmartPhone();

}
