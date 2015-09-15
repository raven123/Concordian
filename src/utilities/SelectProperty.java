/**
 * 
 */
package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import utilities.Enums.ORType;

/**
 * @author ravrai
 *
 */
public final class SelectProperty {

	private static Properties selectOR = new Properties();
	private static final String elementOR = "DemoAppElements.properties";
	private static final String appOR = "app.properties";
	private static SelectProperty selectProperty=new SelectProperty();

	private SelectProperty() {

		
	}

	public static SelectProperty getInstance(ORType orType) {
				
		try {
			String OR=null;
		     switch(orType)
		     {
		     case ELEMENTS: OR=elementOR;break; 
		     case APP: OR=appOR; break;
		     }
			FileInputStream input = new FileInputStream(
					System.getProperty("user.dir") + "/src/object_repository/"
							+ OR);

			selectOR.load(input);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selectProperty;
	}

	public String getProperty(String propertyKey)
	{
		return selectOR.getProperty(propertyKey);
	}
	
}
