package dao;

import java.util.List;

import entites.Additif;

public interface AdditifDao {
	
	void insert(Additif additif);
	int update(String ancienNom, String nouveauNom);
	boolean delete(Additif additif);

}
