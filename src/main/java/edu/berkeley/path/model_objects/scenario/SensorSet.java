package edu.berkeley.path.model_objects.scenario;

import java.util.ArrayList;
import java.util.List;

public class SensorSet extends edu.berkeley.path.model_objects.jaxb.SensorSet  {
	
	protected void populate() {
		for(edu.berkeley.path.model_objects.jaxb.Sensor sens : sensor) {
			Sensor extendedSens = (Sensor)sens;
			Sensor.Type type = null;
	    	try {
				type = extendedSens.getSensorType();
			} catch (IllegalArgumentException e) {
				continue;
			}	
			
			// generate sensor
			if(type != null){
				Sensor s = ScenarioFactory.createSensor(type);
				if(s != null)
					sensor.add(s);
			}		    	
		}
	
	}

	protected boolean isValid() {
		boolean isValid = true;
		for(edu.berkeley.path.model_objects.jaxb.Sensor s : sensor){
			Sensor extendedSensor = (Sensor)s;
			isValid = extendedSensor.isValid();
			if(isValid == false)
				return false;
		}
		return isValid;
	}
	

	/**
	 * @return the projectId
	 */
	public long getProjectId() {
		return super.getProjectId();
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(long projectId) {
		 super.setProjectId(projectId);
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		super.setId(id);	
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		super.setName(name);
	}



	/**
	 * @param modstampMicros the modstamp to set
	 */
	public void setModStamp(Long modstampMicros) {
		super.setModStamp(modstampMicros);
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the modStamp
	 */
	public long getModStamp() {
		return modStamp;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String desc) {
		super.setDescription(desc);
		
	}
	

	/**
	 * Set the sensors list. Attaches list of Sensor Model Objects to scenario.
	 * 
	 * @param List<Sensor>	List of extended Sensors to add
	 */
	@SuppressWarnings("unchecked")
	public void setListOfSensors(List<Sensor> sensors) {

			List<edu.berkeley.path.model_objects.jaxb.Sensor> sensorSet = getSensor();
			if ( sensorSet == null ) {
			  sensorSet = new ArrayList<edu.berkeley.path.model_objects.jaxb.Sensor>();  
			}
			sensorSet.clear();
			sensorSet.addAll((List<edu.berkeley.path.model_objects.jaxb.Sensor>)(List<?>)sensors);
			sensor = sensorSet;
	}
	
	/** 
	 * Get the list of sensors in the scenario.
	 * 
	 * @return List of all sensors as Sensor Model Objects. 
	 */
	@SuppressWarnings("unchecked")
	public List<Sensor> getListOfSensors() {
		List<edu.berkeley.path.model_objects.jaxb.Sensor> sensors = getSensor();
		// check if sensor list exists, if not create it and add empty list of sensors
		if ( sensors == null ) {
			sensors = new ArrayList<edu.berkeley.path.model_objects.jaxb.Sensor>(); 
			// set newly created sensor list sensor field in super class - there is no setter defined
			this.sensor = sensors;
		}
		// return casted list of Nodes from JAXB base class
		return (List<Sensor>)(List<?>)sensors;
	}

}
