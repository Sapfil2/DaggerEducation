package programmer.day4.dagger;

import dagger.Component;
import programmer.day3.dagger.BankCardModule;
import programmer.day3.dagger.PassCardModule;
import programmer.day3.dagger.SmartPhoneModule;
import programmer.day4.MarriedProgrammer;

@Component(modules = {
        BankCardModule.class,
        PassCardModule.class,
        SmartPhoneModule.class
})

public interface CleverWifeComponent {

    void injectStaff(MarriedProgrammer marriedProgrammer);

}
