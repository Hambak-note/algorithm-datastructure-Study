const binarySearch = require('./binarySearch');

describe('binarySearch 클래스 테스트', () => {
  test('배열에 요소가 존재하는 경우', () => {
    expect(binarySearch([2, 4, 5, 10, 13, 15, 28, 30], 15)).toBe(5);
  });
  test('찾는 요소가 없는 경우', () => {
    expect(binarySearch([2, 4, 5, 10, 13, 15, 28, 30], 100)).toBe(-1);
  });

  test('배열이 없을 경우', () => {
    expect(binarySearch([], 1)).toBe(-1);
  });

  test('배열 요소가 하나일 경우', () => {
    expect(binarySearch([1], 1)).toBe(0);
  });
});
