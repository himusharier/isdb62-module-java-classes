package ClassWork.document_reader;

import java.util.Scanner;

public class Document implements Searchable{
    @Override
    public void search(String keyword) {

    }



    public static void main(String[] args) {
        String preUrl = "C:\\Users\\Java Student PC-6\\Documents\\B. M. Sharier Kabir (ID 1285464)\\1285464\\Java\\isdb62-module-java-classes\\src\\ClassWork\\question_four\\plainTextFile.txt";
        System.out.print("Enter file url: " + preUrl);
        Scanner input = new Scanner(System.in);
        //String url = input.nextLine();
        System.out.println("Enter searching keyword:");
        String keyword = input.next();

        Document document = new Document();
        document.search(keyword);
    }
}
