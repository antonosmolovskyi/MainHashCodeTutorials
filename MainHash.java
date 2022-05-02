package classwork19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainHash {

	public static void main(String[] args) {
		/*
		 * Map<String, Integer> map = new HashMap<>(); map.put("A", 1); map.put("B", 2);
		 * System.out.println(map); System.out.println(map.get("B"));
		 */

		Map<Cat, Dog> map = new HashMap<>();
		map.put(new Cat("Susleg"), new Dog("Krevedko"));
		map.put(new Cat("Susleg"), new Dog("Barsik"));
		map.put(null, new Dog("Barsik"));
		System.out.println(map);
		// System.out.println(map.get(new Cat("Susleg")));
		// System.out.println(map.get(null));
		Iterator<Cat> i = map.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(map.get(i.next()));
		}
		for (Cat cat : map.keySet()) {
			System.out.println(map.get(cat));
		}

		List<Passenger> busforPassengerList = new ArrayList<>();
		busforPassengerList.add(new Passenger("Nikolaj", "Vasilievich", "Gogol", 19, null));
		busforPassengerList.add(new Passenger("Nikolaj", "Vasilievich", "Gogol", 19, null));
		busforPassengerList.add(new Passenger("Nikolaj", "Vasilievich", "Gogol", 19, null));

		List<GunselPassenger> gunselPassengerList = new ArrayList<>();
		gunselPassengerList.add(new GunselPassenger("Nikolaj", "Vasilievich", "Gogol", 19, "20A"));
		gunselPassengerList.add(new GunselPassenger("Nikolaj", "Vasilievich", "Gogol", 19, "1"));
		gunselPassengerList.add(new GunselPassenger("Nikolaj", "Vasilievich", "Gogol", 19, "10"));
		int counter = 0;
		/*
		for (Passenger busforPassenger : busforPassengerList) {
			counter++;
			for (GunselPassenger gunselPassenger : gunselPassengerList) {
				if (Objects.equals(busforPassenger.getFirstName(), gunselPassenger.getFirstName())
						&& Objects.equals(busforPassenger.getMiddleName(), gunselPassenger.getSecondName())
						&& Objects.equals(busforPassenger.getLastName(), gunselPassenger.getLastName())
						&& busforPassenger.getAge() == busforPassenger.getAge()) {
					busforPassenger.setPlaceNumber(gunselPassenger.getSeatNumber());
					gunselPassengerList.remove(gunselPassenger);
					counter++;
					break;
				}
			}
		} */
		
		Map<String, Passenger> mapPlace = new HashMap<>();
		
		for (Passenger busforPassenger : busforPassengerList) {
			counter++;
			Iterator<GunselPassenger> iterator = gunselPassengerList.iterator();
			while(iterator.hasNext()) {
				GunselPassenger gunselPassenger = iterator.next();
				if (Objects.equals(busforPassenger.getFirstName(), gunselPassenger.getFirstName())
						&& Objects.equals(busforPassenger.getMiddleName(), gunselPassenger.getSecondName())
						&& Objects.equals(busforPassenger.getLastName(), gunselPassenger.getLastName())
						&& busforPassenger.getAge() == busforPassenger.getAge()) {
					busforPassenger.setPlaceNumber(gunselPassenger.getSeatNumber());
					
					iterator.remove();
					counter++;
					break;
				}
			}
			mapPlace.put(busforPassenger.getPlaceNumber(), busforPassenger);
		}
		
		System.out.println(busforPassengerList);
		System.out.println(counter);
		System.out.println(mapPlace);

	}

}
