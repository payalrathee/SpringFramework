package configurations;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import beans.User;
import interceptors.AuthInterceptor;
import services.UserService;

@EnableWebMvc
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="controllers, repositories, services, utilities")
public class ApplicationConfig implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
			.addResourceHandler("/resources/**")
			.addResourceLocations("/resources/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
			.addInterceptor(new AuthInterceptor())
			.addPathPatterns("/**")
			.excludePathPatterns("/")
			.excludePathPatterns("/home")
			.excludePathPatterns("/resources/**")
			.excludePathPatterns("/user/register")
			.excludePathPatterns("/user/login");
	}



	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/demo?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(dataSource());
		sf.setAnnotatedClasses(User.class);
		
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		sf.setHibernateProperties(props);
		
		return sf;
	}
	
	@Bean
	public HibernateTemplate hibernateTemplate() {
		
		HibernateTemplate ht = new HibernateTemplate();
		ht.setSessionFactory(sessionFactory().getObject());

		return ht;
	}
	
	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sessionFactory().getObject());
		return htm;
	}

}
