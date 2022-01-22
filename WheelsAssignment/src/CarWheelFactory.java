
public class CarWheelFactory implements WheelsFactory {
	
	 public Wheels produceWheel(String companyname) {
	        
	        if("Service".equalsIgnoreCase(companyname)) {
	            return new ServiceWheel();
	        }  
	        if("Dunlop".equalsIgnoreCase(companyname)) {
	            return new DunlopWheel();
	        }
	        return null;
	    }

}

