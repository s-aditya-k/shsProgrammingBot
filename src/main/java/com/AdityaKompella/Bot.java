package com.AdityaKompella;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.Hashtable;

//OAuth2 auth url : * https://discord.com/api/oauth2/authorize?client_id=927650182089281577 *
public class Bot {

    public static String Prefix = "s/";
    public static Hashtable<String, Command> AvailableCommands = new Hashtable<>();

    public static void initializeCommands() {
        AvailableCommands.put("help", new Command("help", "Provides a list of commands", Prefix + "help", CommandDefinitions.help));
    }

    public static void main(String[] args) throws LoginException, InterruptedException {
        initializeCommands();
        JDA api = JDABuilder.createDefault(DiscordToken.token)
                .addEventListeners(new HandleCommands())
                .build()
                .awaitReady();
    }
}
