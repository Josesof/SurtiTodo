package com.crm.web;


import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyComponentPathImpl;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyHbmImpl;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.registry.selector.internal.StrategySelectorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmWeb2021Application  {

	public static void main(String[] args) {
		SpringApplication.run(CrmWeb2021Application.class, args);
		
		System.out.println("CRM-WEB CORRIENDO DE MANERA CORRECTA");
	}
	
	@SuppressWarnings("unused")
	private void addImplicitNamingStrategies(StrategySelectorImpl strategySelector) {
	    strategySelector.registerStrategyImplementor(ImplicitNamingStrategy.class, "default", ImplicitNamingStrategyJpaCompliantImpl.class);
	    strategySelector.registerStrategyImplementor(ImplicitNamingStrategy.class, "jpa", ImplicitNamingStrategyJpaCompliantImpl.class);
	    strategySelector.registerStrategyImplementor(ImplicitNamingStrategy.class, "legacy-jpa", ImplicitNamingStrategyLegacyJpaImpl.class);
	    strategySelector.registerStrategyImplementor(ImplicitNamingStrategy.class, "legacy-hbm", ImplicitNamingStrategyLegacyHbmImpl.class);
	    strategySelector.registerStrategyImplementor(ImplicitNamingStrategy.class, "component-path", ImplicitNamingStrategyComponentPathImpl.class);
	}

}
