const naiveSearch = (allString, toFind) => {
  const toFindLength = toFind.length;

  const indexList = [...allString].reduce((acc, character, index) => {
    if (character === toFind[0] && allString.slice(index, index + toFindLength) === toFind) {
      acc.push(index);
    }

    return acc;
  }, []);

  return indexList.shift() ?? -1;
};

module.exports = naiveSearch;
