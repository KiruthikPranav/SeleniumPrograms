package testNGFramework;

import org.testng.annotations.Test;

public class DependsOnGroups {
		//grouping methods by dependancy
		@Test(groups="Demo")					// 1
		public void test() {
			System.out.println("Demo");
		}
		
		@Test(groups = "Demo",dependsOnMethods="test")
		public void search() {						//2
			System.out.println("Product Searched and displayed");
		}
		
		@Test(dependsOnMethods = "search",groups="Demo")
		public void addToCart() {					//3
			System.out.println("Clicked product add to cart");
		}

		//   Here We use dependsOnGroups 
		@Test(dependsOnGroups = "Demo")
		public void closingBrowser() {
			System.out.println("Browser closed");
		}
					
		@Test(dependsOnMethods="closingBrowser")
		public void message()
		{
			System.out.println("Program Done");
		}

}
