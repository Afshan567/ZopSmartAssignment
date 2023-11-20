package GenericUtility;

import java.util.Random;

public class JavaUtility {
public int randomNo() {
	Random ran=new Random();
	return ran.nextInt(10);
}
}
