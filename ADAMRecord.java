package org.dishevelled.variation.adam;


/**
*ADAM Record
*/

public final class ADAMRecord{
// include the 4 attributes from ADAMVariant from adam.avdl file.

private String contig; //In adam.avdl, there is a struct called ADAMContig; replicate?
private long position;
private String referenceAllele;
private String variantAllele;

    
    ADAMRecord(String contig,
    	       long position,
    	       String referenceAllele,
    	       String variantAllele,
    	      )
    {
	this.contig = contig;
	this.position = position;
	this.referenceAllele = referenceAllele;
	this.variantAllele = variantAllele;
    }
    
    public String getContig()
    {
    	return contig;
    }
    
    public long getPosition()
    {
    	return position;	
    }
    
    public String getreferenceAllele()
    {
    	return referenceAllele;
    }
    
    public String getVariantAllele()
    {
    	return variantAllele;	
    }
   
}
