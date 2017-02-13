/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pochesnokubot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import model.User;
import model.Bills;


/**
 *
 * @author HP
 */
public class PoChesnokuBot extends TelegramLongPollingBot{

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try{
            telegramBotsApi.registerBot(new PoChesnokuBot());
        }catch (TelegramApiException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getBotToken() {
        return "309764155:AAEvUbVFXm1BszEIJ32-OMJPPfAttftCxss";
    }

    @Override
    public String getBotUsername() {
        return "PoChesnokuBot";
    }
    
    @Override
    public void onUpdateReceived(Update update) {
               
        Message message = update.getMessage();
        User user = new User(message.getChat().getUserName());
        switch (message.getText()){
                case "/start" : break;
                case "/new":    Bills.createBill(user); break;
                case "/join":   Bills.connectToBill(user);break;
        }
                
    }
    
}

