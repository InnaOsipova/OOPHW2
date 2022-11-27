package ru.gd.oseminar.data;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getLastName().equalsIgnoreCase(o2.getLastName())){
            return o1.getFirsNname().compareTo(o2.getFirsNname());
        }
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
