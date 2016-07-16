 int i,f=1,n;
               
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        
         n=Integer.parseInt(sc.nextLine());
         for(i=1;i<=n;i++)
         {
             f=f*i;
         }
         System.out.println("factorial is"+f);
    }