import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Holidays {
    private List<String> days = new ArrayList<>(
            Arrays.asList("01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023",
                    "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"));
    private List<String> dayNames = new ArrayList<>(
            Arrays.asList("Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho",
                    "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados",
                    "Proclamação da República", "Natal"));

    public List<String> getAll() {
        List<String> holidays = new ArrayList<>();

        for (int i = 0; i < this.days.size(); i++) {
            String completeHoliday = days.get(i) + " - " + dayNames.get(i);
            holidays.add(completeHoliday);
        }

        return holidays;
    }

    public String isHoliday(String holiday) {
        if (this.days.contains(holiday)) {
            int holidayIndex = this.days.indexOf(holiday);
            return "O dia " + holiday + " é " + dayNames.get(holidayIndex);
        }

        return "Não há feriado na data " + holiday;
    }

}
