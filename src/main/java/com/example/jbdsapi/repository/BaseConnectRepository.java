package com.example.jbdsapi.repository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
//@RequiredArgsConstructor
public class BaseConnectRepository {

//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String sqlFile = "ScriptToFindToName.sql";
    public List<ProductNameMapper> getProductName(String name){
        Map<String, Object> mapOfRequest = new HashMap<>();
        mapOfRequest.put("name", name);

//        List<String> result =  namedParameterJdbcTemplate.query(
//                read(sqlFile),
//                mapOfRequest,
//                (rs,rowNow) ->{
//                    String productName = rs.getString("product_name");
//                    System.out.println(productName);
//                    return new String(productName);
//                }
//                );

//        List<String> s2 = jdbcTemplate.query("select product_name from orders" +
//                " join custumers ON custumers.id = orders.costumer_id" +
//                " where lower(custumers.name) = lower(name = ?);",
//                (rs,rowNum)->{
//                String s =  rs.getString("product_name");
//                return s;
//                },
//                "Nastya");

        String sql = "select product_name from orders\n" +
                "join custumers ON custumers.id = orders.costumer_id \n" +
                "where lower(custumers.name)  = lower('Nastya');";
        List<ProductNameMapper> s2 =  jdbcTemplate.query(sql,
                (resultSet, rowNum) -> {
                    ProductNameMapper productName = new ProductNameMapper();
                    productName.setName(resultSet.getString("product_name"));
                    return productName;
                });
        System.out.println(s2);
        return s2;
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
