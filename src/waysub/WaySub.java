package waysub;

import java.util.Scanner;
public class WaySub {



	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionPan;
        int opcionIngredientes;
        
        
        System.out.println("Bienvenido a WaySub, ademas de nuestros deliciosos baguettes, \n"
        		+ " ahora tambien ofrecemos pizzas.");
        System.out.println("Elija una opcion para ordenar: ");

        do {
            System.out.println(
            				"1 .- BAGUETTE \n" +
                            "2 .- PIZZA \n" +
                            "0 .- SALIR \n");
            while (true) {
                try {
                    String opcionUsser = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsser);
                    break;
                } catch (NumberFormatException nfe) { 
                    System.out.println("Por favor elige una opción valida \n" +
                    		"1 .- BAGUETTE \n" +
                            "2 .- PIZZA \n" +
                            "0 .- SALIR \n");
                }
            }

            switch (opcion) {
            
                case 1: //Si se elije la opcion 1, se crea un Baguette, se pide el tipo de pan y se da la opcion de agregar ingredientes
                	Baguettes baguette0 = new Baguette();
                	
	                System.out.println("Elija el tipo de pan: \n"+
	            				"1 .- Pan Blanco \n" +
	                            "2 .- Pan  Integral \n" +
	                            "3 .- Pan con Avena \n" +
	                			"0 .- SALIR \n");
		            while (true) {
		                try {
		                    String opcionUsser = sc.nextLine();
		                    opcionPan = Integer.parseInt(opcionUsser);
		                    break;
		                } catch (NumberFormatException nfe) { 
		                    System.out.println("Por favor elige una opción valida \n" +
		            				"1 .- Pan Blanco \n" +
		                            "2 .- Pan  Integral \n" +
		                            "3 .- Pan con Avena \n" +
		                			"0 .- SALIR \n");
		                }
		                
	                }
		            
		            switch (opcionPan) {
		            case 1://Si se elije la opcion 1, se agrega Pan Blanco como ingrediente
		            	baguette0 = new PanBlanco(baguette0);
		            	break;
		            
	                case 2://Si se elije la opcion 2, se agrega Pan Integral como ingrediente
		            	baguette0 = new Panintegral(baguette0);
		            	break;
		            	
	                case 3://Si se elije la opcion 3, se agrega Pan de Avena como ingrediente
		            	baguette0 = new PanAvena(baguette0);
		            	break;
		            }
		            
		            
		            
		            
		            /**
		             * Pedimos que ingrese ingredientes y segun el caso los creamos
		             */
		            do {
		            	System.out.println("Elija los ingredientes (tantos como quiera, pero uno a la vez): \n"+
	            				"1 .- Catsup \n" +
	                            "2 .- Mayonesa \n" +
	                            "3 .- Mostaza \n" +
	                            "4 .- Pollo \n" +
	                            "5 .- Pepperoni \n" +
	                            "6 .- Cebolla \n" +
	                            "7 .- Jitomate \n" +
	                            "8 .- Jamon \n" +
	                            "9 .- Lechuga \n" +
	                			"0 .- ORDENAR \n");
			            while (true) {
			                try {
			                    String opcionUsser = sc.nextLine();
			                    opcionIngredientes = Integer.parseInt(opcionUsser);
			                    break;
			                } catch (NumberFormatException nfe) { 
			                    System.out.println("Por favor elige una opción valida \n" +
			                    		"1 .- Catsup \n" +
			                            "2 .- Mayonesa \n" +
			                            "3 .- Mostaza \n" +
			                            "4 .- Pollo \n" +
			                            "5 .- Pepperoni \n" +
			                            "6 .- Cebolla \n" +
			                            "7 .- Jitomate \n" +
			                            "8 .- Jamon \n" +
			                            "9 .- Lechuga \n" +
			                			"0 .- ORDENAR \n");
			                }
			                
		                }
			            
			            switch (opcionIngredientes) {
			            case 1://Si se elije la opcion 1, se agrega CAtsup como ingrediente
			            	baguette0 = new Catsup(baguette0);
			            	break;
			            
		                case 2://Si se elije la opcion 2, se agrega Mayonesa como ingrediente
			            	baguette0 = new Mayonesa(baguette0);
			            	break;
			            	
		                case 3://Si se elije la opcion 3, se agrega Mostaza como ingrediente
			            	baguette0 = new Mostaza(baguette0);
			            	break;
			            	
		                case 4://Se agrega Pollo como ingrediente
			            	baguette0 = new Pollo(baguette0);
			            	break;
		                case 5://Se agrega Pepperoi como ingrediente
			            	baguette0 = new Pepperoni(baguette0);
			            	break;
		                case 6://Se agrega Cebolla como ingrediente
			            	baguette0 = new Cebolla(baguette0);
			            	break;
		                case 7://Se agrega JItomate como ingrediente
			            	baguette0 = new Jitomate(baguette0);
			            	break;
		                case 8://Se agrega Jamon como ingrediente
			            	baguette0 = new Jamon(baguette0);
			            	break;
		                case 9://Se agrega Lechuga como ingrediente
			            	baguette0 = new Lechuga(baguette0);
			            	break;
		                case 0:
			            	break;
			            }
		            }while (opcionIngredientes !=0);
		            
		           
		            /**
		             * Se imprime la descripcion del baguette seguida de su costo.
		             */
		            System.out.printf(baguette0.getDescripcion()+ " $ %.2f" + " \n", baguette0.costo() );
		            
                    break;
                    
                    
                case 2:
                	
                	//AQUI VA EL ALGORITMO PARA ORDENAR UNA PIZZA
       
                    break;
                case 0:
                    break; 
                default:
                    System.out.println("Elija una opcion valida: ");
                    break;
            }

        } while (opcion != 0);
		
		
		
		
		
		
		
		
		
		Baguettes platillo = new Baguette(); 
		System.out.printf(platillo.getDescripcion()+ " $ %.2f" + " \n", platillo.costo() );
		//Ordenamos un baguette e imprimimos su descripcion
		
		Baguettes platillo0 = new Baguette(); 
		platillo0 = new Catsup(platillo0);
		System.out.printf(platillo0.getDescripcion()+ " $ %.2f" + " \n", platillo0.costo());
		
		Baguettes platillo1 = new Baguette(); 
		platillo1 = new Catsup(platillo1);
		platillo1 = new Mostaza(platillo1);
		platillo1 = new Pollo(platillo1);
		System.out.printf(platillo1.getDescripcion()+ " $ %.2f" + " \n", platillo1.costo());
		
		Pizza pizza1 = new PizzaHawaiana();
		System.out.println(pizza1.getDescripcion() + " $ "+ pizza1.costo());
		
		
		PizzaHawaiana pizza2 = new PizzaHawaiana();
		Baguettes pizza2A = new AdaptadorPizza(pizza2); 
		System.out.printf(pizza2A.getDescripcion()+ " $ %.2f" + " \n", pizza2A.costo() );
		
		PizzaDobleQueso pizza3 = new PizzaDobleQueso();
		Baguettes pizza3A = new AdaptadorPizza(pizza3); 
		System.out.printf(pizza3A.getDescripcion()+ " $ %.2f" + " \n", pizza3A.costo() );
		
		PizzaCasa pizza6 = new PizzaCasa();
		Baguettes pizza6A = new AdaptadorPizza(pizza6); 
		System.out.printf(pizza6A.getDescripcion()+ " $ %.2f" + " \n", pizza6A.costo() );
		
		PizzaSalchicha pizza5 = new PizzaSalchicha();
		Baguettes pizza5A = new AdaptadorPizza(pizza5); 
		System.out.printf(pizza5A.getDescripcion()+ " $ %.2f" + " \n", pizza5A.costo() );
		
		PizzaEspecial pizza4 = new PizzaEspecial();
		Baguettes pizza4A = new AdaptadorPizza(pizza4); 
		System.out.printf(pizza4A.getDescripcion()+ " $ %.2f" + " \n", pizza4A.costo() );
	}

}


