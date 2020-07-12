package programmer.day3.dagger;

import dagger.Module;
import dagger.Provides;
import programmer.staff.SmartPhone;

@Module
public class SmartPhoneModule {

    @Provides
    SmartPhone provideSmartPhone(){
        return new SmartPhone(true);
    }
}
