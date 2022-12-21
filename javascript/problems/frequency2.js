const same = (numbers, comparingNumbers) => {
  if (numbers.length !== comparingNumbers.length) {
    return false;
  }

  const getCountMap = (arr) => {
    let countMap = {};

    arr.forEach((elem) => {
      countMap[elem] = (countMap[elem] ?? 0) + 1;
    });

    return countMap;
  };

  const numbersCountMap = getCountMap(numbers);
  const comparingNumbersCountMap = getCountMap(comparingNumbers);

  if (Object.keys(numbersCountMap).length !== Object.keys(comparingNumbersCountMap).length) {
    return false;
  }

  for (const key of Object.keys(numbersCountMap)) {
    if (numbersCountMap[key] !== comparingNumbersCountMap[key ** 2]) {
      return false;
    }
  }

  return true;
};
