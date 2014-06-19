public class AdamVariant{
  	private AdamContig contig;
  	private String position;
  	private String exclusiveEnd;
  	private String referenceAllele;
  	private String variantAllele;

  	public ADAMVariant()
  	{
  
  	}
  
  	public void setContig(Contig contig)
  	{
  		this.contig = contig;
  	}
  	
  	public void setPosition(String position)
  	{
  		this.position = position;
  	}
  
  	public void setExclusiveEnd(String exclusiveEnd)
  	{
  		this.exclusiveEnd = exclusiveEnd;
  	}
  
  	public void setReferenceAllele(String referenceAllele)
  	{
  		this.referenceAllele = referenceAllele;
  	}
  
  	public void setVariantAllele(String variantAllele)
  	{
  		this.variantAllele = variantAllele;
  	}

}
