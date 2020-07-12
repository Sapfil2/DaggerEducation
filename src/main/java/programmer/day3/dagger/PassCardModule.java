package programmer.day3.dagger;

import dagger.Module;
import dagger.Provides;
import programmer.staff.PassCard;

@Module
public class PassCardModule {

    @Provides
    PassCard provideBancCard(){
        return new PassCard("Vova");
    }
}
