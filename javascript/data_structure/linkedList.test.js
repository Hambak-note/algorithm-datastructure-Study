const LinkedList = require('./linkedList');

describe('Linked List Normal Case', () => {
  const linkedList = new LinkedList();

  test('constructor', () => {
    expect([...linkedList]).toEqual([]);
  });

  test('push', () => {
    let i = 0;
    while (i < 10) {
      linkedList.push(i);
      i++;
    }
    expect([...linkedList]).toEqual([0, 1, 2, 3, 4, 5, 6, 7, 8, 9]);
  });

  test('push', () => {
    let i = 0;
    while (i < 3) {
      linkedList.pop();
      i++;
    }
    expect([...linkedList]).toEqual([0, 1, 2, 3, 4, 5, 6]);
  });

  test('unshift', () => {
    let i = -1;
    while (i > -5) {
      linkedList.unshift(i);
      i--;
    }
    expect([...linkedList]).toEqual([-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6]);
  });

  test('shift', () => {
    let i = 0;
    while (i < 3) {
      linkedList.shift();
      i++;
    }
    expect([...linkedList]).toEqual([-1, 0, 1, 2, 3, 4, 5, 6]);
  });

  test('insert', () => {
    linkedList.insert(2, 1000);
    expect([...linkedList]).toEqual([-1, 0, 1000, 1, 2, 3, 4, 5, 6]);
  });

  test('remove', () => {
    linkedList.remove(2);
    expect([...linkedList]).toEqual([-1, 0, 1, 2, 3, 4, 5, 6]);
  });
});

describe('edge case', () => {
  const linkedList = new LinkedList();

  beforeEach(() => {
    linkedList.push('new');
  });

  test('pop', () => {
    expect(linkedList.pop()).toBe('new');
    expect(linkedList.pop()).toBe(undefined);
  });

  test('shift', () => {
    expect(linkedList.shift()).toBe('new');
    expect(linkedList.shift()).toBe(undefined);
  });

  test('remove', () => {
    linkedList.push('new2');
    expect(linkedList.remove(1)).toBe('new2');
    expect(linkedList.remove(0)).toBe('new');
    expect(linkedList.remove(0)).toBe(undefined);
  });

  test('insert', () => {
    linkedList.pop();
    expect([...linkedList.insert(0, 1)]).toEqual([1]);
    expect([...linkedList.insert(0, 0)]).toEqual([0, 1]);
    expect([...linkedList.insert(2, 2)]).toEqual([0, 1, 2]);
  });
});
