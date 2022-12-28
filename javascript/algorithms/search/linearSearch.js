const linearSearch = (list, toFind) => {
  const indexList = list.reduce((acc, elem, index) => {
    if (elem === toFind) {
      acc.push(index);
    }
    return acc;
  }, []);

  return indexList.shift() || -1;
};

module.exports = linearSearch;
