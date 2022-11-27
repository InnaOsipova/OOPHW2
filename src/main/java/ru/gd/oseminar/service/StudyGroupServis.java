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

    public void getGroup(List<User> ticherList, List<User> studentList){

        Long id =0L;
        for (User ticher: ticherList) {
            if (ticher instanceof Ticher){
            for (StudyGroup item:this.studyGroup) {
                 if(id>((StudyGroup)item).getGroupId()){
                    id = ((StudyGroup)item).getGroupId();
                 }
            }}

            this.studyGroup.add(new StudyGroup(ticher,studentList,++id));
        }

    }
    public List<StudyGroup> getAll() {
        return this.studyGroup;
    }


}
