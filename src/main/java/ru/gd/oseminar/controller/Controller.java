package ru.gd.oseminar.controller;

import ru.gd.oseminar.data.StudyGroup;
import ru.gd.oseminar.data.Ticher;
import ru.gd.oseminar.data.User;
import ru.gd.oseminar.service.StudyGroupServis;
import ru.gd.oseminar.service.TicherServise;
import ru.gd.oseminar.service.UserService;
import ru.gd.oseminar.view.StudentView;

import java.util.List;

public class Controller{
    private final UserService  userService = new UserService();
    private final StudentView studentView = new StudentView();
    private final TicherServise ticherServise = new TicherServise();
    private  final  StudyGroupServis studyGroupServis = new StudyGroupServis();


    public void createStudent(String firsNname, String lastName, String patronymic) {
        userService.userCreate(firsNname, lastName, patronymic);
    }
    public void printSudents (){
    List<User> student = userService.getAll();
        studentView.sandOnConsole(student);
    }
    public void createTicher(String firsNname, String lastName, String patronymic) {
        ticherServise.userCreate(firsNname, lastName, patronymic);
    }

    public void printTichers (){
        List<User> ticher = ticherServise.getAll();
        studentView.sandOnConsole(ticher);
    }
    public void createGroup() {
        List<User> ticher = ticherServise.getAll();
        List<User> student = userService.getAll();
        studyGroupServis.getGroup(ticher,student);
    }
    public void printGroup (){
        List<StudyGroup> groups = studyGroupServis.getAll();
        studentView.sandOnConsoleGroup(groups);
    }

}
