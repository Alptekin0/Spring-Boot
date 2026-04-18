package com.alptekin.Repository;


import com.alptekin.Enitity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepository {

    ArrayList<Student> studentList = new ArrayList<>();

    public StudentRepository() {
        studentList.add(new Student(1, "Mary", "Jackson", 12));
        studentList.add(new Student(2, "Peter", "Pan", 12));
        studentList.add(new Student(3, "Suzi", "Ki", 12));
        studentList.add(new Student(4, "Cemal", "Brandon", 12));
        studentList.add(new Student(5, "Hemeli", "Pickson", 12));
    }

    public Boolean deleteStudent (int id) {
        for (int i = studentList.size() - 1; i >= 0 ; i--) {
            if (id == studentList.get(i).getId()){
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
}
