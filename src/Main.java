import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Loginc ln = new Loginc();

	public static void realtt()
	{
		
	}

public static void vehicleregn(){
	
}
public static void shrt() {
	
}
public static void hosp() {
	
}
public static void updacc() {}
public static void updvlog() {}
public static void vlegalrec() {}
public static void trafhist() {}
public static void upddet() {}
	public static void usermg()
	{
		String u,p;
		Scanner s = new Scanner(System.in);
		System.out.println("+-------------------------------------------+");
        System.out.println("|               MANAGE USERS                |");
        System.out.println("+-------------------------------------------+");
		System.out.println("+--------------+   +-----------------+  +-----------------+  +------------------+  +----------------------+");
        System.out.println("| 1. ADD USER  |   | 2. DELETE USER  |  | 3. MODIFY USER  |  | 4. DISPLAY USER  |  | 5. DISPLAY USER LIST |");
        System.out.println("+--------------+   +-----------------+  +-----------------+  +------------------+  +----------------------+");
		int c = Integer.parseInt(s.nextLine());
		switch(c)
		{
			case 1: 
				System.out.println("Enter username");
				u = s.nextLine();
				System.out.println("Enter password");
				p = s.nextLine();
				Loginc.signup(u,p);
				u = null;
				p = null;
				break;
			case 2: 
				System.out.println("Enter username");
				u = s.nextLine();
				Loginc.delete(u);
				u = null;
				break;
			case 3:
				System.out.println("Enter username");
				u = s.nextLine();
				Loginc.modify(u);
				u = null;
				break;
			case 4:
				Loginc.listusers();
				u = null;
				break;
		}
	}
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int c1,c2;
        System.out.println("\t\t\t\t\t  _______         __  __ _                             \r\n"
		  		+ "\t\t\t\t\t |__   __|       / _|/ _(_)                            \r\n"
		  		+ "\t\t\t\t\t    | |_ __ __ _| |_| |_ _  ___                        \r\n"
		  		+ "\t\t\t\t\t    | | '__/ _` |  _|  _| |/ __|                       \r\n"
		  		+ "\t\t\t\t\t    | | | | (_| | | | | | | (__                        \r\n"
		  		+ "\t\t\t\t\t    |_|_|  \\__,_|_| |_| |_|\\___|        _              \r\n"
		  		+ "\t\t\t\t\t                       (_) |           (_)             \r\n"
		  		+ "\t\t\t\t\t  _ __ ___   ___  _ __  _| |_ ___  _ __ _ _ __   __ _  \r\n"
		  		+ "\t\t\t\t\t | '_ ` _ \\ / _ \\| '_ \\| | __/ _ \\| '__| | '_ \\ / _` | \r\n"
		  		+ "\t\t\t\t\t | | | | | | (_) | | | | | || (_) | |  | | | | | (_| | \r\n"
		  		+ "\t\t\t\t\t |_|_|_| |_|\\___/|_| |_|_|\\__\\___/|_|  |_|_| |_|\\__, | \r\n"
		  		+ "\t\t\t\t\t  / ____|         | |                            __/ | \r\n"
		  		+ "\t\t\t\t\t | (___  _   _ ___| |_ ___ _ __ ___             |___/  \r\n"
		  		+ "\t\t\t\t\t  \\___ \\| | | / __| __/ _ \\ '_ ` _ \\                   \r\n"
		  		+ "\t\t\t\t\t  ____) | |_| \\__ \\ ||  __/ | | | | |                  \r\n"
		  		+ "\t\t\t\t\t |_____/ \\__, |___/\\__\\___|_| |_| |_|                  \r\n"
		  		+ "\t\t\t\t\t          __/ |                                        \r\n"
		  		+ "\t\t\t\t\t         |___/ ");

//		  LogOp.addVehicle();
//		  LogOp.addVehicle();
//		  LogOp.addVehicle();
//		  

//         System.out.println(LogOp.vehicle.size());


	while(Loginc.status==0)
	{
	Loginc.Login();
	}

        if (Loginc.status==1)
        {
        int opt = -1;
        while(opt!=0)
        {
	    int auth = Loginc.userlist.get(Loginc.id).authorization;
		// auth == 0, naive user
		
		//1. real time traffic
		//2. vehicle regn details
		//3. shortest route
		//4. nearby hospitals
	
		//auth == 1, police
		//1. real time traffic
		//2. update accident log
		//3. update traffic violation log
		//4. vehicle registration details
		//5. vehicle legal track record
		//6. shortest route
		//7. nearby hospitals 
		
		//auth == 2, data analyst (naive user but with traffic history access)
		
		//1. real time traffic
		//2. vehicle regn details
		//3. shortest route
		//4. nearby hospitals
		//5. traffic history
		
		// auth == 3, admin
	
		//1. user management
		//2. update accident log
		//3. update details
		//4. update violation log
		//5. traffic real time
		//6. traffic history
		//7. nearby hospitals
		//8. shortest route
		//9. vehicle regn details
		//10. vehicle track record
		
		System.out.println("Menu");
		System.out.println("0. logout \n 1. real time traffic \n 2. vehicle regn details \n 3. shortest route \n 4. nearby hospitals \n ");
		
		
		if(auth == 0 )
		{
			opt = Integer.parseInt(input.nextLine());
			System.out.println("ENTER OPTION \n");
			switch(opt)
			{
					case 0: Loginc.status = 0; Loginc.id = -1; 
						break;
					case 1: realtt();
						break;
					case 2: vehicleregn();
						break;
					case 3: shrt();
						break;
					case 4: hosp();
						break;
					default: System.out.println("Invalid");
			}
		}
		
		
		else if(auth == 1)
		{
			System.out.println("5.  update accident log \n 6. update traffic violation log \n 7. vehicle legal track record \n");
			System.out.println("ENTER OPTION \n");
			opt = Integer.parseInt(input.nextLine());	
			switch(opt)
			{
					case 0: Loginc.status = 0; Loginc.id = -1; 
						break;
					case 1: realtt();
						break;
					case 2: vehicleregn();
						break;
					case 3: shrt();
						break;
					case 4: hosp();
						break;
					case 5: updacc();
						break;
					case 6: updvlog();
						break;
					case 7: vlegalrec();
						break;
					default: System.out.println("Invalid");
			}
		}
		
		
		
		else if(auth == 2)
		{
			System.out.println("5. traffic history \n");
			System.out.println("ENTER OPTION \n");
			opt = Integer.parseInt(input.nextLine());
			switch(opt)
			{
					case 0: Loginc.status = 0; Loginc.id = -1; 
						break;
					case 1: realtt();
						break;
					case 2: vehicleregn();
						break;
					case 3: shrt();
						break;
					case 4: hosp();
						break;
					case 5: trafhist();
						break;
					default: System.out.println("Invalid");
			}
		}
		
		
		
		
		else if(auth == 3)
		{
			System.out.println("5.  update accident log \n 6. update traffic violation log \n 7. vehicle legal track record \n 8. traffic history \n 9. user management \n 10.update details \n");
			System.out.println("ENTER OPTION \n");
			opt = Integer.parseInt(input.nextLine());
			switch(opt)
			{
					case 0: Loginc.status = 0; Loginc.id = -1; 
						break;
					case 1: realtt();
						break;
					case 2: vehicleregn();
						break;
					case 3: shrt();
						break;
					case 4: hosp();
						break;
					case 5: updacc();
						break;
					case 6: updvlog();
						break;
					case 7: vlegalrec();
						break;
					case 8: trafhist();
						break;
					case 9: usermg();
						break;
					case 10: upddet();
						break;
					default: System.out.println("Invalid");
			}
		
		}
        }
		//1. user management
		//2. update accident log
		//3. update details
		//4. update violation log
		//5. traffic real time
		//6. traffic history
		//7. nearby hospitals
		//8. shortest route
		
            //TRAFFIC POLICE
//            System.out.println("+---------------------------------+                +---------------------------------+ ");
//            System.out.println("|Enter 1 for ACCIDENT LOG         |                |Enter 2 for TRAFFIC VIOLATION LOG|");
//            System.out.println("+---------------------------------+                +---------------------------------+ ");
//            System.out.println("======================================================================================= ");
//            c1 = input.nextInt();
//            if(c1 ==1||c1 ==2)
//            {
//                System.out.println("+-------------------------------------------+");
//                System.out.println("|		1. DISPLAY LOG		    |");
//                System.out.println("+-------------------------------------------+");
//                System.out.println("+-------------------------------------------+");
//                System.out.println("|		2. ADD LOG		    |");
//                System.out.println("+-------------------------------------------+");
//                System.out.println("+-------------------------------------------+");
//                System.out.println("|		3. DELETE LOG		    |");
//                System.out.println("+-------------------------------------------+");
//                c2 = input.nextInt();
//                if(c1==1)
//                {
//                    switch(c2)
//                    {
//                        case 1: LogOp.listAccident();
//                            break;
//                        case 2: LogOp.addAccident();
//                            break;
//                        case 3: LogOp.deleteAccident();
//                            break;
//                        default: System.out.println("INVALID INPUT");
//                    }
//
//                }
//                else
//                {
//                    switch(c2)
//                    {
//                        case 1: LogOp.listViolation();
//                            break;
//                        case 2: LogOp.addViolation();
//                            break;
//                        case 3: LogOp.deleteViolation();
//                            break;
//                        default: System.out.println("INVALID INPUT");
//                    }
//                }
//            }
//            else
//                System.out.println("INVALID INPUT");
//
//
//
//            //PENALTY PAY
//            System.err.println("+--------------------------+");
//            System.err.println("|     CHECK VIOLATION      |");
//            System.err.println("+--------------------------+");
//            LogOp.CheckViolation();
//
        	}








//input.close();
    }
}
