package com.AdityaKompella;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

public class MyCommandArgs {
    private final MessageReceivedEvent event;
    private final String[] args;

    public MyCommandArgs(MessageReceivedEvent event, List<String> args) {
        this.event = event;
        this.args = args;
    }

    public MessageReceivedEvent getEvent() {
        return event;
    }

    public int getSize() {
        return args.length;
    }
}
