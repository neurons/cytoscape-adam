public class AdamContig{
	private String name;
	private long  contigLength;
	private String reference;
	private String species;
	

	public ADAMContig(String name, long contigLength, String reference, String species)
	{
		this.name = name;
		this.contigLength = contigLength;
		this.reference = reference;
		this.species = species;
	}

	public void setContigName(String name)
	{
		this.name = name;
	}

	public void setContigLength(long length)
	{
		this.contigLength = length;
	}

	public void setAssembly(String reference)
	{
		this.reference = reference;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

}
