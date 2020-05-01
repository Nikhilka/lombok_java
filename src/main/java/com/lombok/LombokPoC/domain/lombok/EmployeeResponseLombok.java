/**
* @author nka
*
*/
package com.lombok.LombokPoC.domain.lombok;

import lombok.Data;

/**
 * @author nka
 *
 */

@Data
public class EmployeeResponseLombok {
	
	private String employeeId; 
    private String firstname; 
    private String lastname;
    private String company; 
    private String emailId;
    private String mobile;
    private String address;
    private String gender;
    private int age;

}
