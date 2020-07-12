package programmer.day4.dagger.day4.dagger;

import dagger.Module;
import dagger.Provides;
import programmer.staff.BankCard;

@Module
public class BankCardModule {

    @Provides
    BankCard provideBancCard(){
        return new BankCard();
    }
}
