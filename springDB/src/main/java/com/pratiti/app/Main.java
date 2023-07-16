package com.pratiti.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.component.CarPart;
import com.pratiti.component.CarPartsInventory;

public class Main {
	public static void main(String[] args) {

//		NORMAL OLD METHOD OF OBJECT CREATION
//		CarPartsInventoryImpl1 obj = new CarPartsInventoryImpl1();

//		OBJECT CREATION USING Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myXMLfile.xml");
		CarPartsInventory obj = (CarPartsInventory) ctx.getBean("carPA4");
	

//		CarPart carPart = new CarPart();
//		carPart.setCarModel("model15");
//		carPart.setPartName("part15");
//		carPart.setPartNo(15);
//		carPart.setPrice(22224);
//		carPart.setQuantity(150);
//		obj.addNewPart(carPart);

		
		List<CarPart> ls = obj.getAvailableParts();
		System.out.println("ID     part    model     price    Quantity");
		for(CarPart cp:ls) {
			System.out.print(cp.getPartNo());
			System.out.print("    "+cp.getPartName());
			System.out.print("    "+cp.getCarModel());
			System.out.print("    "+cp.getPrice());
			System.out.println("    "+cp.getQuantity());
		}
		

		


	}
}
