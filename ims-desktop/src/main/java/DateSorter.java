import java.util.Calendar;
import java.util.Date;


public class DateSorter {



	
	public static int getSeason(String date){
		
    int month = Integer.parseInt(date.substring(5,7));
		
	System.out.println(month);
		if(month < 5 && month !=1){
			System.out.println("Spring");
			return 0;
		}else if(month < 8 && month !=1){
			System.out.println("Summer");
			return 1;
		}else if(month < 11 && month !=1){
			System.out.println("Autumn");
			return 2;
		}else{
			System.out.println("Winter");
			return 3;
		}
	}
	
	
	public static int getSeason(int month){
		
	   
			
		System.out.println(month);
			if(month < 5 && month !=1){
				System.out.println("Spring");
				return 0;
			}else if(month < 8 && month !=1){
				System.out.println("Summer");
				return 1;
			}else if(month < 11 && month !=1){
				System.out.println("Autumn");
				return 2;
			}else{
				System.out.println("Winter");
				return 3;
			}
		}

}
