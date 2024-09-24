// public class Method {
//     public static int add(int a,int b){
//         return a+b;
//     } 
//     public static void main(String[] args){
//         int res=add(2,2);
//         System.out.println(res);
//     }
// }



public class Method {
    public static void Email(String Name, String Job_role, int ID_number) {
        System.out.println("Thank you for applying " + Name +" "+ "in the ID of"+" "+ ID_number+ " for the " + Job_role +" "+ "role position in our company.");
    }

    public static void main(String[] args) {
        Email("SANTHU", "Developer", 2);
    }
}

