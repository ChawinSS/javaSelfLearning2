public class Cars{

    private String make;
    private String model;
    private int year;

    Cars(String make,String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
// for excess on the private varbale 

public String getModel(){
    return model;
}

public String getMake(){
    return make;
}

public int getYear(){
    return year;
}

//setter methord to change 
public void setModel(String model){
    this.model=model;
}

public void setMake(String make){
    this.make=make;
}

public void setYear(int year){
    this.year=year;
}
}
