public int sum67(int[] nums) {
  int sum = 0;
  int counter = 0;
  boolean x = true;
  while (counter < nums.length){
  if (x == true && nums[counter]!=6){
  sum += nums[counter];
  }
  if (x == true && nums[counter]==6){
  x = false;
  }
  if (x == false && nums[counter]==7){
  x = true;
  }
  counter += 1;
  }
  return sum;
}
public boolean more14(int[] nums) {
  int o=0;
  int f=0;
  for (int i=0; i<nums.length; i++){
  if (nums[i]==1){
  o++;
  }
  if (nums[i]==4){
  f++;
  }
  }
  return o > f;
}
public boolean tripleUp(int[] nums) {
  int count = 0;
  boolean x = false;
  for (count = 0; count <= nums.length-3; count ++){
  if (nums[count+1] == nums[count] + 1 && nums[count+2] == nums[count] + 2){
  x = true;
  }
  }
  return x;
}

