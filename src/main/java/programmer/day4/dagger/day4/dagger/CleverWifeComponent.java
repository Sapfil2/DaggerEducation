package programmer.day4.dagger.day4.dagger;

import dagger.Component;
import programmer.day4.dagger.day4.MarriedProgrammer;

@Component(modules = {
        BankCardModule.class,
        PassCardModule.class,
        SmartPhoneModule.class
})

public interface CleverWifeComponent {

    void injectStaff(MarriedProgrammer marriedProgrammer);

}
