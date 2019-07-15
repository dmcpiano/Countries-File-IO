package labseventeendmcpiano;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CountriesTextFile {

	private static Path filePath = Paths.get("countries.txt");
	
	public static void printFile() throws IOException {
        List<String> lines = Files.readAllLines(filePath);
        for (String thisLine : lines) {
            System.out.println(thisLine);
        }
    } 

    public static void appendToFile(Country country) throws IOException {
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("Sorry, that's not right.");
            }
        }
        List<String> countryList = Arrays.asList(country.toString());
        
        Files.write(filePath, countryList, StandardOpenOption.APPEND);

}
}
