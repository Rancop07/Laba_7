import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	/* Задание 1
	 Unchecked__________________________________________________:
	 value of - метод, який генерує виняток
	 parseDouble - метод, який генерує виняток

	 public static Double valueOf(String s) throws NumberFormatException
	 If s is null, then a NullPointerException is thrown.

     public static double parseDouble(String s) throws NumberFormatException
     NullPointerException - if the string is null
     NumberFormatException - if the string does not contain a parsable double.

     Checked_____________________________________________________:
        protected Object clone() throws CloneNotSupportedException
        CloneNotSupportedException - if the object's class does not support the Cloneable interface

        protected void finalize() throws Throwable

        public final void wait() throws InterruptedException
        IllegalMonitorStateException - if the current thread is not the owner of the object's monitor.
        InterruptedException - if any thread interrupted the current thread before or while the current thread
        was waiting for a notification.

 */

        Double_try_catch double_try_catch = new Double_try_catch();

        try {

            Solution_method_1 method_1 = new Solution_method_1("Андрій",19,30,20, 20);
            String name = method_1.getName();
            int age = method_1.getAge();
            method_1.noInteger(age);
            //method_1.parseInt("19");
            System.out.println("Привіт, " + name + "\n" + "Твій вік: " + age);

            int V1 = method_1.getV1();
            int V2 = method_1.getV2();
            int time= method_1.gettime();
            int way1 = V1*time;
            int way2 = V2*time;
            int result = way1-way2;
            System.out.println("Відстань між автомобілями становить:" +result +" км.");

        } catch (My_Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

    }
}
