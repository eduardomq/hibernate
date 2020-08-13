package com.codelab.hibernatedemo.repository;

import com.codelab.hibernatedemo.entity.Phone;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PhoneRepository extends CrudRepository<Phone, Long> {
    List<Phone> findByOs(String os);
    Phone findById(long id);
}
