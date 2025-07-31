//
// This is only a SKELETON file for the 'OCR Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

const numbersArr = [
  " _ \n" + "| |\n" + "|_|\n" + "   ",
  "   \n" + "  |\n" + "  |\n" + "   ",
  " _ \n" + " _|\n" + "|_ \n" + "   ",
  " _ \n" + " _|\n" + " _|\n" + "   ",
  "   \n" + "|_|\n" + "  |\n" + "   ",
  " _ \n" + "|_ \n" + " _|\n" + "   ",
  " _ \n" + "|_ \n" + "|_|\n" + "   ",
  " _ \n" + "  |\n" + "  |\n" + "   ",
  " _ \n" + "|_|\n" + "|_|\n" + "   ",
  " _ \n" + "|_|\n" + " _|\n" + "   ",
];

export const convert = (input) => {
  if (input.length % 15 !== 0) {
    return Error();
  } else if (numbersArr.includes(input)) {
    return numbersArr.indexOf(input).toString();
  } else {
    return "?";
  }
};
