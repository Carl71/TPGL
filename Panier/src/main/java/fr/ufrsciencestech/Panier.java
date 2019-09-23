import java.util.List;

public class Panier
{

	private List<Orange> list;
	
	public Panier()
	{
		this.list = new List<Orange>();
	}

	public void AjoutOrange(Orange a)
	{
		list.add(a);
	}
}
