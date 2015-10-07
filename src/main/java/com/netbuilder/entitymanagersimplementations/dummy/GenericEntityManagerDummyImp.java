package com.netbuilder.entitymanagersimplementations.dummy;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.netbuilder.data.DummyData;
import com.netbuilder.entitymanagers.GenericEntityManager;



@Alternative
public class GenericEntityManagerDummyImp<E> implements GenericEntityManager<E> {
	@Inject
	private DummyData initialData;
	
	/**
	 * This retrieves the list of entities from the Initial data list, adds the entity to it and then returns it to the initial data object.
	 */
	public void persistEntity(E entity) {
		ArrayList<E> es = initialData.getEntityList(entity);
		es.add(entity);
		initialData.setEntityList(es);
	}

	/**
	 * This retrieves the list of entities from the Initial data list, adds the entities to it and then returns it to the initial data object.
	 */
	public void persistEntities(List<E> entities) {
		ArrayList<E> es = initialData.getEntityList(entities.get(0));
		es.addAll(entities);
		initialData.setEntityList(es);
	}

	/**
	 * This gets all the entities of the type of entity passed in.
	 */
	public List<E> listEntities(E entity) {
		return initialData.getEntityList(entity);
	}

	/**
	 * This loops through, finds the entry with the same ID as the passed in object and then replaces it with the passed in object.
	 */
	public void updateEntity(E entity) {
		ArrayList<E> es = initialData.getEntityList(entity);
		for(int i = 0; i <es.size(); i++) {
			if(es.get(i).equals(entity))
				es.set(i, entity);
		}
		initialData.setEntityList(es);
	}

	/**
	 * This loops through, finds the entry with the same ID as the passed in object and then removes it. 
	 */
	public void removeEntity(E entity) {
		ArrayList<E> es = initialData.getEntityList(entity);
		for(int i = 0; i <es.size(); i++) {
			if(es.get(i).equals(entity))
				es.remove(i);
		}
		initialData.setEntityList(es);
	}
}
