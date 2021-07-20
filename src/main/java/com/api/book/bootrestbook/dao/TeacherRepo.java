package com.api.book.bootrestbook.dao;

import com.api.book.bootrestbook.Controllers.model.Teacher;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher,Integer> {
    public Teacher findByTid(int tid);
}
