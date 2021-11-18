package javaAssignment2_Persistence;

public abstract class Persistence 
{
	abstract void persist();
}
public class FilePersistence extends Persistence {
	@Override
	void persist()
	{
		System.out.println("The Data is Saved In The File..");
	}

}
