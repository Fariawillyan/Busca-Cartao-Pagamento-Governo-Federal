import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BuscaCPGF {


    public static void main(String[] args) throws IOException {

        try {
            Files.lines(Paths.get("src\\Outubro21.csv"), StandardCharsets.ISO_8859_1)
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(col -> new CartaoCGPF(col[0], col[1], col[2], col[3], col[4],
                            col[5], col[6], col[7], col[8], col[9],
                            col[10], col[11], col[12], col[13], Integer.parseInt(col[14].replaceAll("[\\D]", ""))))

                    .filter(busca -> busca.getValorTransacao() > 5000000)
                    .forEach(System.out::println);

        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
