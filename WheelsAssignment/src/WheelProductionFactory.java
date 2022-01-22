
public class WheelProductionFactory {
	
public static WheelsFactory getWheelFactory(String vehicle) {
        
        if("Car".equalsIgnoreCase(vehicle)) {
            return new CarWheelFactory();
        }  
        if("Jeep".equalsIgnoreCase(vehicle)) {
            return new JeepWheelFactory();
        }
        if("Bike".equalsIgnoreCase(vehicle)) {
            return new BikeWheelFactory();
        }
        
        return null;
    }

}
