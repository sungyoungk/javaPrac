package javaPrac.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertySample {
    public static void main(String[] args) {
        PropertySample sample = new PropertySample();
        // sample.checkProperties();
        sample.saveAndLoadProperties();
    }

   public void checkProperties() {
       Properties props = System.getProperties();
       Set<Object> keySet = props.keySet();
       for (Object data : keySet) {
           System.out.println(data + "=" + props.get(data));
       }
   }

   public void saveAndLoadProperties() {
       try {
           String fileName = "test.properties";
           File propertiesFile = new File(fileName);

           FileOutputStream fos = new FileOutputStream(propertiesFile);
           Properties prop = new Properties();
           prop.setProperty("writer", "Sungyoung, Kim");
           prop.setProperty("writerHome", "Busan");
           prop.store(fos, "Basic Properties file");
           fos.close();

           FileInputStream fis = new FileInputStream(propertiesFile);
           Properties propLoad = new Properties();
           propLoad.load(fis);
           fis.close();

           System.out.println(propLoad);

       } catch (Exception e) {
           e.printStackTrace();
       }

   }
}
