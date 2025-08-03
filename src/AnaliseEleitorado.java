public class AnaliseEleitorado {

    private int totalDeEleitores = 1000;
    private int votosValidos = 800;
    private int votosBrancos = 150;
    private int votosNulos = 50;

    public double percentualVotosValidos() {
        return (double) votosValidos / totalDeEleitores * 100;
    }

    public double percentualVotosBrancos() {
        return (double) votosBrancos / totalDeEleitores * 100;
    }

    public double percentualVotosNulos() {
        return (double) votosNulos / totalDeEleitores * 100;
    }
}