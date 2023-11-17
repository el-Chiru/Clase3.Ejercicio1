import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Gabriel", "Pablo", "Cesar", "Elizabeth", "Alejandro", "Ariel");
        String nombresEnMay = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(nombresEnMay);

    }
}
