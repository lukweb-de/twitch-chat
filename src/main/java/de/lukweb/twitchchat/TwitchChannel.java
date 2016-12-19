package de.lukweb.twitchchat;

import java.util.ArrayList;
import java.util.List;

public class TwitchChannel {

    private String name;
    private TwitchChat chat;
    private List<String> operators = new ArrayList<>();

    private String messagePrefix;

    TwitchChannel(String name, TwitchChat chat) {
        this.name = name;
        this.chat = chat;
        String username = chat.getUsername();
        messagePrefix = ":" + username + "!" + username + "@" + username + ".tmi.twitch.tv ";
    }

    /**
     * Gets the name of the channel
     *
     * @return the name of the channel
     */
    public String getName() {
        return name;
    }

    /**
     * Sends a message to this channel
     *
     * @param message the message will be sent
     */
    public void sendMessage(String message) {
        chat.getIrc().sendString(messagePrefix + "PRIVMSG #" + name + " :" + message);
    }

    /**
     * Sends a whipser message to a user in this channel. The user must be in THIS channel.
     *
     * @param to      user who will recive this message
     * @param message the message
     */
    public void sendWhisper(String to, String message) {
        sendMessage(".w " + to + " " + message);
    }

    /**
     * Leaves this channel
     */
    public void leave() {
        chat.leaveChannel(this);
    }
}