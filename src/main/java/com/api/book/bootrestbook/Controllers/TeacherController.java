package com.api.book.bootrestbook.Controllers;

import java.util.List;
import java.util.Optional;

import com.api.book.bootrestbook.Controllers.Services.TeacherService;
import com.api.book.bootrestbook.Controllers.model.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    //Teachers
    @GetMapping("/teacher")
    public ResponseEntity<List<Teacher>> getTeacher() {
        List<Teacher> list = this.teacherService.getAllTeachers();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

    // get single book handler
    @GetMapping("/teacher/{tid}")
    public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid) {
        Teacher teacher = teacherService.getTeacherByTid(tid);
        if (teacher == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(teacher));
    }

    // add Book
    @PostMapping("/teacher")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        Teacher t = null;
        try {
            t = this.teacherService.addTeacher(teacher);
            return ResponseEntity.of(Optional.of(t));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    //Total - teachers
    @GetMapping("/total-teachers")
    public String Total() {
        List<Teacher> list = this.teacherService.getAllTeachers();
        int count=list.size();
    
        
        return "Teacher : "+String.valueOf(count);
    }
    // delete book handler
    @DeleteMapping("/teacher/{teacherId}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable("teacherId") int teacherId) {
        try {
            this.teacherService.deleteTeacher(teacherId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // update book handler
    @PutMapping("/teacher/{teacherId}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable("teacherId") int teacherId) {
        this.teacherService.updateTeacher(teacher, teacherId);
        return teacher;
    }
}
