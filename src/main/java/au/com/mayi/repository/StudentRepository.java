package au.com.mayi.repository;

import au.com.mayi.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by agrawald on 2019-07-18.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}

