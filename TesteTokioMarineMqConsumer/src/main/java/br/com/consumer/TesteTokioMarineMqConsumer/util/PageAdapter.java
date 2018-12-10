package br.com.consumer.TesteTokioMarineMqConsumer.util;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class PageAdapter extends WebMvcConfigurerAdapter{

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		
		PageableHandlerMethodArgumentResolver pageable = new PageableHandlerMethodArgumentResolver();
		PageRequest pageAndSise = new PageRequest(0, 5);
		pageable.setFallbackPageable(pageAndSise);
		argumentResolvers.add(pageable);
	} 
	
}
