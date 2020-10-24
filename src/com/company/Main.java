package com.company;

public class Main {
	public static void main(String[] args) {
//// dog musi byc podane do konstruktora w klasie animal
//	Animal dog = new Animal("dog");
//	dog.name = "Haiko";
//
//
////	sout + tab - wypisuje System.out.println()
//	System.out.println(dog.name);
//	System.out.println(dog.species);
//
//	Phone onePlus = new Phone();
//	onePlus.producer = "1+";
//	onePlus.model = "firstone";
//	onePlus.screenSize = 6.0;
//
////
//
////	System.out.println(Integer.MAX_VALUE);
////	System.out.println(Long.MAX_VALUE);
////	System.out.println(Double.MAX_VALUE);
////	uzywany jezeli chodzi o szybkosc
////	double d = 0.3;
////	jezeli duze obliczenia z dokladnościa
////	Double dd = 0.3;
////	BigDecimal ddd = new BigDecimal(0.3);
//
//	Human me = new Human();
//	me.firstName = "przemyslaw";
//	me.lastName = "wenderholm";
//	me.pet = dog;
//
//
//	dog.feed(35);
//	System.out.println(me.firstName);
//	System.out.println(me.lastName);
//	System.out.println(me.pet.species);
//	//pobieranie danych z animal
//	System.out.println(dog.getWeight());
//	// odwolanie do static w class anima

//zadanie
		Animal2 dog = new Animal2();
		dog.species = "pies";
		dog.name = "azor";
		System.out.println(dog.weight);
		dog.feed(0.5);
		dog.walk(1.7);
		dog.walk(1.7);

		Car audi = new Car();
		audi.name = "audi";
		audi.age = 3.0;
		audi.capacity = 10.0;

		System.out.println(audi.name);
		System.out.println(audi.age);

	}


}
