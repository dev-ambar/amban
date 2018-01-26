/**
 * 
 */
package com.ankur.rsh;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Ankur
 *
 */
@SpringBootApplication
public class RSHApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("welcome");
		
		SpringApplication.run(RSHApplication.class, args);

	}
	
	
	@Bean
	public JdbcTemplate getJdbcTemplate(){	
		return new JdbcTemplate(getDataSource());
		
	}
	
	
	@Bean
	public DataSource getDataSource(){	
		return new BasicDataSource();
		
	}

}
