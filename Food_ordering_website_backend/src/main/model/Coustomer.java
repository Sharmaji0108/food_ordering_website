package com.mini_project;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@NotNull(message = "firstName field should not be null")
	@Size(min = 3,max=30,message = "name of min length should be 3 and max be 30")
	private String firstName;
	
	@NotNull(message = "lastName field should not be null")
	@Size(min = 3,max=30,message = "name of min length should be 3 and max be 30")
	private String lastname;
	
	@NotNull(message = "age field should not be null")
	@Max(100)
	private Integer age;
	
	@NotNull(message = "gender field should not be null")
	private String gender;
	
	@NotNull(message = "mobileNumber field should not be null")
	private String mobileNumber;
	
	@Email
	private String email;
	
	@NotNull(message = "Address field should not be null")
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@NotNull(message = "Address field should not be null")
	@Size(min = 8,max=15,message = "Password size of min length should be 3 and max be 30")
//	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", message = "Invalid Password pattern. Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character.")
	private String password;
	
	
	
	
}