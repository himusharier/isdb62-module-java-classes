package ClassLectures.fiftinthClass;


import tech.bisew.isdb.eighthClass.computer.Computer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    public static void main(String[] args) {

        String url = "https://www.prothomalo.com";
        crawlWeb(url);

        ArrayList<String> strings = new ArrayList<>();
        int a, b, c, d;

        Computer computer = new Computer();

        double v = 100.21;
        Double v3 = 100.21;
        double v1 = 100.21d;
        double v2 = 100.21D;
        Long aLong = 12L;
        String clazz = "xxx";
    }

    public static void crawlWeb(String startingURL) {
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();

        pendingURLs.add(startingURL);

        while (!pendingURLs.isEmpty() && traversedURLs.size() < 100) {
            String currentURL = pendingURLs.removeFirst();

            if (!traversedURLs.contains(currentURL)) {
                traversedURLs.add(currentURL);

                System.out.println("Crawling: " + currentURL);

                ArrayList<String> subURLs = getSubURLs(currentURL);

                for (String subURL : subURLs) {
                    if (!traversedURLs.contains(subURL)) {
                        pendingURLs.add(subURL);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> subURLs = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            InputStream iqram = url.openStream();
            InputStreamReader hemel = new InputStreamReader(iqram);
            BufferedReader reader = new BufferedReader(hemel);

            String line;
            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("href=\"(http[^\"]+)\"");
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    String foundURL = matcher.group(1);
                    subURLs.add(foundURL);
                }
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return subURLs;
    }
}
