package immigration.services;

import org.springframework.stereotype.Service;

@Service("process")
public class ProcessImp implements ProcessInterface {

	public String getMessage() {
		return "message";
	}

}
