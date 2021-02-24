package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="list_details")
public class ListDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LIST_ID")
	private int id;
	@Column(name="LIST_NAME")
	private String listName;
	@Column(name="TRIP_DATE")
	private LocalDate tripDate;
	
	public ListDetails(int id, String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		this.id = id;
		
	}
	
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
			//omitted for space but set them in your code 
	
	}
	
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper) {
			//omitted for space but set them in your code 
	
	}
}
