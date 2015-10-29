package com.netbuilder.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netbuilder.DataConfig;
import com.netbuilder.RepositoryConfig;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Basket;
import com.netbuilder.entities.Customer;
import com.netbuilder.entities.Payment;
import com.netbuilder.entities.Product;
import com.netbuilder.entityrepositories.AddressRepository;
import com.netbuilder.entityrepositories.BasketRepository;
import com.netbuilder.entityrepositories.CustomerRepository;
import com.netbuilder.entityrepositories.PaymentRepository;
import com.netbuilder.entityrepositories.ProductRepository;

@Controller
public class AboutController {
		
	ApplicationContext mongoContext = new AnnotationConfigApplicationContext(DataConfig.class, RepositoryConfig.class);
	ProductRepository productRepository = mongoContext.getBean(ProductRepository.class);	
	AddressRepository addressRepository = mongoContext.getBean(AddressRepository.class);	
	PaymentRepository paymentRepository = mongoContext.getBean(PaymentRepository.class);
	CustomerRepository customerRepository = mongoContext.getBean(CustomerRepository.class);
	BasketRepository basketRepository = mongoContext.getBean(BasketRepository.class);
	
	 @RequestMapping("About")
	 public String about(ModelAndView modelAndView) {
		 	 
		/*//Products
		 productRepository.insert(new Product(1,15,32.00F,"Gnome","Godzilla",false,true, 1, "Godzilla Gnome, large with small arms","godzilla.jpg", true, 5.50F));
		 productRepository.insert(new Product(2,3,60.00F,"Gnome","Fisherman",false,true, 3, "Fishing Gnome, has a small rod","fisherman.jpg"));
		 productRepository.insert(new Product(3,8,50.20F,"Gnome","Gnomeo",false,true, 2, "The first of the Shakes-pair","gnomeojuliett.jpg"));
		 productRepository.insert(new Product(4,27,16.00F,"Gnome","Juliett",false,true, 5, "The second of the Shakes-pair","gnomeojuliett.jpg"));
		 productRepository.insert(new Product(5,4,6.00F,"Garden Accessory","Kitsch Bench",false,true, 5, "Tacky but comfortable","bench.jpg",true, 1.50F));
		 productRepository.insert(new Product(6,33,72.00F,"Miscellaneous","Fridge Magnet",false,true, 4, "NBGardens luxury fridge customisation","fridge.jpg"));
		 productRepository.insert(new Product(7,50,31.00F,"Gnome","Gnight Watchman",false,true, 2, "A garden gnome with a helpful lantern","watchman.jpg"));
		 productRepository.insert(new Product(8,2,90.00F,"Garden Accessory","Lawn Chair",false,true, 3, "Place it on grass and park your... behind","chair.jpg"));
		 productRepository.insert(new Product(9,7,46.00F,"Gnome","Harry Gnome",false,true, 5, "Family favourite, has a large beard","harry.jpg"));
		 productRepository.insert(new Product(10,16,62.00F,"Garden Accessory","Plant Pot",false,true, 1, "What's a garden without potted plants?","pot.jpg", true,31.00F));
		 productRepository.insert(new Product(11,22,3.00F,"Garden Accessory","Wooden Shed",false,true, 2, "Store tools, hide bodies. Multifunctional.","shed.jpg"));
		 productRepository.insert(new Product(12,13,19.00F,"Gnome","Frankengnome",false,true, 1, "Reconstructed from factory breakages. Recycled for your pleasure.","frankengnome.jpg"));
		 productRepository.insert(new Product(13,37,12.00F,"Miscellaneous","Trowel",false,true, 5, "For when a spade is just too big","trowel.jpg"));
		 productRepository.insert(new Product(14,42,55.00F,"Gnome","Fat Gnome",false,true, 4, "Weighted to prevent damage in high winds","fat.jpg"));
		 productRepository.insert(new Product(15,2,10.50F,"Miscellaneous","'Keep off the Grass' Sign",false,true, 3, "Don't put it on the grass or you'll look like a hypocrite","keepoff.jpg"));
		 productRepository.insert(new Product(16,6,77.00F,"Gnome","Scuba Gnome",false,true, 4, "Got a pond and love gnomes? Why not zoidberg?","scuba.jpg"));
		 productRepository.insert(new Product(17,25,19.00F,"Garden Accessory","Tyre Swing",false,true, 4, "Tired of slides? You wont tire of Tyres","tyre.jpg", true, 15.00F));
		 productRepository.insert(new Product(18,14,84.00F,"Gnome","Gnome in the North",false,true, 5, "Beard grows when winter is coming","north.jpg"));
		 productRepository.insert(new Product(19,17,40.80F,"Miscellaneous","Garden Gloves",false,true, 2, "Protecting delicate hands from rough gardens","gloves.jpg"));
		 productRepository.insert(new Product(20,21,51.00F,"Miscellaneous","Tent",false,true, 3, "For the less adventurous looking to go camping","tent.jpg"));

		 //Customers
		 customerRepository.insert(new Customer(1, "01543566778", 567.0F, "Frankie Fergerson", "frankfergy123@hotmail.com", "user", "pass", "Email"));
		 customerRepository.insert(new Customer(2, "01234234765", 856.0F, "Pete Pewpewman", "pewpew22@gmail.com", "pp22", "pass", "Phone"));
		 customerRepository.insert(new Customer(3, "06525234536", 423.0F, "Davie Goodman", "th3flash@hotmail.com", "flash", "pass", "Phone"));
		 customerRepository.insert(new Customer(4, "08569454568", 21.0F, "Vinny T. Tommygun", "the0phallus@yahoo.com", "vicky", "pass", "Email"));
		 customerRepository.insert(new Customer(5, "09534574565", 989.0F, "Sarah Spin", "sra.spin@gmail.com", "spin", "pass", "Email"));

		 //Addresses
		 addressRepository.insert(new Address(1,"53 Key Crescent", "E66 6ST", 1)) ;
		 addressRepository.insert(new Address(2,"123 Mango Avenue", "WS11 8FP", 1)) ;
		 addressRepository.insert(new Address(3,"42 Rosebud Road", "ST4 1JX", 1)) ;
		 addressRepository.insert(new Address(4,"52 Haggered Place", "W3 1JX", 2)) ;
		 addressRepository.insert(new Address(5,"67 Juries Corner", "NW2 4RF", 3)) ;
		 addressRepository.insert(new Address(6,"36 Green Fields", "BH1 3FR", 4)) ;
		 addressRepository.insert(new Address(7,"88 Windmill Drive", "EX7 7TU", 5)) ;
		 //Payment Methods
		 paymentRepository.insert(new Payment (1, 978923, "76-26-46",1));
		 paymentRepository.insert(new Payment (2, 345325, "09-72-23",1));
		 paymentRepository.insert(new Payment (3, 234532, "10-24-83",2));
		 
		 //Basket Lines
		
		 basketRepository.insert(new Basket(1,productRepository.findByProductID(2), 13, 1));
		 basketRepository.insert(new Basket(2,productRepository.findByProductID(9), 2, 1));
		 basketRepository.insert(new Basket(3,productRepository.findByProductID(3), 27, 1));
		 basketRepository.insert(new Basket(4,productRepository.findByProductID(13), 6, 2));
		 basketRepository.insert(new Basket(5,productRepository.findByProductID(18), 10, 3));*/
			return "About";
	 }
}
