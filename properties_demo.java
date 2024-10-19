import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class properties_demo {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("demo.properties");
        p.load(fis);
        System.out.println(p);
        String str1 = p.getProperty("user");
        System.out.println(str1);
        p.setProperty("Aditya","2002");
        System.out.println(p);
        @SuppressWarnings("rawtypes")
        Enumeration e = p.propertyNames();
        while(e.hasMoreElements()){
            String s = (String)e.nextElement();
            System.out.println(s+" : "+p.getProperty(s));
        }
        fis.close();
        FileOutputStream fos = new FileOutputStream("demo.properties");
        p.store(fos, "File updated by user on 13-02-2024");
        
    }
}