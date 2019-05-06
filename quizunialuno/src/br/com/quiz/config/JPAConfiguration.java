package br.com.quiz.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@EnableTransactionManagement
public class JPAConfiguration {

	@Bean
	@Profile("dsv")
	public DataSource dataSourceDev() throws PropertyVetoException {		
				
		// C3p0
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");		
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db_quizunialuno");
		dataSource.setUser("root");
		dataSource.setPassword("developer");		
		
		dataSource.setMinPoolSize(5);		
		dataSource.setMaxPoolSize(500);		
		
		dataSource.setCheckoutTimeout(120);
		dataSource.setIdleConnectionTestPeriod(820);
		
		dataSource.setAcquireIncrement(5);		
		dataSource.setNumHelperThreads(5);	
				
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
									   	
		factoryBean.setPackagesToScan("br.com.quiz.model");
		factoryBean.setJpaProperties(additionalProperties());	
		
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factoryBean.setDataSource(dataSource);			
		
		return factoryBean;
	}	
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf){
		JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	
	private Properties additionalProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");		
		props.setProperty("hibernate.show_sql", "true");	
	
		return props;
	}	
	
}
