package builder;

public class ComputadorBuilder {
    private String processador;
    private String ram;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public ComputadorBuilder setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        return new Computador(processador, ram, armazenamento, placaDeVideo, sistemaOperacional);
    }
}
