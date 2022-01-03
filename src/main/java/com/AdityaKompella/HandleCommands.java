package com.AdityaKompella;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.Arrays;
import java.util.List;

public class HandleCommands extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String content = event.getMessage().getContentRaw();

        List<String> args = Arrays.asList(content.split(" "));
        String unslicedCommand = args.get(0);

        if (unslicedCommand.startsWith(Bot.Prefix)) {
            String command = unslicedCommand.substring(Bot.Prefix.length());
            if (Bot.AvailableCommands.containsKey(command)) {
                Bot.AvailableCommands.get(command).run(new MyCommandArgs(event, args.subList(1, args.size())));
            }
        }

    }
}
