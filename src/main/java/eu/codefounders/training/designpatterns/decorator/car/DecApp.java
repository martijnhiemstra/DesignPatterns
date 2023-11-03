package eu.codefounders.training.designpatterns.decorator.car;

public class DecApp {

	public static void main(String[] args) {
		Car car = new Sedan();
		car = new RearViewMirrorCameraControlDecorator(car);
		car = new AircoDecorator(car);
		car = new CruiseControlDecorator(car);

		System.out.println("Options:");
		for (String option : car.opties()) {
			System.out.println("Option: " + option);
		}
		System.out.println("Total costs: " + car.costs());
	}

}
