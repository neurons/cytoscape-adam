/*

    dsh-variation  Variation.
    Copyright (c) 2013-2014 held jointly by the individual authors.

    This library is free software; you can redistribute it and/or modify it
    under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation; either version 3 of the License, or (at
    your option) any later version.

    This library is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
    FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
    License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this library;  if not, write to the Free Software Foundation,
    Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.

    > http://www.fsf.org/licensing/licenses/lgpl.html
    > http://www.opensource.org/licenses/lgpl-license.php

*/
package org.dishevelled.variation.adam;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;


import org.dishevelled.variation.Feature;
import org.dishevelled.variation.Variation;
import org.dishevelled.variation.VariationService;

import org.apache.spark.SparkContext // add to Maven buld 

/**
 * ADAM file variation service.
 */

public final class AdamVariationService implements VariationService
{
    private final String species;
    private final String reference;
    private final File file; // would this be an .avdl file?

    public AdamVariationService(final String species, final String reference, final File file)
    {
    checkNotNull(species);
    checkNotNull(reference);
    checkNotNull(file);
    }

    @Override
    public List<Variation> variations(final Feature feature)
    {
        checkNotNull(feature);
        checkArgument(species.equals(feature.getSpecies()));
        checkArgument(reference.equals(feature.getReference()));

        
        final List<Variation> variations = new ArrayList<Variation>(); // ArrayList of Variation to be returned 
        try
        {
            // Implementation 1
            ADAMReader.stream(Files.newReaderSupplier); // to-do
            
            
            
            
        }
        catch (IOException e)
        {
            // todo
        }
        return variations;
    }
    
    public AdamVariant ConvertNullADAMVariant()
    {
    	
    }
    
    public AdamVariant convertEmptyAdamVariant()
    {
    	
    }
    
    public convertADAMVariant()
    {
        ADAMContig contig = new ADAMContig();

    }

    public Variation convert(AdamVariant variant)
    {
       // use Adam Parser from Matt  
       // todo -- use AdamContig and AdamVariant to create a Variation

        Variation variationtoReturn = new Variation;

        // how to convert from AdamVariant to a Variation

        variationtoReturn.getSpecies();
        variationtoReturn.getReference();


        
        /*
        private final String species;
        private final String reference;
        private final List<String> identifiers; // e.g. dbSNP id
        private final String referenceAllele;
        private final List<String> alternateAlleles;
        private final String region;
        private final int start;
        private final int end;
        */
    }
    
    
    
    public AdamContig convertMissingContig()
    {
    	

    }
    
   
}
