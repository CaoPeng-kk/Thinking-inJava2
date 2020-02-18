package oct.test9;

public class Stock {
	
	/*3、	设计一个名为Stock的类，这个类包括：
		一个名为symbol的字符串数据域表示股票代码。
		一个名为name的字符串数据域表示股票名字。
		一个名为previousClosingPrice的double类型数据域，它存储的是前一日的股票值。
		一个名为currentPrice的double类型数据域，它存储的是当前的股票值。
		创建股票的构造方法。
		一个名为getChangePercent()的方法，返回从previousClosingPrice到currentPrice变化的百分比。
	实现这个类，编写一个测试程序，创建一个Stock对象，它的股票代码是ORCL，股票名字为Oracle Corporation，
	前一日收盘价34.5，设置新的当前值为34.35，然后显示市值变化的百分比。

	 * 
	 */
	private String symbol = "ORCL";
	private String name = "Oracle Corporation";
	private double priviousClosingPrice = 0d;
	private double currentPrice = 0d;
	
	public Stock(double priviousClosingPrice, double currentPrice) {
		super();
		this.priviousClosingPrice = priviousClosingPrice;
		this.currentPrice = currentPrice;
	}

	double getChangePercent() {
		
		return (currentPrice/priviousClosingPrice)-1;
		
	}
	public static void main(String[] args) {
		
		Stock stock = new Stock(34.5, 34.35);
		System.out.println(stock.symbol+","+stock.name+","+stock.getChangePercent());
		
		
	}
	
}
