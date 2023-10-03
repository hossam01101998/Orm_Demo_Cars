package be.ehb.ormdemo.model;

import org.springframework.data.repository.CrudRepository;

public interface CarDAO extends CrudRepository<Car, Integer> {
}
