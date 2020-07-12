package programmer.day1;

import programmer.staff.BankCard;

public class Day1GoingToWork {

    public static void main(String[] args) {

        // собирается на работу
        LonelyProgrammer vova = new LonelyProgrammer(new BankCard(), null, null);

        // предъявляет пропуск охраннику
        System.out.println(vova.getPassCard().getName());

        // идет работать
        vova.work();

    }

}
