package com.AdityaKompella;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface CommandFormat {
    void run(MyCommandArgs args);
}
