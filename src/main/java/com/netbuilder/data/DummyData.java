package com.netbuilder.data;

import java.util.ArrayList;
import javax.ejb.Singleton;
import com.netbuilder.entities.*;


@Singleton
public class DummyData {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public DummyData() {
		employees.add(new Employee("Ben Back", "BennyBack7","spikelife7", 1));
		employees.add(new Employee("Ray Smithy", "ArrogantManNum1", "sellsomeshit", 1));

	}

	@SuppressWarnings("unchecked")
	public <E> ArrayList<E> getEntityList(E entityType) {
		return (ArrayList<E>) employees;
	}

	@SuppressWarnings("unchecked")
	public <E> void setEntityList(ArrayList<E> entities) {
			employees = (ArrayList<Employee>) entities;
	}
}