/**
 * 
 */
package com.poc.data;

/**
 * @author MaRoy
 *
 */
public class Bike extends IVehicle{

	private String model;
	private String color;
	private Double weight;
	private String speed;
	
	
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public void run() {
		System.out.println("Bike Running!!");
		
	}

	@Override
	public void horn() {
		System.out.println("Bike Horn");
		
	}

	@Override
	public void hasWheels() {
		System.out.println("Two Wheels");
		
	}

	@Override
	public void hasEngine() {
		System.out.println("100 HP");
		
	}

}
