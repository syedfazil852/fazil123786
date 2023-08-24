package datadriventesting;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws Throwable {
		//create the fileinputStream Obj with the file address as an input
		FileInputStream fis = new FileInputStream("./src/test/resources/demo.properties");
		//create an properties object of java
		Properties pobj = new Properties();
		//load all the input stream obj to the pobj obj
		pobj.load(fis);
		//call the getproperty() from the properties class object reference
		String value=pobj.getProperty("url");
		System.out.println(value);
	}

}
