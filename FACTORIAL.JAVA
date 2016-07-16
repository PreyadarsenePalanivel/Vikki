 int i,fact=1,a,n;
               
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        
         n=Integer.parseInt(sc.nextLine());
         for(i=1;i<=n;i++)
         {
             fact=fact*i;
         }
         System.out.println("factorial is"+fact);
    }