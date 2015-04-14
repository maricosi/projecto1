package projecto1;

import javax.enterprise.context.*;
import javax.inject.Named;


@Named
@SessionScoped
public class Login {

	private String name;

	public Login() {
	}

	public String getName() {
		return name;
	}

	public void setName(String user_name) {
		this.name = user_name;
	}
}

