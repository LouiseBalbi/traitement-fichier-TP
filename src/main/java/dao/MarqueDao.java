package dao;

import java.util.List;

import entites.Marque;

public interface MarqueDao {
	
	void insert(Marque marque);
	int update(String ancienNom, String nouveauNom);
	boolean delete(Marque marque);

}
