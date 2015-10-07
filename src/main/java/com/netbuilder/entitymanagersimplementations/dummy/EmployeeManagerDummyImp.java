package com.netbuilder.entitymanagersimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Employee;
import com.netbuilder.entitymanagers.EmployeeManager;
/**/
public class EmployeeManagerDummyImp implements EmployeeManager{

	
	@Inject
	private DummyData initialData;
	
	/**
	 * This goes through and returns the Address with the provided ID.
	 */
	public Employee findByID(long employeeID) {
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(Employee e : es) {
			if(e.getEmployeeID() == employeeID)
				return e;
		}
		return null;
	}

	/**
	 * This goes through, and returns all entities with the same postcode.
	 */
	public List<Employee> findByAccessLevel(int accessLevel) {
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(int i = 0; i < es.size(); i--) {
			if(es.get(i).getAccessLevel() != accessLevel) {
				es.remove(i);
				i--;
			}
		}
		return es;
	}
}
