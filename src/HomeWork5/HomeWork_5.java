package HomeWork5;

import sun.security.mscapi.CPublicKey;

public class HomeWork_5 {
    public static void main(String[] args) {


        Staff[]persArray = new Staff[5];
        persArray[0] = new Staff("Ivanov Ivan Ivanivich", "counter", "adr@mail.ru", "+79512151517", 50000, 38);
        persArray[1] = new Staff("Petrov Sergey Olegovich", "director", "boss@mail.ru", "+79054894232", 70000, 42);
        persArray[2] = new Staff("Sidorova Anna Michailovna", "PR-manager", "pr-master@mail.ru", "+79054871024", 45000, 28);
        persArray[3] = new Staff("Afonin Petr Vasilyevich", "engineer", "superProfi@mail.ru", "+79084512565", 55000, 43);
        persArray[4] = new Staff("Alisina Elena Viktorovna", "mechanic", "AlisEl@mail.ru", "+79028542956", 45000, 32);

   /*     for (int i = 0; i < persArray.length; i++) {
            persArray[i].info();
        }

    */
    /*    for (int i = 0; i < persArray.length; i++) {
            persArray[i].getAge(40);
        } */


    }
}
