package com.api.book.bootrestbook.Controllers.Services;

import java.util.List;

import com.api.book.bootrestbook.Controllers.model.Teacher;
import com.api.book.bootrestbook.dao.TeacherRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    // getAll Teacher
    public List<Teacher> getAllTeachers() {
        // database connectivity
        List<Teacher> list = (List<Teacher>) this.teacherRepo.findAll();
        return list;
    }

    // get Single Book
    public Teacher getTeacherByTid(int tid) {
        Teacher teacher = null;
        // Book id match using lambda functon
        try {
            teacher = this.teacherRepo.findByTid(tid);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return teacher;
    }

    public Teacher addTeacher(Teacher t) {
        Teacher result = teacherRepo.save(t);
        return result;
    }

    public void deleteTeacher(int bid) {
        teacherRepo.deleteById(bid);
    }

    // update the book
    public void updateTeacher(Teacher teacher, int teacherId) {
        teacher.setTid(teacherId);
        teacherRepo.save(teacher);
    }
}
