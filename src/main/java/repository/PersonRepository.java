package repository;

import entity.Coin;
import entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    @Query("select p from Person p where c.id = :id")
    Person findPersonById(@Param(("id")) Integer id);
}
