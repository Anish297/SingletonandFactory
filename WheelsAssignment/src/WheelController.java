
public class WheelController {

	public static void main(String[] args) {
		
		
                                   //////////////////Factory ///////////////////////////////////
		///////////////////////////////////////////////////////////////  CAR  ///////////////////////////////////////////////////////////
		System.out.println("\nVehicle type :: Car\n");
		WheelsFactory CarWheelFactory = WheelProductionFactory.getWheelFactory("Car");       
		
		Wheels ServiceWheel = CarWheelFactory.produceWheel("Service");
		ServiceWheel.putOn();
		
		Wheels DunlopWheel = CarWheelFactory.produceWheel("Dunlop");
		DunlopWheel.putOn();
		/////////////////////////// Jeep ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nVehicle type :: Jeep\n");
		WheelsFactory JeepWheelFactory = WheelProductionFactory.getWheelFactory("Jeep");       
				
		Wheels DunlopWheel1 = CarWheelFactory.produceWheel("Dunlop");
		DunlopWheel1.putOn();
		
		////////////////////////////////////////////  Bike  ///////////////////////////////////////////////////////////////////////////// 
		
		System.out.println("\nVehicle type :: Bike\n");
		WheelsFactory BikeWheelFactory = WheelProductionFactory.getWheelFactory("Bike");       
		
		Wheels ServiceWheel1 = CarWheelFactory.produceWheel("Service");
		ServiceWheel1.putOn();
		
		Wheels DunlopWheel2 = CarWheelFactory.produceWheel("Dunlop");
		DunlopWheel2.putOn();
		
		
		////////////////// Singleton ///////////////////////////////////
		System.out.println("\n\n");
		WheelSizeSingleton wheel = WheelSizeSingleton.getInstance();
		wheel.sizeOfWheel("Car");
		wheel.sizeOfWheel("Jeep");
		wheel.sizeOfWheel("Bike");

		//to get the existed instance
		WheelSizeSingleton wheel1 = WheelSizeSingleton.getInstance();
		    
	     
	}

}
