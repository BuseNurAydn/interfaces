package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;     //b�yle yazarak �ev�ek ba��ml� yapt�k
	
    public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer1) {
    	System.out.println("M��teri eklendi: " + customer1.getFirstName());
    	
    
    	Utils.runLoggers(loggers, customer1.getFirstName()); //static yapt���m�z i�in objeye gerek yok
    	
   /*    	for(Logger aa :loggers ) {
    		aa.log(customer1.getFirstName());*/
    		
    	}
    	
    //this.loggers.log(customer1.getFirstName());
    //DatabaseLogger logger = new DatabaseLogger();   // loglamaya kat� ba��ml�y�z b�yle yazarak
    //logger.log(customer1.getFirstName() + " veri taban�na logland�.");
    
    public void delete(Customer customer1) {
    	System.out.println("M��teri silindi: " + customer1.getFirstName());
    	
    	/*for(Logger aa :loggers ) {
		aa.log(customer1.getFirstName());
    	}	*/
}
}