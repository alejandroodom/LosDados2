import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Nombre del jugador 1? \n");
        JugadorGuerra jugador1 = new JugadorGuerra(scanner.nextLine());

        System.out.print("¿Nombre del jugador 2? \n");
        JugadorGuerra jugador2 = new JugadorGuerra(scanner.nextLine());

        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;

        while (jugador1.getFichas() > 0 && jugador2.getFichas() > 0) {
            int dadoJugador1 = jugador1.lanzarDado();
            int dadoJugador2 = jugador2.lanzarDado();

            System.out.println(jugador1.getNombre() + " ha sacado un " + dadoJugador1);
            System.out.println(jugador2.getNombre() + " ha sacado un " + dadoJugador2);

            if (dadoJugador1 > dadoJugador2) {
                System.out.println(jugador1.getNombre() + " gana");
                jugador1.restarFicha();
                puntajeJugador1++;
            } else if (dadoJugador2 > dadoJugador1) {
                System.out.println(jugador2.getNombre() + " gana");
                jugador2.restarFicha();
                puntajeJugador2++;
            } else {
                System.out.println("Empate");
            }

            System.out.println("Marcador: " + jugador1.getNombre() + " " + jugador1.getFichas() + " - " + jugador2.getNombre() + " " + jugador2.getFichas());
            System.out.println();
        }

        if (jugador1.getFichas() == 0) {
            System.out.println(jugador2.getNombre() + " ha ganado");
        } else {
            System.out.println(jugador1.getNombre() + " ha ganado");
        }
    }
}