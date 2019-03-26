package br.com.quiz.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = {"br.com.quiz"})
public class AppWebConfiguration implements WebMvcConfigurer {
    
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
						
		return resolver;
	}	
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/WEB-INF/messages");
        messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);
        return messageSource;
	}
	
	@Bean
	public MultipartResolver multipartResolver(){				
		return new StandardServletMultipartResolver();
	}
	
	@Bean
	public RequestMappingHandlerMapping requestMappingHandlerMapping(){		
		return new RequestMappingHandlerMapping();
	}
	
	@Bean
	public RequestMappingHandlerAdapter requestMappingHandlerAdapter(){
		return new RequestMappingHandlerAdapter();
	}
		
	@Bean
	public LocaleResolver localeResolver(){				 
		return new CookieLocaleResolver();
	}
		
	@Bean
	public OpenEntityManagerInViewInterceptor getOpenEntityManagerInViewInterceptor() {
		return new OpenEntityManagerInViewInterceptor();
	}	
	
	@Bean
	public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
		List<ViewResolver> viewResolvers = new ArrayList<>(); 
		viewResolvers.add(internalResourceViewResolver());
		viewResolvers.add(new XmlViewResolver());
		
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();		
		resolver.setViewResolvers(viewResolvers);
		resolver.setContentNegotiationManager(manager);	
		
		return resolver;
	} 
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addWebRequestInterceptor(getOpenEntityManagerInViewInterceptor());
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
	}	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
		
}
