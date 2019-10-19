
package or.tecnologico;

import javax.jws.WebService;

@WebService(endpointInterface = "or.tecnologico.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

