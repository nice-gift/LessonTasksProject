package by.kursy.luschik.javalessons.lesson30.model;

import java.io.*;

public class Serializer {
    private static String file = "c:/test/user.bin";

    public static void serialize(User user) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)))) {

            stream.writeObject(user);

            stream.flush();
        } catch (IOException exception) {
            System.err.println(exception);
        }
    }


    public static User deserialize() {
        User user = null;

        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)))) {

            user = (User) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println(exception);
        }

    return user;}
}
