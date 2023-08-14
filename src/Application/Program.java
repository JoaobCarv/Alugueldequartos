package Application;

import Entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.println("Quantos quartos serão alugados?");
        int rentQuantity = scanner.nextInt();

        for (int i=1; i<=rentQuantity; i++) {
        System.out.println("\nRent #" + i +":");
        scanner.nextLine();
        System.out.println("Nome: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Room: ");
        int roomNumber = scanner.nextInt();

        rooms[roomNumber] = new Rent(name,email);
        }

        System.out.println("\nQuartos ocupados:");
        for (int i =0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        scanner.close();
    }
}
