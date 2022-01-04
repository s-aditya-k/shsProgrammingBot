package com.AdityaKompella;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Command {
    public String name;
    public String description;
    public String format;
    public CommandFormat onCall;

    public Command(String name, String description, String format, CommandFormat onCall) {
       this.name = name;
       this.description = description;
       this.format = format;
       this.onCall = onCall;
    }

    public void run(MyCommandArgs args) {
        onCall.run(args);
    }
}
