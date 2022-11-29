const Node = class {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
};

const LinkedList = class {
  constructor(value) {
    if (value === undefined) {
      this.set(null, null);
    } else {
      const newNode = new Node(value);
      this.set(newNode, newNode);
    }
  }

  push(value) {
    if (value === undefined) return undefined;

    const newNode = new Node(value);

    if (this.head === null) {
      this.set(newNode, newNode);
      return this;
    }

    this.tail.next = newNode;
    this.setTail(this.tail.next);
    this.tail.next = null;
    return this;
  }

  pop() {
    if (this.head === null) return undefined;

    let result;
    if (this.head === this.tail) {
      result = this.tail;
      this.set(null, null);
      return result.value;
    }

    let pointer = this.head;
    while (pointer.next !== this.tail) pointer = pointer.next;
    result = this.tail;
    pointer.next = null;
    this.setTail(pointer);

    return result.value;
  }

  unshift(value) {
    if (this.validate(value)) return undefined;

    const newNode = new Node(value);

    if (this.head === null) {
      this.set(newNode, newNode);
      return this;
    }

    newNode.next = this.head;
    this.setHead(newNode);
    return this;
  }

  shift() {
    if (this.head === null) return undefined;

    let result;
    if (this.head === this.tail) {
      result = this.head;
      this.set(null, null);
      return result.value;
    }

    result = this.head;
    this.setHead(this.head.next);
    result.next = null;
    return result.value;
  }

  insert(index, value) {
    if (this.validate(index) || index < 0) return undefined;
    if (index === 0) return this.unshift(value);

    let pointer = this.head;

    while (index > 1) {
      if (!pointer) return undefined;
      pointer = pointer.next;
      index -= 1;
    }

    // if (pointer === this.tail) return this.push(value);

    const newNode = new Node(value);
    newNode.next = pointer.next;
    pointer.next = newNode;

    return this;
  }

  remove(index) {
    if (this.validate(index) || index < 0) return undefined;

    let pointer = this.head;
    if (index === 0) return this.shift();

    while (index > 1) {
      if (!pointer.next) return undefined;
      pointer = pointer.next;
      index -= 1;
    }

    // if (pointer.next === this.tail) return this.pop();

    let result = pointer.next;
    pointer.next = pointer.next.next;
    return result.value;
  }

  validate(...args) {
    return args.some((arg) => arg === undefined);
  }

  set(headNode, tailNode) {
    this.setHead(headNode);
    this.setTail(tailNode);
  }

  setHead(headNode) {
    if (headNode !== undefined) this.head = headNode;
  }

  setTail(tailNode) {
    if (tailNode !== undefined) this.tail = tailNode;
  }

  *[Symbol.iterator]() {
    let pointer = this.head;

    while (pointer) {
      yield pointer.value;
      pointer = pointer.next;
    }
    return;
  }
};

module.exports = LinkedList;
