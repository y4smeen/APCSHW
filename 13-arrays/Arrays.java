public int[] frontPiece(int[] nums) {
  if (nums.length>=2){
  int[] x;
  x = new int[2];
  for (int i=0;i<2;i++){
  x[i] = nums[i];
  }
  return x;
  }
  else{
  return nums;
  }
}

public int sum13(int[] nums) {
int sum=0;
  for(int i=0;i<nums.length;i++){
  if(nums[i]!=13){
  sum += nums[i];
  }
  else i++;
  }
  return sum;
}
