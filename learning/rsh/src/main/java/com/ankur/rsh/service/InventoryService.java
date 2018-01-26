/**
 * 
 */
package com.ankur.rsh.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankur.rsh.model.Inventory;
import com.ankur.rsh.repository.InventoryRepository;

/**
 * @author Ankur
 *
 */
@Service
public class InventoryService {
	
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	
	
/*	public List<String>  getInventoryList(){
		System.out.println("Inventory Service");
		return inventoryRepository.getInventoryList();
		
	}*/
	
	
public Inventory  getInventoryById(String id){
		
		return inventoryRepository.getInventoryById(id);
		
	}


public void createInventory(Inventory inventory) {
	inventoryRepository.createInventory(inventory);
	
}


public Collection<Inventory> getAllInventory() {
	// TODO Auto-generated method stub
	return inventoryRepository.getAllInventory();
}


public void updateInventory(Inventory inventory) {
 inventoryRepository.updateInventory(inventory);
	
}

}
