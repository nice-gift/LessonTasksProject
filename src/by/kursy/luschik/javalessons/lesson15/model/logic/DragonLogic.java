package by.kursy.luschik.javalessons.lesson15.model.logic;

public class DragonLogic {
    public static int countHeads(int age) {
        if (age <= 0) {
            return -1;
        }

        int head = 3;

        if (age <= 200) {
            head += age * 3;
        } else if (age <= 300) {
            head += 200 * 3 + (age - 200) * 2;
        } else {
            head += 200 * 3 + 100 * 2 + age - 300;
        }

        return head;
    }
}
