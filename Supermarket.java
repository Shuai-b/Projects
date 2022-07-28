import java.io.*;
import java.util.*;
import java.lang.*;
class auchan 
{
	Scanner sc=new Scanner (System.in);
	double total=0.0,amt=0.0,change=0.0;
	int serial[]=new int[50];
	String dairy[]=new String[20];
	String fruit[]=new String[35];
	String stationary[]=new String[36];
	String cloth[]=new String[25];
	String electronic[]=new String[22];
	String sel[]=new String[36];
	double cost[]=new double[36];
	double cost1[]=new double[36];
	double cost2[]=new double[36];
	double cost3[]=new double[36];
	double cost4[]=new double[36];
	double price[]=new double[36];
	double quantity[]=new double[36];
	int c=0,z=0,p=0,j=0,y,d,w,i,ch;
	String g="";
	String name="";
	void items()
	{
		dairy[0]=" ";
		dairy[1]="Amul Milk                      ";
		dairy[2]="Amul Cheese Slice              ";
		dairy[3]="Amul Cheese Cubes              ";
		dairy[4]="Amul Butter 100g               ";
		dairy[5]="Amul Butter 500g               ";
		dairy[6]="Amul Paneer Cubes              ";
	    dairy[7]="Amul Mithai Maid               ";
	    dairy[8]="Nandhini Milk                  ";
	    dairy[9]="Nandhini Paneer 200g           ";
	    dairy[10]="Mother Dairy Milk             ";
	    dairy[11]="Mother Dairy Cheese Slice     ";
	    dairy[12]="Mother Dairy Paneer 200g      ";
	    dairy[13]="Mother Dairy Milk Maid        ";
	    dairy[14]="Milky Mist Cheese Cubes       ";
	    dairy[15]="Milky Mist Mozorella Cheese   ";
	    dairy[16]="Milky Mist Butter 100g        ";
	    dairy[17]="Milky Mist Butter 500g        ";
	    dairy[18]="Milky Mist Paneer 200g        ";
	    dairy[19]="Nestle Milk Maid              ";
	    
	    cost[1]=26.00;
	    cost[2]=60.00;
	    cost[3]=110.00;
	    cost[4]=32.00;
	    cost[5]=172.00;
	    cost[6]=310.00;
	    cost[7]=92.00;
	    cost[8]=28.00;
	    cost[9]=60.00;
	    cost[10]=20.00;
	    cost[11]=62.00;
	    cost[12]=80.00;
	    cost[13]=100.00;
	    cost[14]=120.00;
	    cost[15]=120.00;
	    cost[16]=30.00;
	    cost[17]=210.00;
	    cost[18]=85.00;
	    cost[19]=110.00; 
	    	
	    fruit[0]="  ";
	    fruit[1]="Baby Corn        ";
	    fruit[2]="Beans            ";
	    fruit[3]="Bitter Guard     ";
	    fruit[4]="Cabbage          ";
	    fruit[5]="Capsicum         ";
	    fruit[6]="Carrot           ";
	    fruit[7]="Coconut          ";
	    fruit[8]="Drumstick        ";
	    fruit[9]="Garlic           ";
	    fruit[10]="Ginger          ";
	    fruit[11]="Peas            ";
	    fruit[12]="Onion           ";
	    fruit[13]="Potato          ";
	    fruit[14]="Raddish         ";
	    fruit[15]="Tomato          ";
	    fruit[16]="Beet Root       ";
	    fruit[17]="Bottle Guard    ";
	    fruit[18]="Apple           ";
	    fruit[19]="Banna           ";
	    fruit[20]="Grapes          ";
	    fruit[21]="Guava           ";
	    fruit[22]="Mango           ";
	    fruit[23]="Strawberry      ";
	    fruit[24]="Kiwi            ";
	    fruit[25]="Custard Apple   ";
	    fruit[26]="Dragon Fruit    ";	   
	    fruit[27]="Mosambi         ";
	    fruit[28]="Orange          ";
	    fruit[29]="Papaya          ";
	    fruit[30]="Pineapple       ";
	    fruit[31]="Pomogranet      ";
	    fruit[32]="Water melon     ";
	    fruit[33]="Chicco          ";
	    fruit[34]="Black grapes    ";
	    
	    cost1[1]=23.00;
	    cost1[2]=40.00;
	    cost1[3]=27.00;
	    cost1[4]=13.00;
	    cost1[5]=24.00;
	    cost1[6]=42.00;
	    cost1[7]=15.00;
	    cost1[8]=54.00;
	    cost1[9]=174.00;
	    cost1[10]=48.00;
	    cost1[11]=120.00;
	    cost1[12]=17.00;
	    cost1[13]=28.00;
	    cost1[14]=28.00;
	    cost1[15]=28.00;
	    cost1[16]=19.00;
	    cost1[17]=31.00;
	    cost1[18]=130.00;
	    cost1[19]=65.00;
	    cost1[20]=94.00;
	    cost1[21]=62.00;
	    cost1[22]=108.00;
	    cost1[23]=42.00;
	    cost1[24]=70.00;
	    cost1[25]=52.00;
	    cost1[26]=108.00;
	    cost1[27]=52.00;
	    cost1[28]=70.00;
	    cost1[29]=52.00;
	    cost1[30]=52.00;
	    cost1[31]=160.00;
	    cost1[32]=14.00;
	    cost1[33]=60.00;
	    cost1[34]=52.00;
	    
	    stationary[0]="  ";
		stationary[1]="Staedtler 763 click pencil        ";
		stationary[2]="Staedtler 777 click pencil        ";
		stationary[3]="Staedtler mars eraser             ";
		stationary[4]="Staedtler noris erasr             ";
		stationary[5]="Staedtler noris pencil            ";
	    stationary[6]="Staedtler water color pencils     ";
		stationary[7]="Faber Castell erasers             ";
		stationary[8]="Faber Castell scale               ";
		stationary[9]="Faber Castell sharpener           ";
		stationary[10]="Faber Castell tricolor pencils   ";
		stationary[11]="Faber Castell Bicolor pencils    ";
		stationary[12]="Faber Castell highlighter        ";
		stationary[13]="Faber Castell water color pencils";
		stationary[14]="Faber Castell pencils            ";
		stationary[15]="Faber Castell plastic crayons    ";
		stationary[16]="Faber Castell wax crayons        ";
		stationary[17]="Faber Castell geometry box       ";
		stationary[18]="Camlin color pencils             ";
		stationary[19]="Camlin wax crayons               ";
		stationary[20]="Camlin Bi-colour pencils         ";
		stationary[21]="Camlin exam pencil               ";
		stationary[22]="Camlin exam eraser               ";
		stationary[23]="Camlin exam sharpener            ";
		stationary[24]="Camlin exam Geometry box         ";
		stationary[25]="Uniball Eye pen                  ";
		stationary[26]="Uniball Shakalu click pencil     ";
		stationary[27]="Reynolds Racer gel               ";
		stationary[28]="Reynolds Racer gel II            ";
		stationary[29]="Reynolds Trimax                  ";
		stationary[30]="Solo stick folder                ";
		stationary[31]="Solo writing pad                 ";
		stationary[32]="Solo Office Folder               ";
		stationary[33]="Classmate Notebook (Small)       ";
	    stationary[34]="Classmate Notebook (Medium)      ";
		stationary[35]="Classmate Notebook (Big)         ";
		
		cost2[1]=65.00;
		cost2[2]=70.50;
		cost2[3]=45.00;
		cost2[4]=29.00;
		cost2[5]=20.00;
		cost2[6]=950.00;
		cost2[7]=5.00;
		cost2[8]=5.00;
		cost2[9]=5.00;
		cost2[10]=50.00;
		cost2[11]=90.50;
		cost2[12]=20.50;
		cost2[13]=150.00;
		cost2[14]=5.50;
		cost2[15]=35.00;
		cost2[16]=40.00;
		cost2[17]=80.00;
		cost2[18]=30.00;
		cost2[19]=30.00;
		cost2[20]=55.00;
		cost2[21]=5.00;
		cost2[22]=5.00;
		cost2[23]=5.00;
		cost2[24]=90.00;
		cost2[25]=70.00;
		cost2[26]=125.00;
		cost2[27]=10.00;
		cost2[28]=10.00;
        cost2[29]=35.00;
        cost2[30]=30.00;
        cost2[31]=160.00;
        cost2[32]=50.00;
        cost2[33]=30.00;
        cost2[34]=45.00;
        cost2[35]=55.00;	   
	    	   
	    cloth[0]="  ";
	    cloth[1]=" H&M T-shirts for Men and Women                        ";
	    cloth[2]=" H&M Jackets                                           ";
	    cloth[3]=" H&M Hoodies and Pullovers for Men and Women           ";
	    cloth[4]=" Vera Moda Trousers                                    ";
	    cloth[5]=" Vera Moda Western Dresses for Women                   ";
	    cloth[6]=" Vera Moda Tees for Women                              ";
	    cloth[7]=" Levi's Jeans for Men and Women                        ";
	    cloth[8]=" Levi's Shirts for Men                                 ";
	    cloth[9]=" Levi's Polo's                                         ";
	    cloth[10]=" Levi's Tops for Women                                ";
	    cloth[11]=" Allen Solly Shirts                                   ";
	    cloth[12]=" Allen Solly Jeans                                    ";
	    cloth[13]=" Allen Solly Pants                                    ";
	    cloth[14]=" Allen Solly T-Shirts                                 ";
	    cloth[15]=" Westside Shirts for Men                              ";
	    cloth[16]=" Westside T-Shirts and Tops for Men and Women         ";
	    cloth[17]=" Lee Cooper Shirts for Men and Women                  ";
	    cloth[18]=" Lee Cooper T-Shirts for Men and Women                ";
	    cloth[19]=" Lee Cooper Pants and Trousers for Men and Women      ";
	    cloth[20]=" Soch Saree Orange with Gold border                   ";
	    cloth[21]=" Soch Saree Yellow Green Flower design                ";
	    cloth[22]=" Soch Saree Green with Yellow Flowers                 ";
	    cloth[23]=" Soch Ethnic Blue and Gold Lehnga                     ";
	    cloth[24]=" Soch Ethnic Pink and Gold Lehnga                     ";
	    
	    cost3[1]=1500.00;
	    cost3[2]=2400.00;
	    cost3[3]=1200.00;
	    cost3[4]=1800.00;
	    cost3[5]=1450.00;
	    cost3[6]=800.00;
	    cost3[7]=900.00;
	    cost3[8]=1100.00;
	    cost3[9]=750.00;
	    cost3[10]=800.00;
	    cost3[11]=1300.00;
	    cost3[12]=2000.00;
	    cost3[13]=1800.00;
	    cost3[14]=800.00;
	    cost3[15]=550.00;
	    cost3[16]=650.00;
	    cost3[17]=1100.00;
	    cost3[18]=800.00;
	    cost3[19]=1600.00;
	    cost3[20]=1700.00;
	    cost3[21]=1500.00;
	    cost3[22]=1500.00;
	    cost3[23]=1200.00;
	    cost3[24]=1400.00;
	    
	    electronic[0]=" ";
       	electronic[1]="HP Computer System       ";
		electronic[2]="Samsung computer system  ";
		electronic[3]="Dell Alienware           ";
		electronic[4]="Sony VAIO                ";
		electronic[5]="Sony VAIO Notebook       ";
		electronic[6]="HP Printer F2180         ";
		electronic[7]="HP Printer Inkjet F2100  ";
		electronic[8]="Dell laptop              ";
		electronic[9]="Acer Laptop              ";
		electronic[10]="Toshiba Laptop          ";
		electronic[11]="Hp Laptop               ";
	    electronic[12]="Acer notebook           ";
	    electronic[13]="Samsung Galaxy Tab      ";
	    electronic[14]="Apple Ipod Shuffle 8 GB ";
		electronic[15]="Apple Ipod Nano    8 GB ";
		electronic[16]="Apple Ipad Air 3        ";
		electronic[17]="Samsung Galaxy S7       ";
		electronic[18]="Samsung Galaxy S7 Egde  ";
		electronic[19]="Apple Iphone 6          ";
		electronic[20]="Apple Iphone 6 Plus     ";
		electronic[21]="Apple Iphone 7          ";
		
	    cost4[1]=40000.00;
		cost4[2]=40000.00;
		cost4[3]=100000.00;
		cost4[4]=75000.00;
		cost4[5]=30000.00;
		cost4[6]=2100.00;
		cost4[7]=3000.00;
		cost4[8]=20000.00;
		cost4[9]=12500.00;
		cost4[10]=14000.00;
		cost4[11]=35000.50;
		cost4[12]=30000.00;
		cost4[13]=30000.50;
		cost4[14]=8000.00;
        cost4[15]=10000.00;
        cost4[16]=20000.00;
        cost4[17]=42500.00;
        cost4[18]=42000.00;
        cost4[19]=37000.00;
        cost4[20]=42000.00;
        cost4[21]=70000.00;  
	    
	    	   
	}
	void display()throws IOException
          {
          	if(c==0)
          	{
          	System.out.println("--------------------------------------------");
          	System.out.println("-          WELCOME TO Auchan               -");
          	System.out.println("--------------------------------------------");
          	System.out.println();
          	System.out.println("If you want to shop in the Dairy section press 1");
          	System.out.println("If you want to shop in the Fruits and Vegetables section press 2");
          	System.out.println("If you want to shop in the Stationary section press 3");
          	System.out.println("If you want to shop in the Clothing section press 4");
          	System.out.println("If you want to shop in the Electronic section press 5");
          	ch=sc.nextInt();
          	switch(ch)
          	{
          	case 1:	
          	for(int i=1;i<20;i++)
          	{
          		System.out.println(i+" "+dairy[i]+" "+cost[i]);
          	}
          	break;
          	
          	case 2:
          	for(int i=1;i<35;i++)
          	{
          		System.out.println(i+" "+fruit[i]+" "+cost1[i]);
          	}
          	break;
          	
          	case 3:
          	for(int i=1;i<36;i++)
          	{
          		System.out.println(i+" "+stationary[i]+" "+cost2[i]);
          	}
          	break;
          	
          	case 4:
          	for(int i=1;i<25;i++)
          	{
          		System.out.println(i+" "+cloth[i]+" "+cost3[i]);
          	}
          	break;
          	
          	case 5:
          	for(int i=1;i<22;i++)
          	{
          		System.out.println(i+" "+electronic[i]+" "+cost4[i]);
          	}
          	break;
          	
          	default:
          		System.out.println("Invalid Choice");
          	}
          	}
          	

          System.out.println();
}
          void choice()
          {
          	if(ch==1)
          	{
          	for(int i=0;i<c;i++)
          	{
          		sel[i]=dairy[serial[i]];
          		price[i]=cost[serial[i]];
          		System.out.println((i+1)+" "+sel[i]+" "+quantity[i]);
          	}
            }
          if(ch==2)
          {
          	for(int i=0;i<c;i++)
          	{
          		sel[i]=fruit[serial[i]];
          		price[i]=cost1[serial[i]];
          		System.out.println((i+1)+" "+sel[i]+" "+quantity[i]);
          	}
          }
           if(ch==3)
          {
          	for(int i=0;i<c;i++)
          	{
          		sel[i]=stationary[serial[i]];
          		price[i]=cost2[serial[i]];
          		System.out.println((i+1)+" "+sel[i]+" "+quantity[i]);
          	}
          }
           if(ch==4)
          {
          	for(int i=0;i<c;i++)
          	{
          		sel[i]=cloth[serial[i]];
          		price[i]=cost3[serial[i]];
          		System.out.println((i+1)+" "+sel[i]+" "+quantity[i]);
          	}
          }
           if(ch==5)
          {
          	for(int i=0;i<c;i++)
          	{
          		sel[i]=electronic[serial[i]];
          		price[i]=cost4[serial[i]];
          		System.out.println((i+1)+" "+sel[i]+" "+quantity[i]);
          	}
          }
          }
          public void input()throws IOException
          {
          	for(int i=0;i<36;i++)
          	{
          		System.out.println("Enter choice of item");
          		serial[i]=sc.nextInt();
          		System.out.println("Enter quantity of item(in kg/piece)");
          		quantity [i]=sc.nextDouble();
          		c++;
          		System.out.println("Would you like to Enter again \nYes-1\nNo-2");
          		int m=sc.nextInt();
          		if(m==1)
          		display();
          		else
          		break;
          	}
          }
          void change()throws IOException
          {
          	int d=0,cnt=1;
          	do
          	{
          		System.out.println();
          		System.out.println("Press");
          		System.out.println("1.To add an item");
          		System.out.println("2.To delete an item");
          		System.out.println("3.To confirm bill");
          		int n=sc.nextInt();

          		switch(n)
          		{
          			case 1:
          			for(int i=c;i<35;i++)
          			{
          				display();
          				System.out.println("Enter choice of item");
          				serial[i]=sc.nextInt();
          				System.out.println("Enter quantity(in kg/piece)");
          				quantity[c]=sc.nextDouble();
          				sel[c]=dairy[serial[i]];
          				price[c]=cost[serial[i]];
          				c++;
                     	System.out.println("Would you like to Enter again \nYes-1\nNo-2");
          		int m=sc.nextInt();
          		if(m==1)
          		display();
          		else
          		break;


          			}
          				break;
          			case 2:

          				display();
          				System.out.println("Enter the serial number of item to be deleted");
          				serial[i]=sc.nextInt();
          				sel[serial[i]-1]="Deleted";
          				quantity[serial[i]-1]=0;
          		        break;
          		    case 3:System.out.println("Bill confirmed");
          		    		p=1;z = 1;membership();
          		        break;
          		    default:System.out.println("Try again");
          		 }
               }while(z==0);
          	}
          	void membership()throws IOException
          	{
          		System.out.println("Are you a member of our store?\nyes-1\nno-2");
          		int n=sc.nextInt();
          		if(n==1)
          		{
          			System.out.println("Would you like this amount to be debited to your account?\nyes-1\nno-2");
          			int r=sc.nextInt();
          			if(r==1)
          			{
          				System.out.println("This amount has been successfully debited to your account");
          				g="debited";bill();
          			 }
          			 if(r==2)
          			 {
          			   	System.out.println("Would you like to pay by \ncash-1\nAuchan Memebership Card-2");

          			   	int b=sc.nextInt();
          			   	if(b==1)
          			   	{
          			   		g="cash";
          			   	 bill();
          			   	}
          			   	if (b==2)
          			   	{
          			   		g="creditcard";


          			   	  bill();
          			   	}

          			   }

          		}
          		else
          		{if(n==2)
          			 {
          			   	System.out.println("Would you like to pay by \ncash-1\nAuchan Memebership Card-2");

          			 int b=sc.nextInt();
          			 if(b==1)
          			 {
          			   	g="cash";bill();
          			  }
          			  if (b==2)
          			  {
          			   	g="creditcard";bill();
          			   }

          			  }
          		}
          	}
             void bill()throws IOException
             {
             	System.out.println("Please enter your name");
             	name=sc.next();
             	if(c!=0)
             	{
             		System.out.println();
             		System.out.println();
             		System.out.println();            		
             		System.out.println("-------------------------------------------------------------------");
             		System.out.println("-   Bill No.223596\tCASH BILL                                     -");
             	    System.out.println("-   Ph.No:9985466322                                              -");
             		System.out.println("-      Auchan                                                     -");
             		System.out.println("-     Old Madras Rd                                               -");
             		System.out.println("-Name of customer:- "+name+"                                      -");
             		System.out.println("-Sl     Particulars                  Qty           Price           Amount-");
             		for(int i=0;i<c;i++)
             		{
             			System.out.println("*"+(i+1)+"    "+sel[i]+"     "+quantity[i]+"       "+price[i]+"      "+(quantity[i]*price[i])+"\t"+"         "+"*");
             			total=total+(quantity[i]*price[i]);
             		}
              		System.out.println("Do You want to play our lucky roller game");
             		System.out.println("Type '1' to play the game\nType '2' to continue to bill");
             		int game=sc.nextInt();
             		if(game==1)
             		{
             			game();
             		}
             		if(g.compareTo("cash")==0)
             		{
             			System.out.println("-\tStatus"+g                                                 +"-");
             	    System.out.println("-\tTotal:"+total                                           +"        -");
             		System.out.println("Enter the amount paid by customer");
             		amt=sc.nextInt();
             		change=amt-total;
             	    System.out.println("-\tAmount Paid:"+amt                                            +"        -");
             		System.out.println("-\tChange:"+change                                         +"        -");
             		System.out.println("-\tThank You!Come again.                                             -");
             		System.out.println("----------------------------------------------------------------------");
             	}
             else	if(g.compareTo("creditcard")==0 )
             	{
             		System.out.println("- \tTotal:\t\t\t\t"+total                                          +"-");
             		System.out.println("-\tThank You!Come again                                              -");

             		System.out.println("----------------------------------------------------------------------");
             	}
             	else
             	{
             		System.out.println("\tTotal:\t\t\t\t"+total);
             		System.out.println("Thank you!Come again.");
             	}
             	}
             }
              void game()throws IOException
          {
          	System.out.println("In this game you have to guess when Auchan was established.\nIf your guess is correct you win a prize along with gift vouchers from Auchan  ");
          	System.out.println("Type in your answer as to when Auchan was established ");
          	System.out.println("Enter your guess");
          	int guess=sc.nextInt();
          	int est=1961;
          	if(guess==est)
          	{
          		System.out.println("Your guess is correct. You have won an Ipod Shuffle worth Rs. 2499/- and Auchan Gift Voucher worth Rs. 1000/-");
          	}
          	else
          	{
          		System.out.println("Your guess is wrong. Auchan was established in "+est);
          	}
          }
          public static void main(String args[])throws IOException
          {
          	int check=0;
          	auchan obj=new auchan();
          	obj.items();
          	obj.display();
          	obj.input();
          	obj.choice();
          	obj.change();
}
}

