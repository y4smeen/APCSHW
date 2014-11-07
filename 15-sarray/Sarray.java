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
  }
  
  public int get(int index){
    //returns the item at location index of the list
  }
  
  public int set(int index, int i){
    //sets the item at location index to value i
    //returns the old value
  }
  
  public int remove(int index){
    //removes the item at index i
    //returns the old value
  }
  
  
}
