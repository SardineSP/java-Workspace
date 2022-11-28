package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/{
	
	private String title;
	private String author;
	private int price;
	
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() { //spring 가면 이 순서대로 안만들면 인식을 못함
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * 오버라이딩
	 * - 상속받고 있는 부모클래스의 메서드를 자식 클래스에서 재정의(재작성)하는 것
	 * - 부모가 제공하고있는 메서드를 자식이 일부 고쳐서 사용하겠다는 의미.
	 *   (자식메서드가 우선권을 가짐)
	 *   
	 * 오버라이딩 성립 조건 (외워두는게 좋음!★★★★★)
	 * - 부모메서드의 메서드명과 동일해야함
	 * - 매개변수 자료형, 갯수, 순서가 동일해야함(매개변수명은 상관 없음)
	 * - 반환형이 동일해야함
	 * - 부모메서드의 접근제한자보다 공유 범위가 같거나 더 커야함
	 *   ex) 만약 부모메서드의 접근제한자가 protected면 자식은 public, protected여야함.
	 *   => 규약의 개념이 들어가있음(재정의하기 위해선 위의 성립조건은 최소한 지켜야한다는 의미)
	 *   
	 *    public - default - protected - private
	 *    
	 * @Override 어노테이션
	 * - 생략가능( 명시를 안해도 부모메서드와 형태가 같으면 오버라이딩이 된 것)
	 * - 어노테이션을 붙이는 이유
	 *   > 잘못 기술했을 경우(성립조건과 다르게) 오류를 알려주기 때문에 다시 한 번 검토할 수 있게 유도한다.
	 *   > 혹시라도 부모메서드가 나중에 수정이 되었을 경우 오류를 알려주기 때문에 검토할 수 있게 유도한다.
	 *   > 이 메서드가 오버라이딩된 메서드라는 걸 알리고자 하는 목적. ★★★★★
	 *    
	 */
	
	@Override
	public String toString() { //기존에 있는 toString 메서드를 재정의
		return "책 제목 : " + title + ", 책 저자 : " + author + ", 책 가격 : " + price;
	}
	
}
