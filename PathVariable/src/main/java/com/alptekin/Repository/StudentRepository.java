package com.alptekin.Repository;

import com.alptekin.Entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentRepository {


    private ArrayList<StudentEntity> StudentList = new ArrayList<>();

    public StudentRepository(){
        StudentList.add(new StudentEntity(137, "John Becj", "11/d", 16, "4.8"));
        StudentList.add(new StudentEntity(578, "Deny Area", "11/a", 17, "4.9"));
        StudentList.add(new StudentEntity(242, "Pariah Ceak", "12/a", 18, "4.4"));
        StudentList.add(new StudentEntity(747, "Ned Brown", "9/d", 15, "3.2"));
        StudentList.add(new StudentEntity(187, "Semial Delight", "10/c", 16, "5.0"));
        StudentList.add(new StudentEntity(211, "Manuel Neur", "11/b", 17, "3.9"));
    }

    public StudentEntity getStudentByNumber(int number) {
        for(StudentEntity findStudent : StudentList ){
            if (findStudent.getStudentNo() == number) {
                return findStudent;
            }
        }
        return null;
    }
}
