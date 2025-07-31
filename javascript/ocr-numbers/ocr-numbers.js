//
// This is only a SKELETON file for the 'OCR Numbers' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

import { skip } from "node:test";

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
  // if ((input.length - 6) % 3 !== 0) {
  //   return Error();
  // }

  if (input.length === 15 && numbersArr.includes(input)) {
    return numbersArr.indexOf(input).toString();
  } else if (input.length === 15 && !numbersArr.includes(input)) {
    return "?";
  }

  if (input.length > 15) {
    const array = [];
    let string = "";
    const digits = (input.length - 3) / 12;
    const digitsArray = new Array(digits).fill("");

    const rows = input.split("\n");

    rows.forEach((row) => {
      for (let i = 0; i < row.length; i++) {
        string += row[i];
        if ((i + 1) % 3 === 0) {
          array.push(string + "\n");
          string = "";
        }
      }
    });

    console.log(array);

    let loop = 0;
    for (let i = 0; i < array.length; i++) {
      digitsArray[loop] += array[i];
      if ((loop + 1) % digits !== 0) {
        loop++;
      } else {
        loop = 0;
      }
    }

    console.log(digitsArray);

    let returnString = "";
    for (let i = 0; i < digitsArray.length; i++) {
      const number = digitsArray[i].slice(0, -1);
      console.log(number);
      if (numbersArr.includes(number)) {
        returnString += numbersArr.indexOf(number).toString();
      } else {
        returnString += "?";
      }
    }
    return returnString;
  }
};
