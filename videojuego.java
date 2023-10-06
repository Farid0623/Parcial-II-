package Videojuegos;

public class videojuego {
    public static void main(String[] args) {
        VideoJuegos juego1 = VideoJuegos.DEPORTIVOS;
        VideoJuegos juego2 = VideoJuegos.AVENTURA;
        VideoJuegos juego3 = VideoJuegos.MUSICALES;
        VideoJuegos juego4 = VideoJuegos.ESTRATEGIA;
        VideoJuegos juego5 = VideoJuegos.SIMULACION;

        System.out.println("Juego 1: " + juego1.getNombrejuego());
        System.out.println("Cómo se juega: " + juego1.getComojugar());
        System.out.println("Año de creación: " + juego1.getAñodecreacion());

        System.out.println("Juego 2: " + juego2.getNombrejuego());
        System.out.println("Cómo se juega: " + juego2.getComojugar());
        System.out.println("Año de creación: " + juego2.getAñodecreacion());

        System.out.println("juego 3: " + juego3.getNombrejuego());
        System.out.println("como se juega: " + juego3.getComojugar() );
        System.out.println("Año de creación: " + juego3.getAñodecreacion());

        System.out.println("Juego 4: " + juego4.getNombrejuego());
        System.out.println("Cómo se juega: " + juego4.getComojugar());
        System.out.println("Año de creación: " + juego4.getAñodecreacion());

        System.out.println("Juego 5: " + juego5.getNombrejuego());
        System.out.println("Cómo se juega: " + juego5.getComojugar());
        System.out.println("Año de creación: " + juego5.getAñodecreacion());

        juego1.mostrarPosicionRanking();
        juego2.comprarMonedas();
    }
}

