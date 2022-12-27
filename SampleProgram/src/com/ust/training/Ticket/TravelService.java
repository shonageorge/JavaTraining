package com.ust.training.Ticket;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TravelService {
	
	public static void main(String[] args) {
		
		List<TravelDetails> details = Arrays.asList(
				new TravelDetails(232,"Asha","Bglr","Tvm",340,0),
				new TravelDetails(232,"Ram","Chennai","Kochi",420,0),
				new TravelDetails(232,"Rishab","Cmbt","Chennai",190,0),
				new TravelDetails(232,"Sam","Hyd","Bglr",240,0)
				);
		
		int perKm=5;
		
		details.stream().map(
			
		(m)->{
			m.setAmount(m.getDistance()*perKm);
			return m;
		}).forEach(System.out::println);
		
		/*Map<TravelDetails,Integer> newMap = new HashMap<>();
		newMap.put(new TravelDetails(232,"Asha","Bglr","Tvm",340), 0);
		newMap.put(new TravelDetails(232,"Ram","Chennai","Kochi",420), 0);
		newMap.put(new TravelDetails(232,"Rishab","Cmbt","Chennai",190), 0);
		newMap.put(new TravelDetails(232,"Sam","Hyd","Bglr",240), 0);
		
		//details.stream().collect(Collectors.toMap()
		
		newMap =newMap.entrySet().stream().collect(Collectors.toMap(m->m.getKey(), m->m.getKey().getDistance()*perKm));
		
		System.out.println(newMap);*/
	}

}

