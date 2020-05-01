/**
* @author nka
*
*/
package com.lombok.LombokPoC.domain.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nka
 *
 */

@Getter  
@Setter	 
@NoArgsConstructor 
@AllArgsConstructor  
@ToString 
public class EmployeeLombok {	
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
