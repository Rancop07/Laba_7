public class Solution_method_1 {
    private String name;
    private int age;
    private int time;
    private int V1, V2;

    public Solution_method_1(String name, int age,int V1,int V2,int time){
        this.name = name;
        this.age = age;
        this.V1 = V1;
        this.V2 = V2;
        this.time = time;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getV1() {
        return V1;
    }
    public int getV2() {
        return V2;
    }
    public int gettime() {
        return time;
    }
    public void isNull(Float number) throws My_Exception {
        if(number == null)
            throw new My_Exception("Число є 0 ");

    }

    public void noInteger(int age) throws My_Exception {
        if(age < 0)
            throw new My_Exception("Число меньше нуля");

    }

    public void parseInt(String agee) throws My_Exception{
        if(!(this.age == Integer.parseInt(agee)))
            throw new My_Exception("Немає значень");      // Переданий рядок не містить чисел
    }
}
