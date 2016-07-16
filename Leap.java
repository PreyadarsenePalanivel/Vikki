  int a;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        
         a=Integer.parseInt(sc.nextLine());
         if(a%4==0)
         {
             System.out.println("leap year");
         }
         else
         {
             System.out.println("not leap year");
    }
}}