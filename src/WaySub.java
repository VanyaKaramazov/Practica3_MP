package src;

import java.util.Scanner;



/** 
 * Clase que representa al restaurante WaySub, 
 * muestra un menu interactivo e instancia los platillos.
 * Permite ordenar Baguettes y pizzas que se adaptan a la interface Baguettes para que se muestren los ingredientes
 * como se  hace para los baguettes
 * @author debian
 *
 */

public class WaySub {



	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionPan;
        int opcionIngredientes;
        int opcionPizza;
        
        
        System.out.println("Bienvenido a WaySub, ademas de nuestros deliciosos baguettes, \n"
        		+ "ahora tambien ofrecemos pizzas.");

        do {
            System.out.println("Elija una opcion para ordenar: \n"+
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
	            				"1 .- Pan Blanco $10\n" +
	                            "2 .- Pan  Integral $20\n" +
	                            "3 .- Pan con Avena $15\n" +
	                			"0 .- SALIR \n");
		            while (true) {
		                try {
		                    String opcionUsser = sc.nextLine();
		                    opcionPan = Integer.parseInt(opcionUsser);
		                    break;
		                } catch (NumberFormatException nfe) { 
		                    System.out.println("Por favor elige una opción valida \n" +
		            				"1 .- Pan Blanco $10\n" +
		                            "2 .- Pan  Integral $20\n" +
		                            "3 .- Pan con Avena $15\n" +
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
	            				"1 .- Catsup $5\n" +
	                            "2 .- Mayonesa $5\n" +
	                            "3 .- Mostaza $5 \n" +
	                            "4 .- Pollo $20\n" +
	                            "5 .- Pepperoni $25\n" +
	                            "6 .- Cebolla $7\n" +
	                            "7 .- Jitomate $10\n" +
	                            "8 .- Jamon $15\n" +
	                            "9 .- Lechuga $10\n" +
	                			"0 .- ORDENAR \n");
			            while (true) {
			                try {
			                    String opcionUsser = sc.nextLine();
			                    opcionIngredientes = Integer.parseInt(opcionUsser);
			                    break;
			                } catch (NumberFormatException nfe) { 
			                    System.out.println("Por favor elige una opción valida \n" +
			                    		"1 .- Catsup $5\n" +
			                            "2 .- Mayonesa $5\n" +
			                            "3 .- Mostaza $5 \n" +
			                            "4 .- Pollo $20\n" +
			                            "5 .- Pepperoni $25\n" +
			                            "6 .- Cebolla $7\n" +
			                            "7 .- Jitomate $10\n" +
			                            "8 .- Jamon $15\n" +
			                            "9 .- Lechuga $10\n" +
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
		             * Se imprime la descripcion del baguette, seguida de su costo.
		             */
		            System.out.printf(baguette0.getDescripcion()+ " $ %.2f" + " \n", baguette0.costo() );
		            
                    break;
                    
                    
                case 2: //AQUI VA EL ALGORITMO PARA ORDENAR UNA PIZZA
                	
                	
                	do {
                		
                		 System.out.println("Elija la pizza que desea ordenar: \n"+
 	            				"1 .- Pizza Hawaiana $100.00\n" +
 	                            "2 .- Pizza Doble Queso $140.00 \n" +
 	                            "3 .- Pizza de la Casa $160.00 \n" +
 	                            "4 .- Pizza Especial $200.00 \n" +
 	                            "5 .- Pizza Salchicha $120.00 \n" +
 	                			"0 .- SALIR \n");
 		            while (true) {
 		                try {
 		                    String opcionUsser = sc.nextLine();
 		                    opcionPizza = Integer.parseInt(opcionUsser);
 		                    break;
 		                } catch (NumberFormatException nfe) { 
 		                    System.out.println("Por favor elige una opción valida \n" +
 		                    		"Elija la pizza que desea ordenar: \n"+
 		            				"1 .- Pizza Hawaiana $100.00\n" +
 		                            "2 .- Pizza Doble Queso $140.00 \n" +
 		                            "3 .- Pizza de la Casa $160.00 \n" +
 		                            "4 .- Pizza Especial $200.00 \n" +
 		                            "5 .- Pizza Salchicha $120.00 \n" +
 		                			"0 .- SALIR \n");
 		                }
 		                
 	                }
 		            
 		            switch (opcionPizza) {
 		            case 1://Si se elije la opcion 1, se crea una pizza Hawaiana
 		            	Pizza pizzaH = new PizzaHawaiana();
 		            	Baguettes pizzaHA = new AdaptadorPizza(pizzaH);
 		            	System.out.println(pizzaHA.getDescripcion() + " $ "+ pizzaHA.costo());
 		            	break;
 		            
 	                case 2://Si se elije la opcion 2, se agrega Pan Integral como ingrediente
 	                	Pizza pizzaDQ = new PizzaDobleQueso();
 	                	Baguettes pizzaDQA = new AdaptadorPizza(pizzaDQ);
 	                	System.out.println(pizzaDQA.getDescripcion() + " $ "+ pizzaDQA.costo());
 		            	break;
 		            	
 	                case 3://Si se elije la opcion 3, se agrega Pan de Avena como ingrediente
 	                	Pizza pizzaC = new PizzaCasa();
 	                	Baguettes pizzaCA = new AdaptadorPizza(pizzaC);
 	                	System.out.println(pizzaCA.getDescripcion() + " $ "+ pizzaCA.costo());
 		            	break;
 		            	
 	                case 4://Si se elije la opcion 2, se agrega Pan Integral como ingrediente
 	                	Pizza pizzaE = new PizzaEspecial();
 	                	Baguettes pizzaEA = new AdaptadorPizza(pizzaE);
 	                	System.out.println(pizzaEA.getDescripcion() + " $ "+ pizzaEA.costo());
 		            	break;
 		            	
 	                case 5://Si se elije la opcion 3, se agrega Pan de Avena como ingrediente
 	                	Pizza pizzaS = new PizzaSalchicha();
 	                	Baguettes pizzaSA = new AdaptadorPizza(pizzaS);
 	                	System.out.println(pizzaSA.getDescripcion() + " $ "+ pizzaSA.costo());
 		            	break;
 		            }
                		
                	}while(opcionPizza != 0);
                	
                    break;
                case 0:
                    break; 
                default:
                    System.out.println("Elija una opcion valida: ");
                    break;
            }

        } while (opcion != 0);

	}

}



































