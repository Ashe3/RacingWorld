package ru.servers.gameServer.network;

import org.junit.Assert;
import org.junit.Test;
import ru.servers.gameServer.network.protocol.fromServer.InitializePositionAnswerPacket;

public class InitializePositionAnswerPacketTest {

    // Byte protocol:
    // [0] - protocol type
    // [1...4] - packet number
    // [5...8] - player token
    // [9] - result initialization of position

    @Test
    public void settingToken(){
        int token = 111;
        byte[] buffer = new byte[InitializePositionAnswerPacket.SIZE_PACKET];
        InitializePositionAnswerPacket packet = new InitializePositionAnswerPacket(buffer);
        packet.setToken(token);
        Assert.assertEquals(token, packet.getToken());
    }

    @Test
    public void settingResultInitialization(){
        byte[] buffer = new byte[InitializePositionAnswerPacket.SIZE_PACKET];
        InitializePositionAnswerPacket packet = new InitializePositionAnswerPacket(buffer);
        packet.setResultInitialization(true);
        Assert.assertTrue(packet.getResultInitialization());
    }

    @Test(expected = IllegalArgumentException.class)
    public void settingIncorrectBufferForNetworkPacket(){
        new InitializePositionAnswerPacket(new byte[]{});
    }

}