import java.util.List;
import controller.ShopperHelper;
import model.Shopper;

public class ShoppingTester {
	public static void main(String[] args) {
		Shopper bill = new Shopper("Bill");
		ShopperHelper sh = new ShopperHelper();
		sh.insertShopper(bill);
		List<Shopper> allShoppers = sh.showAllShoppers();
		for(Shopper a: allShoppers) {
		System.out.println(a.toString());
		}
	}
}