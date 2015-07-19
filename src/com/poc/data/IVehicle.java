/**
 * 
 */
package com.poc.data;

/**
 * @author MaRoy
 *
 */
public abstract class IVehicle {

	private int id;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public abstract void run();
	
	public abstract void horn();
	
	public abstract void hasWheels();
	
	public abstract void hasEngine();
}
