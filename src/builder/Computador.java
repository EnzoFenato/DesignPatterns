package builder;

public class Computador {
    private String processador;
    private String ram;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String ram, String armazenamento,
                      String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.ram = ram;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void exibir(String titulo) {
        System.out.println("=== '" + titulo + "' ===");
        System.out.println("Processador: " + processador);
        System.out.println("Ram: " + ram);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de Video: " + (placaDeVideo != null ? placaDeVideo : "N/A"));
        System.out.println("Sistema de Operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A"));
    }
}
