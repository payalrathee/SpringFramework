package p;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("p")
public class ConfigFile {
    @Bean("adr")
    public Address getAddress()
    {
        return new Address("Rohtak");
    }
    @Bean("emp")
    public Employee getEmployee()
    {
        return new Employee(1,"Jiya",getAddress());
    }
}
