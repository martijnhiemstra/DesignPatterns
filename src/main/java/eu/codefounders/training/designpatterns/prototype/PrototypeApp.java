package eu.codefounders.training.designpatterns.prototype;

/*
 * Met de prototype design pattern kunnen we objecten alvast initialiseren
 *  en dan elke keer dat we een object nodig heb dan heeft die alvast alle 
 *  velden ingevuld
 * 
 * Uitleg wat de nut is van prototype design pattern:
 *  https://stackoverflow.com/questions/13887704/whats-the-point-of-the-prototype-design-pattern
 */
public class PrototypeApp {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
