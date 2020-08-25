package com.example.mytest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**
 *Class controller ControlVessel, create a PostMethod, require parameters to setter
 *
 * @author Sonsoles María Mangue
 * @version 1.0
 * 
 **
 */

@RestController
public class ControlVessel {
		//InputModel vessel=new InputModel();
		List<InputModel>currentVessels= new ArrayList<InputModel>();	
		
		/**
		 * Function that load the database
		 */
		void loadVessels()  {
			//Update database with new info
			//...
		}
		
		/**
		 * Function that updates the database and return and OutputModel
		 * @param inputVessel 
		 */
		OutputModel addVesselToList(InputModel inputVessel) {
			//
			
			OutputModel output= new OutputModel(inputVessel.vessel,inputVessel.position);
			return output;
		}
		
		/**
		 * This is the first version of the API, the external object inputVessel is sumbited and added to a list with 
		 * the function addVesselToList(inputModel). Finally the message output is setted. This version would not 
		 * change if  new functionalities are required.
		 * @param newPosition
		 * @return output, a JSON file with the format defined by OutputModel 
		 */

	  @PostMapping("/v1/vessel") 
	   OutputModel newVessel(@RequestBody InputModel inputVessel) {
		  OutputModel output= addVesselToList(inputVessel);
		return output;
		  
	  }
	
}
