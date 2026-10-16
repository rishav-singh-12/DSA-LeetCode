class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };
        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            monthDays[1] = 29;
        }
        int total = 0;
        for (int y = 1971; y < year; y++) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
                total += 366;
            else
                total += 365;
        }
        for (int m = 0; m < month - 1; m++) {
            total += monthDays[m];
        }
        total += day;
        return days[(total + 4) % 7];
    }
}