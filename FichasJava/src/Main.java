import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int Sim,Nao;



        System.out.println("Você ama a Catarina?");
        System.out.println("Prima 1 para SIM e qualquer numero para Não");


        Sim = input.nextInt();


        if (Sim == 1) {


            System.out.println("Parabéns, você é uma pessoa incrivel");

        }else {
            System.out.println("Não tem escolha, você ama muito muito muito mais a Catarina seu mentiroso!!");

        }
        final int N = 10;

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= 4 * N; j++)
            {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * N; i++)
        {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                System.out.print('*');
            }

            System.out.print(System.lineSeparator());
        }



        }
    }

