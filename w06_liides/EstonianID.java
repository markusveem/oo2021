import java.time.LocalDate;

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

        return gender % 2 == 0 ? "FEMALE" : "MALE";
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
    public int getAge() {

        int birthmonth = Integer.parseInt(code.substring(3,5));
        int birthday = Integer.parseInt(code.substring(6, 7));
        int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));
        return 0;
    }
    
}
