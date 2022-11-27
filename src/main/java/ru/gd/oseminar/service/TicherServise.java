package ru.gd.oseminar.service;

import ru.gd.oseminar.data.Student;
import ru.gd.oseminar.data.Ticher;
import ru.gd.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class TicherServise implements DataService{
    private final List<User> users;

    public TicherServise() {
        this.users = new ArrayList<>();
    }


    @Override
    public void userCreate(String firsNname, String lastName, String patronymic) {
        Long id =0L;
        for (User item:this.users) {
            if(item instanceof Ticher){
                if(id<((Ticher)item).getTicherId()){
                    id = ((Ticher)item).getTicherId();
                }
            }
        }
        this.users.add(new Ticher(firsNname,lastName,patronymic,++id));

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void userDelete(Long id) {
        for (User item:this.users) {
            if(item instanceof Ticher){
                if(id.equals(((Ticher)item).getTicherId())){
                    this.users.remove(item);
                }
            }
        }

    }
}
