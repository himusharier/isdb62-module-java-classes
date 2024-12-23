package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawlerLinks_BufferedReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.print("| Enter URL >> ");
        String userUrl = input.next(); //take site link
        //userUrl = "https://" + userUrl;

        try {
            URL url = new URL(userUrl);
            //Scanner urlScanner = new Scanner(url.openStream()); //capture everything from the link
            BufferedReader urlScanner = new BufferedReader(new InputStreamReader(url.openStream())); //capture everything from the link
            StringBuilder bodyContents = new StringBuilder();

            boolean findBody = false;
            String lines;
            while ((lines = urlScanner.readLine()) != null) {
                if (lines.contains("<body")) {
                    findBody = true;
                }
                if (findBody) {
                    bodyContents.append(lines);
                }
                if (lines.contains("</body>")) {
                    break;
                }
            }

            //ArrayList<String> siteLinkList = new ArrayList<>();
            HashSet<String> siteLinkList = new HashSet<>();
            String bodyTexts = bodyContents.toString();

            //extracting links:
            Pattern linkPattern = Pattern.compile("href=[\"'](http[s]?://[^\"']+)[\"']");
            Matcher linkMatcher = linkPattern.matcher(bodyTexts);
            String siteLink;

            while (linkMatcher.find()) {
                siteLink = linkMatcher.group(1);
                siteLinkList.add(siteLink);
            }

            System.out.println();
            System.out.println("| Found links:");
            System.out.println("------------------>");
            int i = 1;
            for (String link : siteLinkList) {
                System.out.println(i++ + ") " + link);
            }
            System.out.println(bodyTexts);

        } catch (MalformedURLException e) {
            System.out.println("Error: Your url is invalid!");

        } catch (IOException e) {
            System.out.println("Error: Your site is unreachable!");

        }
    }
}
