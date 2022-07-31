package by.kursy.luschik.javalessons.lesson30.model;

import java.io.Serializable;

public class User implements Serializable {
    private String login;
    private String password;
    private String securityWord;
    private int age;
    private boolean status;

    public User() {
    }

    public User(String login, String password, String securityWord, int age, boolean status) {
        this.login = login;
        this.password = password;
        this.securityWord = securityWord;
        this.age = age;
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityWord() {
        return securityWord;
    }

    public void setSecurityWord(String securityWord) {
        this.securityWord = securityWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", securityWord='" + securityWord + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
