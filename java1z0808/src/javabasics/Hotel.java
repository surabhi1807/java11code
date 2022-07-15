package javabasics;

public class Hotel {
	String name ="plaza";
	String place = "benglore";
    int cost =5000;
    int rooms =100;
    void parking() {System.out.println("Hotel can parking");}
    void roomservice() {System.out.println("Hotel can roomservice");}
    void healthybreakfast() {System.out.println("Hotel can healthybreakfast");}
    
  
    public static void main(String[] args) {
		Hotel h =new Hotel();
		System.out.println(h.name);
		System.out.println(h.place);
		System.out.println(h.cost);
		System.out.println(h.rooms);
		h.parking();
		h.roomservice();
		h.healthybreakfast();
		
    }
    
		
}



