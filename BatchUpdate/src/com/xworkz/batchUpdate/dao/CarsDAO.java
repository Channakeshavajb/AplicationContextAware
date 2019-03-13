package com.xworkz.batchUpdate.dao;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicComboBoxUI.ListDataHandler;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.batchUpdate.dto.CarsDTO;
import com.xworkz.hibernate.util.HibernateUtil;

public class CarsDAO {

	public CarsDAO() {
		// TODO Auto-generated constructor stub
	}

	public void save(List<CarsDTO> cars) {
		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.getFactory().openSession();
			tx = session.beginTransaction();
			int i = 0;
			for (CarsDTO carsDTO : cars) {
				i++;
				session.save(carsDTO);
				System.out.println(carsDTO);
				if (i % 5 == 0) {
					System.out.println("flushing ");

					session.flush();
					session.clear();
					// i=0;
				}
			}
			tx.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
			System.out.println("exception saving data: \t");
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
