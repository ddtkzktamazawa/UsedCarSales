package 習熟度試験;

public class 習熟度試験 {

	public static void main(String[] args) {
		int[][] sales = {
				{120000, 158000, 130000, 170000}, // 店舗A
				{80000, 105000, 95000, 110000},   // 店舗B
				{185000, 140000, 160000, 155000}  // 店舗C
		};
		String[] storeNames = {"店舗A", "店舗B", "店舗C"};

		//int型の変数sumPriceAに店舗Aの各売上を合計したものを代入する
		int sumPriceA =(120000+158000+130000+170000);
		//int型の変数sumPriceBに店舗Bの各売上を合計したものを代入する
		int sumPriceB =(80000+105000+95000+110000);
		//int型の変数sumPriceCに店舗Cの各売上を合計したものを代入する
		int sumPriceC =(185000+140000+160000+155000); 
		//"店舗Aの総売上はsumPriceAで、平均売上はsumPriceA/4です。"と表示して改行する
		System.out.println("店舗Aの総売上は" + sumPriceA + "で、平均売上は" + (double)sumPriceA/4 + "です。");
		//"店舗Bの総売上はsumPriceBで、平均売上はsumPriceB/4です。"と表示して改行する
		System.out.println("店舗Bの総売上は" + sumPriceB + "で、平均売上は" + (double)sumPriceB/4 + "です。");
		//"店舗Cの総売上はsumPriceCで、平均売上はsumPriceC/4です。"と表示して改行する
		System.out.println("店舗Cの総売上は" + sumPriceC + "で、平均売上は" + (double)sumPriceC/4 + "です。");

		int highPrice = 0;
		highPrice = sales[0][0];
		if()
	}

}
