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
