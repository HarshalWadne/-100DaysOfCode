  Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
             sum=n*(n+1)/2;
        }
        System.out.println("sum of first "+n+" numbers is "+sum);
