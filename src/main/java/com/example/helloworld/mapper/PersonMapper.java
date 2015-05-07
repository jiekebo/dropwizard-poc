package com.example.helloworld.mapper;

import com.example.helloworld.core.Person;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements ResultSetMapper<Person> {

    @Override
    public Person map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Person(resultSet.getInt("id"), resultSet.getString("fullName"), resultSet.getString("jobTitle"));
    }

}