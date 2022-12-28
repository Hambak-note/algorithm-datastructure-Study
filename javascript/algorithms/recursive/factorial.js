const factorial = (num, result = 1) => {
  if (num === 1) return result;

  return factorial(num - 1, num * result);
};

factorial(4); //?
