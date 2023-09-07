package com.example.jbdsapi.repository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

@Repository
//@RequiredArgsConstructor
public class BaseConnectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String sqlFile = "ScriptToFindToName.sql";
    public List<String> getProductName(String name){
//        String sql1 = "select product_name from orders\n" +
//                "join custumers ON custumers.id = orders.costumer_id \n" +
//                "where lower(custumers.name)  = lower(name := name);";


        String sql2= "select product_name from orders\n" +
                "join custumers ON custumers.id = orders.costumer_id \n" +
                "where lower(custumers.name)  = 'alexey';";

        final List<String> productsWithNamed = jdbcTemplate.queryForList(sql2, String.class);
        return productsWithNamed ;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
