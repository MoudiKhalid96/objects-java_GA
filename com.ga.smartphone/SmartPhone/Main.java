package SmartPhone;

public class Main {

	public static void main(String[] args) {
		
		iPhone iphone11 =  new iPhone("Apple", "IOS", "IPhone 11", "2019", "black", "256", "30");
		iPhone iphone7 =  new iPhone("Apple", "IOS", "IPhone 7", "2016", "white", "128", "16");
		iPhone iphone6 =  new iPhone("Apple", "IOS", "IPhone 6", "2014", "white", "64", "14");
		Huawei nova3i =  new Huawei("Huawei", "Android", "Hauwei Nova i3", "2018", "blue", "128", "35");
		Galaxy galaxys20 =  new Galaxy("Samsung", "Android", "Galaxy S20", "2020", "silver", "256", "25");

		
		
		iphone11.printInfo();
		iphone7.printInfo();
		iphone6.printInfo();
		nova3i.printInfo();
		galaxys20.printInfo();
	}
}
