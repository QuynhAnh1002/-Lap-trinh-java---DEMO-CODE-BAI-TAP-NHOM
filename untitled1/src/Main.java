public class Main {
    public static void main(String[] args) {
        //String day ="M"; (trả về kết quả là MWF)
        String day = "Z";
        String result;
        switch (day) {
            case "M":
            case "W":
            case "F":
                result = "MWF";
                break;
            case "T":
            case "TH":
            case "S":
                result = "TTS";
                break;

            //Nhánh default
            default: {
                if (day.isEmpty()) {
                    result = "Please insert a valid day.";
                } else {
                    result = "Looks like a Sunday.";
                }
                break;
            }
        }

        System.out.println(result);
    }
}