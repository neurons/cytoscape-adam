package org.dishevelled.variation.adam;

import java.util.Map;

/**
*ADAM Record
*/

public final class ADAMRecord{
	// Are all of these variables needed from the ADAM format for cytoscape?
    private int mapq;
    private String readName;
    private String sequence;
    private String mateReference;
    private long mateAlignmentStart;
    //private String cigar;   not needed
    private String qual;
    private String recordGroupName;
    private int recordGroupId;

    private boolean readPaired = false;
    private boolean properPair = false;
    private boolean readMapped = false;
    private boolean mateMapped = false;
    private boolean readNegativeStrand = false;
    private boolean mateNegativeStrand = false;
    private boolean firstOfPair = false;
    private boolean secondOfPair = false;
    private boolean primaryAlignment = false;
    private boolean failedVendorQualityChecks = false;
    private boolean duplicateRead = false;

    /*private String mismatchingPositions;
    private String origQual;

    private String attributes;*/

    private String  recordGroupSequencingCenter = null;
    private String  recordGroupDescription = null;
    private long recordGroupRunDateEpoch = null;
    private String  recordGroupFlowOrder = null;
    private String  recordGroupKeySequence = null;
    private String recordGroupLibrary = null;
    private int recordGroupPredictedMedianInsertSize = null;
    private String  recordGroupPlatform = null;
    private String  recordGroupPlatformUnit = null;
    private String  recordGroupSample = null;

    // What about the ADAMContig
    //union { null, ADAMContig} mateContig = null;
    
    ADAMRecord(int mapq,
    	       String readName,
    	       String sequence,
    	       String mateReference,
    	       long mateAlignmentStart,
    	       String cigar,
    	       String qual,
    	       String recordGroupName,
    	       int recordGroupId
    		)
    {
    	this.mapq = mapq;
    	this.readName = readName;
    	this.sequence = sequence;
    	this.mateReference = mateReference;
    	this.mateAlignmentStart = mateAlignmentStart;
    	this.cigar = cigar;
    	this.qual = qual;
    	this.recordGroupName = recordGroupName;
    	this.recordGroupId = recordGroupId;
    	
    }
    
    public int getMapq(){
    	return mapq;
    }
    
    public String getReadName(){
    	return readName;	
    }
    
    public String getSequence(){
    	return sequence;
    }
    
    public String getMateReference(){
    	return mateReference;	
    }
    
    public long getMateAlignmentStart(){
    	mateAlignmentStart;
    }
    
    public String getCigar(){
    	return cigar;
    }
    
    public String getQual(){
    	return qual;
    }
    
    public String getRecordGroupName(){
    	return recordGroupName;
    }
    
    public int getrecordGroupId(){
    	return recordGroupId;
    }
}
