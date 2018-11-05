package lk.hdconstructions.erp.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import lk.hdconstructions.erp.models.Construction;
import lk.hdconstructions.erp.models.Customer;


public class ConstructionDAOTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Customer customer  = null;
//		try {
//			customer = CustomerDAO.getCustomerByNIC("961264022V");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		
//		Construction construction = new Construction(1, "Test construction",1232134, "123, BumbleB");
//		construction.setCustomer(customer);
//		
//		try {
//			ConstructionDAO.addNewConstruction(construction);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		
//		try{
//			ArrayList<Construction> constructions = ConstructionDAO.getAllConstructions();
//			
//			for(Construction construction: constructions) {
//				System.out.println(construction.getProjectName()+": "+construction.getAddress());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
//		try {
//			ConstructionDAO.deleteConstruction(1);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	Construction construction = new Construction(12312,"kjbn",878090,"goodworm");
//		
//		
////		
		try {
			ConstructionDAO.addNewConstruction(construction);
		
//			construction.setPrice(10000000);
//			ConstructionDAO.updateConstruction(construction);
//			
//			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
////		
//
//		
	}

}
