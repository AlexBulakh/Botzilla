package com.botzilla;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {

        update.getUpdateId();

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        if (update.getMessage().getText().equals("/start")) {
            sendMessage.setText("Привет, меня зовут Botzilla)");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }


    }

    public String getBotUsername() {
        return "@Bot7iLLa_Bot";
    }

    public String getBotToken() {
        return "***token***";
    }
}
