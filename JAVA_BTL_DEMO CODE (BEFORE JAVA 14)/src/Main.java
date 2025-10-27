import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.SATURDAY;
        String result = getDayType(today);
        System.out.println("Hôm nay là: " + result); // Sẽ in ra: Hôm nay là: Ngày cuối tuần
    }
    public static String getDayType(DayOfWeek day) {
        String typeOfDay; // 1. Khai báo biến tạm bên ngoài

        // 2. Dùng câu lệnh switch truyền thống
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Ngày trong tuần";
                break; // 3. Bắt buộc phải có "break"
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Ngày cuối tuần";
                break; // 3. Bắt buộc phải có "break"
            default: // 4. Thêm default để xử lý các trường hợp khác (an toàn hơn)
                throw new IllegalStateException("Ngày không hợp lệ: " + day);
        }

        return typeOfDay; // 5. Trả về biến tạm
    }

    // Phương thức main để chạy thử

}