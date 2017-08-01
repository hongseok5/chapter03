package chapter03;

import mypackage.Goods2;

public class GoodsApp {

	
	public static void main(String args[]) {
		Goods goods = new Goods();
		goods.setCountSold(100);
		goods.setCountStock(200);

		goods.setPrice(50000);
		
		
		
		
		
		
		
		
		System.out.println(
				"name:" + goods.getName() +  // private으로 변경했더니 에러 발생 , prv는 내부에서만 접근 가능
				",price:"+goods.getPrice()+
				",coundSold:"+goods.getCountSold()+
				",countStock"+goods.getCountStock());
		

		
		
	}
	
}
