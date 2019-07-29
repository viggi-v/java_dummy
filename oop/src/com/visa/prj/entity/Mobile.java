package com.visa.prj.entity;

public class Mobile extends Product {
	private String connectivity;

	public Mobile() {
	}

	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	@Override
	public boolean isExpensive() {
		if("3G".equals(this.connectivity) && this.getPrice() > 5000) {
			return true;
		}
		else if(connectivity.equals("4G") && this.getPrice() > 15000) {
			return true;
			// baddddddd practice
			// does not handle for null pointer exception of connectivity
		}
		return false;
	}
	
	
}
