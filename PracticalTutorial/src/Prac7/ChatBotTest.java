package Prac7;

import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.Test;

public class ChatBotTest {

    @Test
    public void testHelp() {
        // first check it doesn't reply to messgaes like help
        assertEquals(null, debugging.ChatBot.replyTo("help"));
        assertEquals(null, debugging.ChatBot.replyTo("!help me"));
        assertEquals(null, debugging.ChatBot.replyTo("/help"));

        // then check it does reply correctly to the actual help message - using hash codes to test
        // even though they're less accurate because hash collisions are unlikely enough that most
        // errors will still be caught - also I don't want to type out that entire help message
        // twice
        assertEquals(-1485316661, debugging.ChatBot.replyTo("!help").hashCode());
    }

    @Test
    public void guessingGame() {
        assertEquals("yes", debugging.ChatBot.replyTo("guess higher 0"));
        assertEquals("yes", debugging.ChatBot.replyTo("guess lower 100"));
        assertEquals("no", debugging.ChatBot.replyTo("guess higher 50"));
        assertEquals("yes", debugging.ChatBot.replyTo("guess higher 25"));
        assertEquals("yes", debugging.ChatBot.replyTo("guess higher 37"));
        assertEquals("no", debugging.ChatBot.replyTo("guess higher 43"));
        assertEquals("yes", debugging.ChatBot.replyTo("guess higher 40"));
        assertEquals("you lose!", debugging.ChatBot.replyTo("guess equal 41"));
    }
}
