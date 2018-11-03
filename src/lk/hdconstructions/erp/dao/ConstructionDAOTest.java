package lk.hdconstructions.erp.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import lk.hdconstructions.erp.models.Construction;


public class ConstructionDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Construction construction = new Construction(1, "Test construction", "123, BumbleB", "Pull down a house", "Blah blah blah");
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
//		try {
//			ArrayList<Construction> constructions = ConstructionDAO.getAllConstructions();
//			
//			for(Construction construction: constructions) {
//				System.out.println(construction.getName()+": "+construction.getAddress());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		try {
			ConstructionDAO.deleteConstruction(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
