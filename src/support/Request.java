package support;

import java.io.Serializable;

public class Request implements Serializable {
    private final String commandName;
    private final String[] arguments;
    private final Object payload;

    public Request(String commandName, String[] arguments, Object payload) {
        this.commandName = commandName;
        this.arguments = arguments;
        this.payload = payload;
    }

    public String getCommandName() {
        return commandName;
    }

    public String[] getArguments() {
        return arguments;
    }

    public Object getPayload() {
        return payload;
    }
}
