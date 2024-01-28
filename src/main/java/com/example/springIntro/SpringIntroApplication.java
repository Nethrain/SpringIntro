 package com.example.springIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 @SpringBootApplication
public class SpringIntroApplication {

	// Önemli olan - yazılımda değişime direnç göstermeyen kodlama yapmaktır.
	// IoC - Inversion of Control : Birbirin alternatifi olan işleri yönetiyorsunuz. (IoC'nin temelini Dependecy Injection oluşturur)
	// Sphagetti kod
	// SOLUD Prensipleri - Open Closed Principle
		//Open Closed Principle : Yeni bir kod eklediğinde eski koda hiçbir şekilde dokunamazsın


	// Yazılım insanların günlük aktivitelerini bilgisayar desteğiyle kolaylaştırmaktır.
 	// - Off the Record


	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);


		// Spring'in ilk implementasyonunu sağladık.
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();



		//CustomerManager manager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		//manager.add();

	}
}
