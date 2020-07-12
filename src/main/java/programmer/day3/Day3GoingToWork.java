package programmer.day3;

import programmer.day3.dagger.WifeComponent;
import programmer.day3.dagger.DaggerWifeComponent;

public class Day3GoingToWork {

    public static void main(String[] args) {

        // жена все приготовила
        WifeComponent wifeComponent = DaggerWifeComponent.create();

        // собирается на работу - все просит у жены
        MarriedProgrammer vova = new MarriedProgrammer(
                wifeComponent.getBankCard(),
                wifeComponent.getPassCard(),
                wifeComponent.getSmartPhone()
        );

        // предъявляет пропуск охраннику
        System.out.println(vova.getPassCard().getName());

        // идет работать
        vova.work();

    }

}
