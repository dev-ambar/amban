/**
 * 
 */
package com.ankur.rsh.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ankur.rsh.model.Inventory;

/**
 * @author Ankur
 *
 */
@Component
@Qualifier("db")
public class DBInventoryDaoImpl implements InventoryDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#getAllInventory()
	 */
	public Collection<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from inventories", (rs, rowNum) -> new Inventory(rs.getString("ID") , rs.getString("NAME")) );
	}

	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#getInventoryById(java.lang.String)
	 */
	public Inventory getInventoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#createInventory(com.ankur.rsh.model.Inventory)
	 */
	public void createInventory(Inventory inventory) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.ankur.rsh.dao.InventoryDao#updateInventory(com.ankur.rsh.model.Inventory)
	 */
	public void updateInventory(Inventory inventory) {
		// TODO Auto-generated method stub

	}

}
