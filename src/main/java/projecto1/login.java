package projecto1;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.*;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named
@SessionScoped
public class Login implements Serializable{

	private boolean logged;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public Login() {
	}

	public String getName() {
		return name;
	}

	public void setName(String user_name) {
		this.name = user_name;
		setLogged(true);
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public void logout() throws IOException {
		this.logged = false;
		 ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		    ec.invalidateSession();
		    ec.redirect(ec.getRequestContextPath() + "/index.xhtml");
	}	
	
	
	
}

