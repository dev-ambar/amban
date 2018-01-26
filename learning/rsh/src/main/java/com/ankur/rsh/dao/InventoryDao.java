package com.ankur.rsh.dao;

import java.util.Collection;

import com.ankur.rsh.model.Inventory;

public interface InventoryDao {

	Collection<Inventory> getAllInventory();

	Inventory getInventoryById(String id);

	void createInventory(Inventory inventory);

	void updateInventory(Inventory inventory);

}