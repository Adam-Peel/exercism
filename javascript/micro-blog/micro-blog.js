//
// This is only a SKELETON file for the 'Micro-blog' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const truncate = (input) => {
  const iterator = input[Symbol.iterator]();
  let nextChar = iterator.next();
  let str = "";
  let count = 0;

  while (!nextChar.done && count < 5) {
    str += nextChar.value;
    nextChar = iterator.next();
    count++;
  }
  return str;
};
