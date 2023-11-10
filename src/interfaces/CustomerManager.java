package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;     //böyle yazarak ðevþek baðýmlý yaptýk
	
    public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer1) {
    	System.out.println("Müþteri eklendi: " + customer1.getFirstName());
    	
    
    	Utils.runLoggers(loggers, customer1.getFirstName()); //static yaptýðýmýz için objeye gerek yok
    	
   /*    	for(Logger aa :loggers ) {
    		aa.log(customer1.getFirstName());*/
    		
    	}
    	
    //this.loggers.log(customer1.getFirstName());
    //DatabaseLogger logger = new DatabaseLogger();   // loglamaya katý baðýmlýyýz böyle yazarak
    //logger.log(customer1.getFirstName() + " veri tabanýna loglandý.");
    
    public void delete(Customer customer1) {
    	System.out.println("Müþteri silindi: " + customer1.getFirstName());
    	
    	/*for(Logger aa :loggers ) {
		aa.log(customer1.getFirstName());
    	}	*/
}
}