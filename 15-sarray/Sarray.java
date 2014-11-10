public class Sarray{
  
  int[] data;
  int last;
  
  public Sarray(){
    //set up the initial instance variables 
    data=new int[1];
    last=0;
  }
  
  public void grow(){
    int[] buffer=new int[data.length+1];
    for(int counter=0;counter<data.length;counter++){
      buffer[counter]=data[counter];
    }
    data=buffer;
  }
  
  public boolean add(int i){
    //adds an item to the end of the list, grow if needed
    //returns true
    if(last<data.length){
      data[last]=1;
      last+=1;
    }
    else{
      grow();
      add(1);
    }
    return true;
  }
  
  public void add(int index, int i){
    //adds item i at index, shifting everything down as needed
    //also grows as needed
    if(last<data.length){
      for(int counter=last-1;counter>=index;counter--){
        data[counter-1]=data[counter];
      }
      data[index]=i;
      last+=1;
    }
    else{
      grow();
      add(index, i)
    }
  }
  
  public int size(){
    //returns the number of items in the list(not the array size)
    return last;
  }
  
  public int get(int index){
    //returns the item at location index of the list
    if (index < last && index >= 0) {
	    return data[index];
	  } 
	  else {
	    return -1;
	  }
  }
  
  public int set(int index, int i){
    //sets the item at location index to value i
    //returns the old value
    if (index < last && index >= 0) {
	    int buffer = data[index];
	    data[index] = i;
	    return buffer;
	  } 
	  else {
	    return -1;
  	}
  }
  
  public int remove(int index){
    //removes the item at index i
    //returns the old value
    	if (index < last && index >= 0){
	    int buffer = data[index];
	    last -= 1;
	    for(int counter = index; counter < data.length; counter ++) {
		  if (counter < last) {
		    data[counter] = data[counter + 1];
		  } 
		  else {
		    data[counter] = 0;
		  }
	    }
	    return buffer;
    	}
	    else {
	    return -1;
	    }
  }
  
  
}
