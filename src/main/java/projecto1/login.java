package projecto1;

import java.io.Serializable;

import javax.enterprise.context.*;
import javax.inject.Named;


@Named
@SessionScoped
public class login implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public login() {
	}

	public String getName() {
		return name;
	}

	public void setName(String user_name) {
		this.name = user_name;
	}
}

