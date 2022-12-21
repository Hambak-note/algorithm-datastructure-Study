const sumRange = (num, sum) => {
  if (num === 1) return sum + 1;
  return sumRange(num - 1, sum + num);
};
