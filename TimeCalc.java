public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        int TotalHours = minutesToAdd / 60; // total hours out of minutes
        int NewHours = TotalHours % 24; // actual hours to move
        int NewMinutes = (minutesToAdd - (TotalHours * 60)); // actual minutes to add

        hours = hours + NewHours;
        minutes = minutes + NewMinutes;

        if (minutes >= 60) {
            minutes = minutes % 60;
            hours = hours + 1;
        }

        if (hours == 24){
            hours = 00;
        }

        else if (hours > 24) {
            hours = hours % 24;
        } 

        String fhours;
		if (hours < 10) {
			fhours = "0" + hours;
		}
		else {
			fhours = String.valueOf(hours);
		}
    
        String fminutes;
		if (minutes < 10) {
			fminutes = "0" + minutes;
		}
		else {
			fminutes = String.valueOf(minutes);
		}
        
        System.out.println(fhours + ":" + fminutes);
        
// java TimeCalc.java 22:07 12345
// java TimeCalc.java 23:59 10
// java TimeCalc.java 10:30 4055
// java TimeCalc.java 07:31, 242
    }
}
