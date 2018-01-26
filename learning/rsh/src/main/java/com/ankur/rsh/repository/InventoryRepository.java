/**
 * 
 */
package com.ankur.rsh.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ankur.rsh.dao.InventoryDao;
import com.ankur.rsh.model.Inventory;

/**
 * @author Ankur
 *
 */

@Repository
public class InventoryRepository {
	
	
	@Autowired
	@Qualifier("db")
	InventoryDao inventoryDao;
	
	/*public List<String>  getInventoryList(){
		System.out.println("Inventory Repository");
		return inventoryDao.getInventoryList();
		
	}*/
	
	
	
	public Inventory  getInventoryById(String id){
		
		return inventoryDao.getInventoryById(id);
		
	}



	public void createInventory(Inventory inventory) {
		inventoryDao.createInventory(inventory);
		
	}



	public Collection<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		return inventoryDao.getAllInventory();
	}



	public void updateInventory(Inventory inventory) {
		inventoryDao.updateInventory(inventory);
		
	}

}
