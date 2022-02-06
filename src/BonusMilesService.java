public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonus = 20;
        int miles = ticketPrice / bonus;
        return miles;
    }
}
