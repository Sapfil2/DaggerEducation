package programmer.day2;

import programmer.day1.LonelyProgrammer;
import programmer.staff.BankCard;
import programmer.staff.SamsungSmartPhone;

public class Day2GoingToWork {

    public static void main(String[] args) {

        // собирается на работу
        LonelyProgrammer vova = new LonelyProgrammer(new BankCard(), null, new SamsungSmartPhone());

        // предъявляет пропуск охранникую А если забыл пропуск то звонит коллеге.
        try {
            System.out.println(vova.getPassCard().getName());
        } catch (NullPointerException e) {
            vova.getSmartPhone().callColleague();
        }

        // идет работать
        vova.work();

    }

}
