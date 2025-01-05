package org.example.Models;

import java.util.Scanner;

public class Content {
    private Long contentId;
    private String type;

    public void uploadContent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter content to upload: ");
        String content = sc.nextLine();
        System.out.println("Uploaded Content: " + content);
    }
}
