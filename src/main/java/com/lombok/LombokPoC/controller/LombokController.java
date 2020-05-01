/**
* @author nka
*
*/
package com.lombok.LombokPoC.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lombok.LombokPoC.domain.lombok.EmployeeLombok;
import com.lombok.LombokPoC.domain.lombok.EmployeeResponseLombok;

/**
 * @author nka
 *
 */

@RestController
@RequestMapping("/employee")
public class LombokController {
	
	  @PostMapping("/save")
	  EmployeeResponseLombok newEmployee(@RequestBody EmployeeLombok newEmployee) {
	    return populateResponse(newEmployee);
	  }

	/**
	 * @param EmployeeLombok
	 * @return EmployeeResponseLombok
	 */
	private EmployeeResponseLombok populateResponse(EmployeeLombok newEmployee) {
		// TODO Auto-generated method stub
		EmployeeResponseLombok response = new EmployeeResponseLombok();
		response.setFirstname(newEmployee.getFirstname());
		response.setLastname(newEmployee.getLastname());
		response.setAddress(newEmployee.getAddress());
		response.setAge(newEmployee.getAge());
		response.setCompany(newEmployee.getCompany());
		response.setEmailId(newEmployee.getEmailId());
		response.setEmployeeId(newEmployee.getEmployeeId());
		response.setGender(newEmployee.getGender());
		response.setMobile(newEmployee.getMobile());
		return response;
	}

}
