package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	private int tire;
	private int wing;
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public int getWing() {
		return wing;
	}
	
	@Override //어노테이션? 이게 있으면 아래에는 무조건 오버라이딩된 메서드만 있어야함 - 메타데이터?
	public String information() {
		return super.information() + ", tire : " + tire + ", wing : " + wing;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 빙글빙글 굴리면서 달리다가 날개를 펴면서 움직인다.");
	}
	

}
