package com.netbuilder.entityrepositoriesimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Employee;
import com.netbuilder.entityrepositories.EmployeeRepository;
/**
 * 
 * @author dgordon, Thomas Dudley
 *
 */


//@Repository
public class EmployeeRepositoryDummy implements EmployeeRepository{

	
	@Inject
	private DummyData initialData;
	



	@Override
	public long count() {
		// TODO Auto-generated method stub
		
		return 0;
	}

	/**
	 * Delete by Employee ID
	 */
	@Override
	public void delete(Integer arg0) 
	{
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
				
		for(int i = 0; i < es.size(); i++)
		{
			if(es.get(i).getEmployeeID() == arg0)
			{
				es.remove(es.get(i));
			}
		}
		
		initialData.setEntityList(es);
		
	}

	@Override
	public void delete(Employee arg0) {
		// TODO Auto-generated method stub
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(Employee e : es) 
		{
			if(e.equals(arg0))
			{
				es.remove(arg0);
			}	
		}
		
		initialData.setEntityList(es);
	}

	@Override
	public void delete(Iterable<? extends Employee> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		initialData.getEntityList(new Employee()).clear();
	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(Employee e : es) {
			if(e.getEmployeeID() == arg0)
				return true;
		}
		return false;
	}

	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		return es;
	}

	@Override
	public Iterable<Employee> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee findOne(Integer employeeID) {
		// TODO Auto-generated method stub
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(Employee e : es) {
			if(e.getEmployeeID() == employeeID)
				return e;
		}
		return null;
	}

	@Override
	public Iterable<Employee> findByEmployeeName(String name) {
		// TODO Auto-generated method stub
		ArrayList<Employee> es = initialData.getEntityList(new Employee());
		for(int i = 0; i < es.size(); i--) {
			if(!es.get(i).getEmployeeName().equals(name)) {
				es.remove(i);
				i--;
			}
		}
		return es;
	}

	@Override
	public Iterable<Employee> findByAccessLevel(int accessLevel) {
		// TODO Auto-generated method stub
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
