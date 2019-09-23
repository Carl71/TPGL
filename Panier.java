public class Panier
{

	private List<Orange> list;
	
	public Panier()
	{
		this.list = new Arraylist<Orange>();
	}

	public void AjoutOrange(Orange a)
	{
		list.add(a);
	}
}
