
abstract class Writer
{
	public abstract void write();
	
	public void show()
	{
		System.out.println("Abstract Class - Non Abstract Method");
		System.out.println("Hello World");
	}

}

class Pen extends Writer
{
	public void write() 
	{
		System.out.println("Writing using Pen");
	}
}

class Pencil extends Writer
{
	public void write() 
	{
		System.out.println("Writing using Pencil");
	}
}
public class Abstract {

	public static void main(String[] args)
	{
		Writer penObj = new Pen();
		penObj.write();
		penObj.show();
		
		Writer pencilObj = new Pencil();
		pencilObj.write();
		pencilObj.show();
		
	}
}
