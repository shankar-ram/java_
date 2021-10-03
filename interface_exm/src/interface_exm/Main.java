package interface_exm;

interface InterfaceOne{
	public void display();
}
interface InterfaceTwo{
	public void display();
}
class Main implements InterfaceOne,InterfaceTwo{
	public void display(){
		System.out.println("Display() method implementation");
	}
	public static void main(String args[]){
		Main obj = new Main();
		obj.display();
	}
}
