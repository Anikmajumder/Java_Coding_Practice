package Inheritence;

public class Teacher extends Person {
   private String qualification;

   private String getQualification(){
    return qualification;
   }

   public void setQualification(String qualification){
    this.qualification = qualification;
   }

    void displayInformation2(){
        displayInformation();
        System.out.println("qualifiation: "+qualification);
    }
}
