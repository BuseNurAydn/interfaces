package interfaces;

public class Main {

	public static void main(String[] args) {
	  Logger[] loggers = {new EmailLogger(),new FileLogger()};
	  CustomerManager customerManager = new CustomerManager(loggers);
	                                                                  //ba��ml�l��u sms oldu demek
	  Customer customer1 = new Customer(1,"Buse","Ayd�n");            //new Databaselogger vb.
	  customerManager.add(customer1);;                                //new emailLogger 

	}

}
