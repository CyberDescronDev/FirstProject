package Project.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan ({"Project.FirstProject"})
@ComponentScan ({"Project.FirstProject.WepAPI.Controllers"})
@ComponentScan ({"Project.FirstProject.Business.Abstracts.PatientService"})
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FirstProjectApplication.class, args);
		

	}	

}
