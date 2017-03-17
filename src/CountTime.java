/**
 * Created by brprashant on 6/1/16.
 */
public class CountTime {
    public static void main(String[] arge){

        System.out.println(solution("23:42", "00:45"));
        System.out.println(solution("23:42", "23:45"));
        System.out.println(solution("10:00", "13:21"));
        System.out.println(solution("09:42", "11:42"));
    }

    public static int solution(String E, String L) {
        // write your code in Java SE 8
        int entranceCost = 2;
        int firstHour = 3;
        int hourlyCost = 4;

        int enterHour = Integer.parseInt(E.substring(0,2));
        int enterMinute = Integer.parseInt(E.substring(3,5));
        int leaveHour = Integer.parseInt(L.substring(0,2));
        int leaveMinute = Integer.parseInt(L.substring(3,5));

        int totalCost = entranceCost;
        Time start = new Time(enterHour,enterMinute);
        int minutes = start.minutesToTime(leaveHour,leaveMinute);

        if (minutes<=60){
            totalCost+=firstHour;
            minutes-=60;
        }
        if (minutes>60){
            totalCost+=firstHour;
            minutes-=60;
        }
        while (minutes>0){
            totalCost+=hourlyCost;
            minutes-=60;
        }
        return totalCost;
    }


    static class Time{
        int hour;
        int min;

        Time(int hour, int min){
            assert(hour>=0);
            assert(hour<=23);
            assert(min>=0);
            assert(min<=59);

            this.hour=hour;
            this.min=min;
        }

        void addHour(){
            if (hour == 23){
                hour = 0;
            } else {
                hour = hour+1;
            }
        }

        boolean zeroHour(){
            return hour==0;
        }

        void completeHour(){
            if (hour==23) {
                hour = 0;
                min =0;
            } else {
                hour=hour+1;
                min=0;
            }
        }
        int minutesToHour(){
            return 60-min;
        }

        int minutesToTime(int timeHour, int timeMin) {
            int retVal=0;
            if ( timeHour==hour ){
                if (timeMin > min) return timeMin-min;
            }
            retVal += minutesToHour();
            completeHour();
            if (timeHour<hour){
                while (!zeroHour()){
                    completeHour();
                    retVal+=60;
                }
            }
            while(hour<timeHour){
                addHour();
                retVal=retVal+60;
            }
            if (timeMin>0)
            retVal+=timeMin;
            return retVal;
        }
    }
}
