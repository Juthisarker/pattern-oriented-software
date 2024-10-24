package Sorter;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSorter implements Sorter {

    @Override
    public List<Student> sort(List<Student> list) {
       // return List.of();
        Collections.sort(list, new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
           return o1.getMatriculationNumber().compareTo(o2.getMatriculationNumber());
            }
        });
        return list;
    }
}
