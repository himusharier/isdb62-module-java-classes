package HomeWork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawlerMetatags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.print("| Enter URL >> "); //https://
        String userUrl = input.next(); //take site link
        //userUrl = "https://" + userUrl;

        try {
            URL url = new URL(userUrl);
            Scanner urlScanner = new Scanner(url.openStream()); //capture everything from the link
            StringBuilder pageContents = new StringBuilder();

            //format datetime to generate filename:
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String formattedDateTime = currentDateTime.format(dateTimeFormatter);

            File file = new File("src/HomeWork/webCrawlerFiles/"+ formattedDateTime +".txt"); //create a text file
            PrintWriter printWriter = new PrintWriter("src/HomeWork/webCrawlerFiles/"+ formattedDateTime +".txt"); //open that text file

            boolean findBody = false;
            while (urlScanner.hasNext()) {
                String lines = urlScanner.nextLine();
                if (lines.contains("<head")) {
                    findBody = true;
                }
                if (findBody) {
                    pageContents.append(lines);
                }
                if (lines.contains("</head>")) {
                    break;
                }
            }

            String headerContent = pageContents.toString();
            //printWriter.println(headerContent); //saving into text file

            //extracting title:
            Pattern titlePattern = Pattern.compile("<title[^>]*>(.*?)</title>");
            Matcher titleMatcher = titlePattern.matcher(headerContent);
            String siteTitle;
            if (titleMatcher.find()) {
                siteTitle = titleMatcher.group(1);
            } else {
                siteTitle = "<no title found>";
            }
            //extracting description:
            Pattern descriptionPattern = Pattern.compile("<meta name=\"description\" content=\"(.*?)\".*?>");
            Matcher descriptionMatcher = descriptionPattern.matcher(headerContent);
            String siteDescription;
            if (descriptionMatcher.find()) {
                siteDescription = descriptionMatcher.group(1);
            } else {
                siteDescription = "<no description found>";
            }
            //extracting keywords:
            Pattern keywordsPattern = Pattern.compile("<meta name=\"keywords\" content=\"(.*?)\".*?>");
            Matcher keywordsMatcher = keywordsPattern.matcher(headerContent);
            String siteKeywords;
            if (keywordsMatcher.find()) {
                siteKeywords = keywordsMatcher.group(1);
            } else {
                siteKeywords = "<no keywords found>";
            }

            //writing into file:
            printWriter.println("Site link: " + userUrl);
            printWriter.println();
            printWriter.println("Site Details:");
            printWriter.println("-----------------------------------------");
            printWriter.println("Title: " + siteTitle);
            printWriter.println("Description: " + siteDescription);
            printWriter.println("Keywords: " + siteKeywords);

            printWriter.close(); //closing that text file
            System.out.println("| ✔️ Complete!");
            System.out.println("| 👉 File saved in: " + file.getAbsolutePath());

        } catch (MalformedURLException e) {
            System.out.println("Error: Your url is invalid!");

        } catch (IOException e) {
            System.out.println("Error: Your site is unreachable!");

        }
    }
}
