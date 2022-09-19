package com.guptastore.gupta;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GuptaApplication 
//implements CommandLineRunner 
{
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(GuptaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql="Select * from course";
//		List<Course> course = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Course.class));
//		course.forEach(System.out :: println);
//	}

}

