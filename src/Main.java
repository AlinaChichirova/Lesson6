public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone(89990000, "iPhone","black");
        Phone phone2=new Phone(89211111, "Samsung","black");
        Phone phone3=new Phone(89115555, "Honor","weight");
        System.out.printf("Номер телефона: %d , модель: %s , цвет: %s \n", phone1.number, phone1.model, phone1.weight);
        System.out.printf("Номер телефона: %d , модель: %s , цвет: %s \n", phone2.number, phone2.model, phone2.weight);
        System.out.printf("Номер телефона: %d , модель: %s , цвет: %s \n", phone3.number, phone3.model, phone3.weight);
        phone1.receiveCall("Alina");
        phone1.getNumber(89999999);

    }
}
class Phone {
    public int number = 0;
    public String model = null;
    public String weight = null;


    public Phone(int number, String model, String weight){
    this.number=number;
    this.model=model;
    this.weight=weight;
    }

    public Phone(int number, String model){
        this.number=number;
        this.model=model;
    }

    public void Phone(){
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }
    public void getNumber(int number){
        this.number=number;
        System.out.println("Номер телефона: " + number);
    }
}
