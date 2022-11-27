package ru.gd.oseminar.view;

import ru.gd.oseminar.data.StudyGroup;
import ru.gd.oseminar.data.User;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sandOnConsole(List<User> users){

        for (User user: users) {
             System.out.println(user.toString());

        }
    }
    public void sandOnConsoleGroup (List<StudyGroup> studyGroups){
       for (StudyGroup group: studyGroups) {
            System.out.println(group.toString());
        }
    }

}
