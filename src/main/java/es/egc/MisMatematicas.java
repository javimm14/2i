package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION
 *
 */
public class Logger 
{
	static Logger log=Logger.getLogger(Logger.class); 
	
	public static int divide(int a, int c){
		int result= a/c;
		log.info("Returning "+a+"/"+c+"="+result);
		return result;
	}
}
