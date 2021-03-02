package com.crm.web;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;




@Configuration
public class Conection {
	
	
	 public static final String REST_SERVICE_URL = "https://192.168.10.3:50000/b1s/v1/Login";

	RestTemplate restTemplate;

	 public void sendUserId(){

	     MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
	     map.add("CompanyDB", "SURTITODO");
	     map.add("Password", "x3245");
	     map.add("UserName", "manager");
	     restTemplate.postForObject(REST_SERVICE_URL, map, null);
	     }
   
	 @Bean
	public DriverManagerDataSource conec() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://localhost;databasename=SURTITODOWEB");
		dataSource.setUsername("sa");
		dataSource.setPassword("medellin2021");
		return dataSource;
	}
	 
	
	
	
	
	

}
