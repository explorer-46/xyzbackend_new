package com.nestdigital.xyzbackendappnew.Dao;

import com.nestdigital.xyzbackendappnew.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao  extends CrudRepository<StudentModel,Integer> {
}
