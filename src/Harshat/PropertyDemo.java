package Harshat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;


public class PropertyDemo {
              private static void saveProperties(Properties p,String fileName)
              {
            	  try{
            		  OutputStream propsFile=new FileOutputStream(fileName);
            		  p.store(propsFile,"Properties File to the test Application");
            		  propsFile.close();
            		  
            	  }
            	  catch(IOException ioe)
            	  {
            		  }
            	  
              }
              private static Properties loadProperties(String fileName) {
            	 Properties tempProp=new Properties();
            	  try
            	  {
            		  InputStream propsFile=new FileInputStream(fileName);
            		    tempProp.load(propsFile);
            		    propsFile.close();
            		    
            	  }
            	  catch(IOException ioe)
            	  {
            		  
            	  }
				return tempProp;
            	  
				
			}
              
              private static Properties createDefaultProperties() {
            	  
            	  Properties temProp=new Properties();
            	    temProp.setProperty("url","jdbc:Oracle:thin:@10.219.34.3:1521:orcl");
            	    temProp.setProperty("driver ","oracle.jdbc.driver.OracleDriver");
            	    temProp.setProperty("username"," hkoppine");
            	    temProp.setProperty("password","hkoppine");
            	    
				return temProp;
				
			}
              private static void printProperties(Properties p, String s) {
      			p.list(System.out);
      			
      		}
          public static void main(String args[])
          {
        	    final String PROPFILE ="MyApplication.propertyies";
        	    Properties myProp;
        	    Properties myNewprop;
        	    
        	    myProp=createDefaultProperties();
        	    printProperties(myProp,"Newly Created(Default)Properties");
        	    
        	    saveProperties(myProp, PROPFILE);
        	    
        	    myNewprop=loadProperties(PROPFILE);
        	     printProperties(myNewprop,"Loaded Properties");
        	     
        	     //myNewprop=alterProperties(myProp);
        	     
        	     printProperties(myNewprop,"After Altering Properties");
        	      
        	     saveProperties(myNewprop, PROPFILE);
        	     
        	     Properties myNewProp1=loadProperties(PROPFILE);
        	     
        	     Enumeration<?> enprops=myNewProp1.propertyNames();
        	     
        	     String key="";
        	     String param[];
        	     param=new String[4];
        	     int i=0;
        	     while(enprops.hasMoreElements())
        	     {
        	    	 key=(String)enprops.nextElement();
        	    	 System.out.println(key);
        	    	 param[i]=(String)myNewProp1.getProperty(key);
        	    	 System.out.println(""+key+"->"+myNewProp1.getProperty(key));
        	    	 
        	     }
        	    	 
        	    	 
        	    	 
        	     
        	     
          }
		
		
	

}
