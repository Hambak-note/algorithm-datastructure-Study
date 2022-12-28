const linearSearch = require('./linearSearch');

describe('linearSearch 클래스 테스트', () => {
  test('[1,4,5,3,4] , 4', () => {
    expect(linearSearch([1, 4, 5, 3, 4], 4)).toBe(1);
  });

  test('[1,4,5,3,4] , 100', () => {
    expect(linearSearch([1, 4, 5, 3, 4], 100)).toBe(-1);
  });

  test(`['abc','dce','ukko','dfa','asf'] , 'ukko'`, () => {
    expect(linearSearch(['abc', 'dce', 'ukko', 'dfa', 'asf'], 'ukko')).toBe(2);
  });
});
