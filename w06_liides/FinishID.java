import java.time.LocalDate;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.Period;    

public class FinishID implements PersonalCodeBehaviour {
    private String code;

    public FinishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {

        int gender = Integer.parseInt(code.substring(9,10));
        
        return gender % 2 == 0 ? "Mies" : "nainen";
    }

    @Override
    public int getFullYear() {
        

        int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));
        return fullYear;

        

       
    }

    @Override
    public String getDOB() {
        
        int birthmonth = Integer.parseInt(code.substring(2,4));
        //System.out.println(birthmonth);
        
        int birthday = Integer.parseInt(code.substring(0,2));
        //System.out.println(birthday);

        String century =(code.substring(6,7));
       System.out.println(century);

       int yearPrefix = 0;
       if(century.equals( "-")){
           yearPrefix = 1900;
       }else if (century.equals( "+")){
           yearPrefix = 1800;
       }else{
           yearPrefix = 2000;
       }
        
        //int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));
        int year = yearPrefix + Integer.parseInt(code.substring(4,6));
        //System.out.println(yearPrefix+year);
       //System.out.println(year);

       
       
       return birthday+ "." + birthmonth + "." + year;




    
    }

    @Override
    public String getAge() {

        int birthmonth = Integer.parseInt(code.substring(2,4));
        //System.out.println(birthmonth);
        
        int birthday = Integer.parseInt(code.substring(0,2));
        //System.out.println(birthday);

        String century =(code.substring(6,7));

       int yearPrefix = 0;
       if(century.equals( "-")){
           yearPrefix = 1900;
       }else if (century.equals( "+")){
           yearPrefix = 1800;
       }else{
           yearPrefix = 2000;
       }
        
        int year = yearPrefix + Integer.parseInt(code.substring(4,6));
        
        // date of birth
        LocalDate pdate = LocalDate.of(year, birthmonth, birthday);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
        
        //teeb stringiks asjad
        int yeardiff = diff.getYears();
        String yeaString = String.valueOf(yeardiff);  

        int month = diff.getMonths();
        String monthsString = String.valueOf(month);  
        
        int day = diff.getDays();
        String dayString = String.valueOf(day);  

       return "olet "+ yeaString + " vuotta " + monthsString+ " kuukausi " + dayString+" vuotias";
    }
    
}

