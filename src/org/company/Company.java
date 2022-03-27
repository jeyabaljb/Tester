package org.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Company {
	public static void main(String[] args) {
		Set<Employee> s = new LinkedHashSet<>();

		Employee s1 = new Employee();
		s1.setId(1234);
		s1.setName("jeyabal");
		s1.setPhono(7598632940l);

		Employee s2 = new Employee();
		s2.setId(5678);
		s2.setName("Ajai");
		s2.setPhono(497521944l);

		s.add(s1);
		s.add(s2);

		for (Employee x : s) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhono());

		}

	}
}
