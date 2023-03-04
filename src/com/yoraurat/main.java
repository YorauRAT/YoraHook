package com.yoraurat;

import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" __     __             _    _             _    \n" +
                " \\ \\   / /            | |  | |           | |   \n" +
                "  \\ \\_/ /__  _ __ __ _| |__| | ___   ___ | | __\n" +
                "   \\   / _ \\| '__/ _` |  __  |/ _ \\ / _ \\| |/ /\n" +
                "    | | (_) | | | (_| | |  | | (_) | (_) |   < \n" +
                "    |_|\\___/|_|  \\__,_|_|  |_|\\___/ \\___/|_|\\_\\\n" +
                "                                               \n" +
                "                                               ");
        System.out.print("Webhook URL: ");
        String webhookurl = scan.nextLine();

        System.out.print("Avatar URL: ");
        String avatarurl = scan.nextLine();

        System.out.print("WebhookName: ");
        String webhookname = scan.nextLine();

        System.out.print("Message: ");
        String message = scan.nextLine();

        System.out.print("How many times: ");
        Integer howmanytimes = scan.nextInt();

        Webhook webhook = new Webhook(webhookurl);
        webhook.setUsername(webhookname);
        webhook.setAvatarUrl(avatarurl);
        webhook.setContent(message);

        try {
            for (int a = 0; a < howmanytimes; a++)
            webhook.execute();
        }catch (IOException ex){
            System.out.print("Bir hata oluştu.");
        }
    }
}
