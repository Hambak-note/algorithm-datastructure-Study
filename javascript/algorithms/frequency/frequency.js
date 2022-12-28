const getNumbersSqrt = (numbers) => numbers.map((number) => number ** 2);

const same = (numbers, comparingNumbers) => {
  let result = true;

  if (!Array.isArray(numbers) || !Array.isArray(comparingNumbers)) return false;

  if (numbers.length !== comparingNumbers.length) return false;

  const numbersSquaredSorted = getNumbersSqrt(numbers).sort((a, b) => a - b);
  const comparingNumbersSorted = [...comparingNumbers].sort((a, b) => a - b);

  numbersSquaredSorted.forEach((number, index) => {
    if (number !== comparingNumbersSorted[index]) result = false;
  });

  return result;
};

same([1, 2, 10], [4, 1, 100]); //?
