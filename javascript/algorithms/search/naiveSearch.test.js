const naiveSearch = require('./naiveSearch');

describe('naiveSearch 테스트', () => {
  test('전체 문자열에서 부분 문자열을 탐색할 수 있는 경우', () => {
    expect(naiveSearch('helloWorld!', 'll')).toBe(2);
  });

  test('전체 문자열에서 부분 문자열이 없는 경우', () => {
    expect(naiveSearch('helloWorld!', 'z')).toBe(-1);
  });

  test('찾으려는 부분 문자열이 빈 문자열일 경우', () => {
    expect(naiveSearch('helloWorld!', '')).toBe(-1);
  });

  test('전체 문자열이 빈 문자열일 경우', () => {
    expect(naiveSearch('', 'll')).toBe(-1);
  });
});
