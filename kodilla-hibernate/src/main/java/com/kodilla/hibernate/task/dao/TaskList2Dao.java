package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task2List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface TaskList2Dao extends CrudRepository<Task2List, Integer> {

}