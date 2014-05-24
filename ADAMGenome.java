package org.dishevelled.variation.adam;

public final class ADAMGenome
{

private final String id;
private final String description; // ADAM description 
//attributes remainign to do --> TO-DO

    ADAMGenome(String id, String description){
      this.id = id;
      this.description = description;
    }
    
    public String getID(){
      return id;
    }
    
    public String getDescription()
    {
        return description;
    }
}
