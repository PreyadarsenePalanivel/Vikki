 int a,reverse=0,b=0;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        
         a=Integer.parseInt(sc.nextLine());
         while(a>0)
         {
             b=a%10;
             reverse=reverse*10+a;
             a=a/10;
      
         }  
            
        System.out.println(""+reverse);
        
    }