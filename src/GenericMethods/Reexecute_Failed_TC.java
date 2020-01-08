package GenericMethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;


public class Reexecute_Failed_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG runner = new TestNG();
		List<String> list= new ArrayList<String>();
		list.add("E:\\Education\\HybridFramework\\test-Output\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
		

	}

}
