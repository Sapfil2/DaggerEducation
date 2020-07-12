package programmer.day4.dagger;

import dagger.Module;
import dagger.Provides;
import programmer.staff.SamsungSmartPhone;
import programmer.staff.SmartPhone;

@Module
public class SmartPhoneModule {

    @Provides
    SmartPhone provideSmartPhone(){
        return new SamsungSmartPhone(true);
    }
}
