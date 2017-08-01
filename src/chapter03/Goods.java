package chapter03;

public class Goods {
	
	private static int countofGoods; // 스태틱 변수는 메소드 에어리아 영역에 존재한다 
	
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {

		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		if( price <0)
			price = 0 ; // 정보 은닉 
		this.price = price;
	}




	public int getCountStock() {
		return countStock;
	}




	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}




	public int getCountSold() {
		return countSold;
	}




	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}




	void showInfo() {
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // 퍼블릭 클래스 끝
