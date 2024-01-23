class Hello
{
    int AddTowNumbers(int num1,int num2){
     return num1+num2;
    }
    public static void main(String[] args) 
    {
        Hello hello = new Hello();
       int sum = hello.AddTowNumbers(30, 40);
        System.out.println("Hello world \n "+sum);
    }
}