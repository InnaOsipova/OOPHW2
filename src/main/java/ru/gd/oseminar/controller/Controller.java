package ru.gd.oseminar.controller;

import ru.gd.oseminar.data.*;
import ru.gd.oseminar.service.StudyGroupServis;
import ru.gd.oseminar.service.TicherServise;
import ru.gd.oseminar.service.UserService;
import ru.gd.oseminar.view.StudentView;

import java.util.*;

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
    public void printSortGroup(){
        List<User> listStudents = userService.getAll();
        List<StudyGroup> studyGroups = studyGroupServis.getAll();

        Map<User, Long> result = new TreeMap<>(new StudyGroupComparator());
        Long id = 0L;
        for (StudyGroup group:studyGroups) {
            id = group.getGroupId();
            for (User student: group.getStudents()) {
                result.put(student,id);

            }

            //if(!Collections.disjoint(group.getStudents(), listStudents)) {
            //for (User student: listStudents) {
            //    if(student.equals(result.))

           // }
            //System.out.println((List<User>) result.keySet());
            //Collections.sort((List<User>) result.keySet(), new StudyGroupComparator());
            //studentView.sandsSortOnConsole((List<User>) result.keySet(), result.get());
            //}

        }

        //System.out.println(result);
        studentView.sandsSortOnConsole(result);

    }

}
