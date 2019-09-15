/**
 * 
 */
package com.ankur.rsh.controller;

import java.util.Collection;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ankur.rsh.model.Inventory;
import com.ankur.rsh.service.InventoryService;

/**
 * @author Ankur & Ambar
 *
 */
@RestController
@RequestMapping(value="/inventory")
public class InventoryController {
	
	
	@Autowired
	InventoryService inventoryService;
	
	/*//@RequestMapping(method=RequestMethod.GET)
	public List<String>  getInventoryList(){
		System.out.println("Inventory controller");

		return inventoryService.getInventoryList();
	}*/


	@RequestMapping(method=RequestMethod.GET)
	public Collection<Inventory>  getAllInventory(){
		System.out.println("Inventory controller");
		
		return inventoryService.getAllInventory();
	}
	
	
	@RequestMapping(method=RequestMethod.GET , value="/{id}")
	public Inventory  getInventoryById(@PathVariable String id){
		
		return inventoryService.getInventoryById(id);
		
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE)
	public void  createInventory(@RequestBody Inventory inventory){
		
		inventoryService.createInventory(inventory);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT , consumes=MediaType.APPLICATION_JSON_VALUE)
	public void  updateInventory(@RequestBody Inventory inventory){
		
		inventoryService.updateInventory(inventory);
		
	}
	
	

}
