package programmer.day4;

import programmer.day4.dagger.DaggerCleverWifeComponent;
import programmer.day4.dagger.CleverWifeComponent;

public class Day4GoingToWork {

    public static void main(String[] args) {

        // жена все приготовила
        CleverWifeComponent wifeComponent = DaggerCleverWifeComponent.create();

        // собирается на работу, ничего не просит
        MarriedProgrammer vova = new MarriedProgrammer();
        // жена сама все кладет по карманам
        wifeComponent.injectStaff(vova);

        // предъявляет пропуск охраннику
        System.out.println(vova.getPassCard().getName());

        // идет работать
        vova.work();

    }

}
