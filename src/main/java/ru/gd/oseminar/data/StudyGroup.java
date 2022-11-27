package ru.gd.oseminar.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudyGroup {
    private User ticher;
    private Long groupId;
    private List<User> students;

    public StudyGroup(User ticher, List<User> students,Long groupId) {
        this.ticher = ticher;
        this.students = students;
        this.groupId = groupId;
    }

    public User getTicher() {
        return ticher;
    }

    public void setTicher(Ticher ticher) {
        this.ticher = ticher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "ticher=" + ticher +
                ", groupId=" + groupId +
                ", students=" + students +
                '}';
    }
}
