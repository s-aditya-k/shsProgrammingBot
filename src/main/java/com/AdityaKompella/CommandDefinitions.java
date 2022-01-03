package com.AdityaKompella;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CommandDefinitions {

    public static void sendMessage(MessageReceivedEvent event, String message) {
       event.getChannel().sendMessage(message).queue();
    }

    public static CommandFormat help = (args -> {
        sendMessage(args.getEvent(), "Hi");
    }) ;
}
