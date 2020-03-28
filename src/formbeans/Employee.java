package formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Employee extends ActionForm {

	private int id;
	private String name, email, address, gender;
	private String[] hobies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobies() {
		return hobies;
	}

	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors ae = new ActionErrors();

		if (id == 0)
			ae.add("id_e", new ActionMessage("msg1"));
		if (name.equals(""))
			ae.add("name_e", new ActionMessage("msg2"));
		if (email.equals(""))
			ae.add("email_e", new ActionMessage("msg3"));
		if (address.equals(""))
			ae.add("address_e", new ActionMessage("msg4"));
		if (gender == null) // (gender.equals(""))
			ae.add("gender_e", new ActionMessage("msg5"));
		if (hobies == null) // (hobies.length < 1)
			ae.add("hobies_e", new ActionMessage("msg6"));

		return ae;
	}

}
