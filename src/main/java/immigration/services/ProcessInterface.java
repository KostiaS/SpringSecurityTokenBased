package immigration.services;

import org.springframework.security.access.annotation.Secured;

public interface ProcessInterface {
	
	@Secured("{ROLE_USER}")
	String getMessage();
}
