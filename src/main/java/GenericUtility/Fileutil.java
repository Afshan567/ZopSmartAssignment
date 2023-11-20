package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutil {
	
public String getData(String key) throws Throwable {
	FileInputStream fl = new FileInputStream(IPathConstants.propertyPath);
	Properties pr = new Properties();
	pr.load(fl);
	return pr.getProperty(key);
}
}
