package com.contact.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public class ContactServiceImplementation implements ContactService{

	//Fake list
	
	List<Contact> clist = List.of(
			new Contact(27, "XYZ","xyz@gmail.com",123321L),
			new Contact(27, "ABC","abc@gmail.com",2348346L),
			new Contact(27, "GHI","ghi@gmail.com",2367347L),
			new Contact(23, "SAM","sam@gmail.com",9823943L),
			new Contact(23, "MAX","max@gmail.com",1903488L),
			new Contact(29, "STAN","stand@gmail.com",938484L),
			new Contact(29, "JJ","jj@gmail.com",1324321L)
			);
	
	private List<Contact> rlist = new ArrayList<>();
	
	@Override
	public List<Contact> getContacts(int id) {
		rlist.clear();
		
		Iterator<Contact> itr =clist.iterator();
		
		while(itr.hasNext()) {
			Contact c = itr.next();
			if(c.getId() == id) {
				rlist.add(c);
			}
		}
		return rlist;
	}

}
