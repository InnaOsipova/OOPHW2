package ru.gd.oseminar.data;

public abstract class User {
    private String firsNname;
    private String lastName;
    private String patronymic;

    public User(String firsNname, String lastName, String patronymic) {
        this.firsNname = firsNname;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirsNname() {
        return firsNname;
    }

    public void setFirsNname(String firsNname) {
        this.firsNname = firsNname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "User{" +
                "firsNname='" + firsNname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
