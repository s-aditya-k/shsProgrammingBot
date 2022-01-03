package com.AdityaKompella;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

//OAuth2 auth url : * https://discord.com/api/oauth2/authorize?client_id=927650182089281577 *
public class Bot {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA api = JDABuilder.createDefault(DiscordToken.token)
                .addEventListeners(new PingPong())
                .build()
                .awaitReady();
    }
}
