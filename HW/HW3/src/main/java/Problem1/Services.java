package Problem1;

/**
 * An invoicing system for a company that provides property services(e.g. cleaning, gardening,
 * painting to homeowners.The system automatically calculates a price for a service based on the
 * work to be done and the home's characteristics.
 */
public interface Services {

   /**
    * When this method is called on a service, it will return the total price of the service
    * @return total price
    */
   double calculatePrice();

   /**
    * When this method is called on a service, it will return the size of the service Location
    * @return service location size
    */
   Property getServiceLocation();

   /**
    * When this method is called on a service, it will return the baseRate for the service.
    * @return baseRate
    */
   int getBaseRate();
}
