package com.alptekin.Controller;


import com.alptekin.Entity.StudentEntity;
import com.alptekin.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController (StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/getStudentByNumber/{Number}") //GetMapping içinde süslü parantez ile değer alınır
    public StudentEntity getStudentByNumber(@PathVariable(required = true) int Number) {
        return studentService.getStudentByNumber(Number);
    }

    // PathVariable, Kullancağımız class'ta parametre alınan yere yazılıp kullanılır.
    // @PathVariable int Number şeklinde direkt olarak alınabilir fakat alınan değere bazı özellikler atamak istiyrosak
    // @PathVariable(required = true, name = "id") int Number şeklinde tanımlanırız.
    // Yani aslında url'den gelen bir paramatredir ve tanımlanması @PathVariable int Number şeklinde yapılabilir.
    // Aynı zamanda parametre olarak PathVariable kullanıyorsak @GetMapping kısmında alıncak olan değişken
    // Adres kısmından sonra süslü parantez içinde belirtirlir. Gelen url'deki değer süslü parantez ile eşleşir.

}
