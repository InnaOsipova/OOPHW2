package ru.gd.oseminar.service;

import ru.gd.oseminar.data.Student;
import ru.gd.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{

    private final List<User> users;
    private Long id =0L;

    public UserService() {
        this.users = new ArrayList<>();
    }


    @Override
    public void userCreate(String firsNname, String lastName, String patronymic) {
      for (User item:this.users) {
            if(item instanceof Student){
                if(id<((Student)item).getStudentId()){
                   id = ((Student)item).getStudentId();
                }
            }
        }
       id++;
        this.users.add(new Student(firsNname,lastName,patronymic,id));

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void userDelete(Long id) {
        for (User item:this.users) {
            if(item instanceof Student){
                if(id.equals(((Student)item).getStudentId())){
                    this.users.remove(item);
                }
            }
        }
    }
}
