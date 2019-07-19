import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;

public class Otodom {

    public static void main(String[] args) throws Exception {

        URL otodom = new URL("https://www.otodom.pl/sprzedaz/mieszkanie/sopot/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(otodom.openStream()));

        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
            stringBuilder.append(System.lineSeparator());
        }
        in.close();
        String content = stringBuilder.toString();
        int linkIndex = content.indexOf("https://www.otodom.pl/oferta/");
        String substring = content.substring(linkIndex);
        String link = substring.split(".html")[0];
        System.out.println(link);

    }

}