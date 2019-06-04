package com.czuluaga.poc.ms.limitsservice.model;

public class LimitConfiguration {
	private int minimun;
	private int maximun;
	
	public LimitConfiguration() {
	}
	
	public LimitConfiguration(int minimun, int maximun) {
		super();
		this.minimun = minimun;
		this.maximun = maximun;
	}
	public int getMinimun() {
		return minimun;
	}
	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
	public int getMaximun() {
		return maximun;
	}
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	
	
}
