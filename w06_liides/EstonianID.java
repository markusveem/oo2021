import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.Period;    

public class EstonianID implements PersonalCodeBehaviour {
    private String code;

    public EstonianID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {

        int gender = Integer.parseInt(code.substring(0,1));

       /* if (gender % 2 == 0){
            return "Naine";

        }else{
            return "Mees";
        }*/

        return gender % 2 == 0 ? "naine" : "mees";
    }

    @Override
    public int getFullYear() {
        
       

        int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));
        return fullYear;

        

       
    }

    @Override
    public String getDOB() {
        
        int birthmonth = Integer.parseInt(code.substring(3,5));
        int birthday = Integer.parseInt(code.substring(6, 7));
        int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));

        return birthday+ "." + birthmonth + "." + fullYear;



    
    }

    @Override
    public String getAge() {

        int birthmonth = Integer.parseInt(code.substring(3,5));
        int birthday = Integer.parseInt(code.substring(6, 7));
        int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));
        //System.out.println(java.time.LocalDate.now());
        
        
        // date of birth
        LocalDate pdate = LocalDate.of(fullYear, birthmonth, birthday);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
        //System.out.printf("\n I m  %d years, %d months and %d days old.\n\n", diff.getYears(), diff.getMonths(), diff.getDays());

        
        //teeb stringiks asjad
        int year = diff.getYears();
        String yeaString = String.valueOf(year);  

        int month = diff.getMonths();
        String monthsString = String.valueOf(month);  
        
        int day = diff.getDays();
        String dayString = String.valueOf(day);  

       return "ma olen "+ yeaString + " aastat " + monthsString+ " kuud " + dayString+" aastat vana";
       //return null;
    }
    
}
