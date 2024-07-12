// camel-k: language=java
// camel-k: dependency=mvn:pt.spms.hip.nexus:nexus.spms:1.0.8-20240709.150131-1

import org.apache.camel.builder.RouteBuilder;
import pt.spms.hip.nexus.Greets;

public class MyIntegration extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        Greets greets = new Greets();

        from("timer:tick?period=10000") // Gera uma mensagem a cada 10 segundos
            .setBody().simple("Camel K")
            .process(exchange -> {
                String originalBody = exchange.getIn().getBody(String.class);
                String newBody = greets.sayHi(originalBody);
                exchange.getIn().setBody(newBody);
            })
            .to("log:info");
    }
}
