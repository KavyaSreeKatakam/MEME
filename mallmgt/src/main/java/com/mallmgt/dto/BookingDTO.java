package com.mallmgt.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="booking")
@Getter
@Setter
public class BookingDTO extends BaseDTO {
	
	@Column(name = "firstName", length = 755)
	private String firstName;

	@Column(name = "lastName", length = 755)
	private String lastName;
	
	@Column(name = "email", length = 755)
	private String email;
	
	@Column(name = "phoneNumber", length = 755)
	private String phoneNumber;
	
	@Column(name = "parkingName", length = 755)
	private String parkingName;
	
	@Column(name = "slot")
	private long slot;
	
	@Column(name = "slotId")
	private long slotId;

	@Column(name = "fromBookingDate")
	private Date fromBookingDate;
	
	@Column(name = "toBookingDate")
	private Date toBookingDate;
	
	@Column(name = "fromTime", length = 755)
	private String fromTime;
	
	@Column(name = "toTime", length = 755)
	private String toTime;
	
	@Column(name = "status", length = 755)
	private String status;
	
	@Column(name = "address", length = 755)
	private String address;

	private String fromDataString;
	
	private String ToDataString;
	
	
	@Override
	public String toString() {
		return "BookingDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", parkingName=" + parkingName + ", slot=" + slot + ", slotId=" + slotId
				+ ", fromBookingDate=" + fromBookingDate + ", toBookingDate=" + toBookingDate + ", fromTime=" + fromTime
				+ ", toTime=" + toTime + "]";
	}
	
	
	

}
