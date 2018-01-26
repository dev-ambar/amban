/**
 * 
 */
package com.ankur.rsh.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ankur.rsh.model.Inventory;

/**
 * @author Ankur
 *
 */

@Component
@Qualifier("memory")
public class InMemoryInventoryDaoImpl implements InventoryDao {
	
	private static List<String> inventoryList = new ArrayList<String>();
	
	
	private static Map<String,Inventory> inventoryMap = new HashMap<String, Inventory>();
	
	static{
		inventoryList.add("Maida");
		inventoryList.add("Suger");
		inventoryList.add("Oil");
		
		
		///
		
		
		inventoryMap.put("1", new Inventory("1", "Maida"));
		inventoryMap.put("2", new Inventory("2", "Suger"));
		inventoryMap.put("3", new Inventory("3", "Oil"));
	}
	
	
	public List<String>  getInventoryList(){
		System.out.println("InMemory Inventory Dao");
		return inventoryList;
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#getAllInventory()
	 */
	public Collection<Inventory>  getAllInventory(){
		
		return inventoryMap.values();
		
	}
	
	
	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#getInventoryById(java.lang.String)
	 */
	public Inventory  getInventoryById(String id){
		
		return inventoryMap.get(id);
		
	}


	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#createInventory(com.ankur.rsh.model.Inventory)
	 */
	public void createInventory(Inventory inventory) {
		inventoryMap.put(inventory.getId(), inventory);
		
	}


	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#updateInventory(com.ankur.rsh.model.Inventory)
	 */
	public void updateInventory(Inventory inventory) {
		
		if(inventoryMap.containsKey(inventory.getId())){
			inventoryMap.put(inventory.getId(), inventory);
		}
		
		
		
	}

}
