package com.xworkz.batchUpdate.tester;

import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.batchUpdate.dao.CarsDAO;
import com.xworkz.batchUpdate.dto.CarsDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsDTO dto = new CarsDTO();
		
		dto.setName("rangerover");
		 dto.setCompany("landRover");
		 dto.setNoOfSeat(5);
		 dto.setPrice(52144556666544l);
		 dto.setAutoGear(true);
		 dto.setSunRoof(true);
		 
		 CarsDTO dto12 = new CarsDTO();
			
			dto12.setName("phantom");
			 dto12.setCompany("rolls-roys");
			 dto12.setNoOfSeat(5);
			 dto12.setPrice(52144556666544l);
			 dto12.setAutoGear(true);
			 dto12.setSunRoof(true);
			 
			 CarsDTO dto1 = new CarsDTO();
				
				dto1.setName("scorpio");
				 dto1.setCompany("mahindra");
				 dto1.setNoOfSeat(8);
				 dto1.setPrice(52144556666544l);
				 dto1.setAutoGear(false);
				 dto1.setSunRoof(false);
				 
				 CarsDTO dto2 = new CarsDTO();
					
					dto2.setName("verna");
					 dto2.setCompany("huyndai");
					 dto2.setNoOfSeat(5);
					 dto2.setPrice(52144556666544l);
					 dto2.setAutoGear(true);
					 dto2.setSunRoof(true);
					 
					 CarsDTO dto3 = new CarsDTO();
						
						dto3.setName("innova");
						 dto3.setCompany("toyota");
						 dto3.setNoOfSeat(7);
						 dto3.setPrice(52144556666544l);
						 dto3.setAutoGear(false);
						 dto3.setSunRoof(false);
						 
						 CarsDTO dto4 = new CarsDTO();
							
							dto4.setName("fortuner");
							 dto4.setCompany("toyota");
							 dto4.setNoOfSeat(7);
							 dto4.setPrice(52144556666544l);
							 dto4.setAutoGear(false);
							 dto4.setSunRoof(false);
							 
							 CarsDTO dto5 = new CarsDTO();
								
								dto5.setName("x90");
								 dto5.setCompany("volvo");
								 dto5.setNoOfSeat(7);
								 dto5.setPrice(52144556666544l);
								 dto5.setAutoGear(false);
								 dto5.setSunRoof(false);
								 
								 CarsDTO dto6 = new CarsDTO();
									
									dto6.setName("s-class");
									 dto6.setCompany("mercedes-benz");
									 dto6.setNoOfSeat(5);
									 dto6.setPrice(52144556666544l);
									 dto6.setAutoGear(true);
									 dto6.setSunRoof(true);
									 
									 CarsDTO dto7 = new CarsDTO();
										
										dto7.setName("x7");
										 dto7.setCompany("bmw");
										 dto7.setNoOfSeat(7);
										 dto7.setPrice(52144556666544l);
										 dto7.setAutoGear(false);
										 dto7.setSunRoof(true);
										 
										 CarsDTO dto8 = new CarsDTO();
											
											dto8.setName("q7");
											 dto8.setCompany("audi");
											 dto8.setNoOfSeat(7);
											 dto8.setPrice(52144556666544l);
											 dto8.setAutoGear(false);
											 dto8.setSunRoof(true);
											 
											 CarsDTO dto9 = new CarsDTO();
												
												dto9.setName("xf");
												 dto9.setCompany("jaguar");
												 dto9.setNoOfSeat(5);
												 dto9.setPrice(52144556666544l);
												 dto9.setAutoGear(false);
												 dto9.setSunRoof(false);
												 
												 CarsDTO dto10 = new CarsDTO();
													
													dto10.setName("discovery");
													 dto10.setCompany("landRover");
													 dto10.setNoOfSeat(5);
													 dto10.setPrice(52144556666544l);
													 dto10.setAutoGear(false);
													 dto10.setSunRoof(true);
		
		 List<CarsDTO> ldto = new ArrayList<>();
		 ldto.add(dto12);
		 ldto.add(dto10);
		 ldto.add(dto9);
		 ldto.add(dto8);
		 ldto.add(dto7);
		 ldto.add(dto6);
		 ldto.add(dto5);
		 ldto.add(dto4);
		 ldto.add(dto3);
		 ldto.add(dto2);
		 ldto.add(dto1);
		
		CarsDAO dao = new CarsDAO();
		dao.save(ldto);
		HibernateUtil.getFactory().close();
	}

}
