import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Holidays holidayManager = new Holidays();

        System.out.println("Olá, sou um verificador de feriados! Seja bem-vindo(a)!\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Caso queira receber a lista com todos os feriados do ano, tecle Enter!\n");

        System.out.println(
                "Porém, se quiser verificar a qual feriado uma determinada data é atribuída, digite qualquer letra e tecle Enter!\n");

        String choice = input.nextLine();

        if (choice == "") {
            List<String> holidays = holidayManager.getAll();
            System.out.println("Lista de feriados: \n");
            for (int i = 0; i < holidays.size(); i++) {
                System.out.println(holidays.get(i) + "\n");
            }
        } else {
            System.out.println(
                    "Digite a data que gostaria de verificar a qual feriado é atribuída conforme exemplo: '25/12/2023' \n");
            String date = input.nextLine();

            System.out.println("\n" + holidayManager.isHoliday(date));
        }

    }
}
