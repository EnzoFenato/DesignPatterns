package builder;

public class Main {
    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .setProcessador("Intel Core i5")
                .setRam("8GB")
                .setArmazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .setProcessador("Intel Core i9")
                .setRam("32GB")
                .setArmazenamento("1TB SSD")
                .setPlacaDeVideo("NVIDIA RTX 4070")
                .build();

        basico.exibir("Computador Básico");
        System.out.println();
        gamer.exibir("Computador Gamer");
    }
}