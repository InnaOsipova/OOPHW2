package ru.gd.oseminar.service;



import ru.gd.oseminar.data.StudyGroup;
import ru.gd.oseminar.data.Ticher;
import ru.gd.oseminar.data.User;

import java.util.ArrayList;

import java.util.List;


public class StudyGroupServis {
    private List<StudyGroup> studyGroup;

    public StudyGroupServis() {
        this.studyGroup = new ArrayList<>();
    }

    public void getGroup(List<User> ticherList, List<User> studentList) {

        Long id = 0L;
        int maxgroup = 4;
        int m = studentList.size() / maxgroup;
        if (studentList.size() % maxgroup != 0) {
            m++;
        }
        List<User>[] partition = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            int fromIndex = i * maxgroup;
            int toIndex = (i * maxgroup + maxgroup < studentList.size()) ? (i * maxgroup + maxgroup) : studentList.size();

            partition[i] = new ArrayList(studentList.subList(fromIndex, toIndex));
        }
       int i = 0;

        for (User ticher : ticherList) {
            if (ticher instanceof Ticher) {
                for (StudyGroup item : this.studyGroup) {
                    if (id > ((StudyGroup) item).getGroupId()) {
                        id = ((StudyGroup) item).getGroupId();
                        }
                    }
                }

            this.studyGroup.add(new StudyGroup(ticher, partition[i], ++id));
            i++;
        }
    }


    public List<StudyGroup> getAll() {
        return this.studyGroup;
    }


}
