package com.example.helloworld.db;

import com.example.helloworld.core.Person;
import com.example.helloworld.mapper.PersonMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(PersonMapper.class)
public interface PersonDAO {

    @SqlQuery("SELECT * FROM people WHERE id = :id")
    Person findById(@Bind("id") long id);

    @SqlUpdate("INSERT INTO people (id, fullName, jobTitle) VALUES (:id, :fullName, :jobTitle)")
    int create(@Bind("id") Long id, @Bind("fullName") String fullName, @Bind("jobTitle") String jobTitle);

    @SqlQuery("SELECT * FROM people")
    List<Person> findAll();

}
