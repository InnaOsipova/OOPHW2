package ru.gd.oseminar.service;

import ru.gd.oseminar.data.Student;
import ru.gd.oseminar.data.User;

import java.util.List;

public interface DataService {

    void userCreate(String firsNname, String lastName, String patronymic);
    List<User> getAll();
    void userDelete(Long param);
}
