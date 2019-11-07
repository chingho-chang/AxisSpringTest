package poc;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

@Service("axisHelloWorldService")
@WebService(endpointInterface = "poc.AxisHelloWorld")
public class AxisHelloWorldImpl implements AxisHelloWorld {

	@Override  
    public String getMessage(String message) {  
        return "---------Axis Server-------" + message;  
    }

}
