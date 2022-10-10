package by.kursy.luschik.javalessons.lesson32;

public class Task01 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        /* методанные*/
        System.out.println("id = " + thread.getId());
        System.out.println("name = " + thread.getName());
        thread.setName("My main thread");
        System.out.println("name = " + thread.getName());
        System.out.println("priority = " + thread.getPriority());
        System.out.println("thread group = " + thread.getThreadGroup());
        System.out.println("thread state = " + thread.getState());
        System.out.println("is alive = " + thread.isAlive()); /*если поток активен или ждет выполнения*/

    }
}
