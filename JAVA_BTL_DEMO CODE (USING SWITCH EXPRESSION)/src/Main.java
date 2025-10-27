import java.time.DayOfWeek;
public class Main {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;
        String result = getDayType(today);

        // In kết quả ra màn hình
        System.out.println("Hôm nay là: " + result); // Sẽ in ra: Kết quả: Ngày làm việc
    }

    public static String getDayType(DayOfWeek day) {
        // Gọn gàng, an toàn và biểu cảm hơn rất nhiều
        String typeOfDay = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Ngày trong tuần";
            case SATURDAY, SUNDAY -> "Ngày cuối tuần";
        };
        return typeOfDay;
    }
}

