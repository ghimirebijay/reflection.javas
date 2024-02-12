public class switchexample {
    Scanner in = new Scanner(System.in);
    System.out.print("Select an option (1,2,3,4)");
    int choice= in.nextInt();
    switch(choice)
    {
        case 1:
        System.out.println("It's a cake");
        break;
        case 2:
        System.out.println("Its a pizza");
        break;
        case 3:
        System.out.println("It's a juice");
        break;
        case 4:
        System.out.println("It's a beer, cheers!!");
        break;
    }
    
}
