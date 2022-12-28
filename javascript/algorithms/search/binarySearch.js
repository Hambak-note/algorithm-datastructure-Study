const binarySearch = (list, toFind) => {
  let left = 0;
  let right = list.length - 1;
  let middle = Math.floor((left + right) / 2);

  while (list[middle] !== toFind) {
    if (left >= right && list[middle] !== toFind) return -1;

    if (list[middle] > toFind) {
      right = middle - 1;
    } else {
      left = middle + 1;
    }

    middle = Math.floor((left + right) / 2); //?
  }
  return middle;
};

module.exports = binarySearch;
