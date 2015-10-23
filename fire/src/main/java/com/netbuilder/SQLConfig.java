package com.netbuilder;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Configuration
@EnableTransactionManagement
public class SQLConfig {

	
	@Bean
    public DataSource dataSource()
    {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("mydb");
        dataSource.setUser("root");
        dataSource.setPassword("password");
        dataSource.setServerName("10.50.15.25");
        return dataSource;
    }
	
	

}
