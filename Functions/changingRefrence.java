package Functions;

public class changingRefrence {
    public static void main(String[] args) {
        String name = "Kunal";
        changeName(name);//Here a copy of value of name is passed to the function
        System.out.println(name);
    }
    public static void changeName(String naam){
        naam = "Rahul";//creating a new object
        //Here naam is assigned new valye ie Rahul but the original value of
        //name will not change as its copy was passed but not the variable itself
    }
}
