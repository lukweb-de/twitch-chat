package de.lukweb.twitchchat.twitch.commands;

import de.lukweb.twitchchat.TwitchChat;
import de.lukweb.twitchchat.twitch.Command;

import java.util.Map;

public class UsernoticeC extends Command {

    public UsernoticeC() {
        super("USERNOTICE");
    }

    @Override
    public void handle(String channel, Map<String, String> tags, String[] arguments, TwitchChat chat) {

    }
}
