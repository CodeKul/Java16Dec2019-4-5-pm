package keywords;

public class ThisKeyBrushup {

    String name;
    int age;
    String address;

    ThisKeyBrushup(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public ThisKeyBrushup() {
        this("Codekul",5,"Kothrud Depot");

    }

    void getData(){
        this.showData();
    }

    void showData(){

        System.out.println(
                "name : "+name+"\n"+
                "age : "+age+"\n"+
                "address : "+address+"\n"
        );

    }

    public static void main(String[] args) {
        ThisKeyBrushup brushup=new ThisKeyBrushup();
        brushup.showData();
    }

}
